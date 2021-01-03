package org.example;

public class CircularArrayBidirectional {
    /**
     * Circular Array problem where every move is equilavent to 1 sec,
     * Moves can be left or right
     * @param input
     * @return
     */
    public int process(String input) {
        String[] inputTokens = input.split("");
        String[] alphabhetTokens = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        int startingPoint = 26;
        int rPointer = startingPoint;
        int lPointer = startingPoint;
        int totalMoves = 0;
        for (String inputToken : inputTokens) {
            int rCounter = 0;
            int lCounter = 0;
            int moveToRightCount = 0;
            int moveToLeftCount = 0;
            while (!inputToken.equals(alphabhetTokens[rPointer])) {
                rPointer++;
                rCounter++;
                if (rPointer >= alphabhetTokens.length) break;
            }
            moveToRightCount += rCounter;

            //move to left
            while (!inputToken.equals(alphabhetTokens[lPointer])) {
                lPointer--;
                lCounter++;
                if (lPointer < 0) break;
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
