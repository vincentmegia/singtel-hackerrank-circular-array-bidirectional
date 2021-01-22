package org.example;

public class CircularArrayBidirectional {
    /** AZGB = 13
     * Circular Array problem where every move is equilavent to 1 sec,
     * Moves can be left or right
     * @param input
     * @return ATJZB
     */
    public int process(String input) {
        String[] inputTokens = input.split("");
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] alphabetTokens = alphabet.split("");
        int startingPoint = 0;
        int rPointer = startingPoint;
        int lPointer = startingPoint;
        int totalMoves = 0;
        for (String inputToken : inputTokens) {
            int rCounter = 0;
            int lCounter = 0;
            int moveToRightCount = 0;
            int moveToLeftCount = 0;
            while (!inputToken.equals(alphabetTokens[rPointer])) {
                rPointer++;
                rCounter++;
                if (rPointer >= alphabetTokens.length) {
                    alphabet += alphabet;
                    alphabetTokens = alphabet.split("");
                }
            }
            moveToRightCount += rCounter;

            //move to left
            while (!inputToken.equals(alphabetTokens[lPointer])) {
                lPointer--;
                lCounter++;
                if (lPointer <= 0) {
                    lPointer += 26;
                    alphabet += alphabet;
                    alphabetTokens = alphabet.split("");
                }
            }
            moveToLeftCount += lCounter;

            if (moveToLeftCount < moveToRightCount) {
                totalMoves += moveToLeftCount;
                rPointer = lPointer;
            } else {
                totalMoves += moveToRightCount;
                lPointer = rPointer;
            }
        }
        return totalMoves;
    }
}
