package org.example;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CircularArrayBidirectionalTest {
    @Test(dataProvider = "all", dataProviderClass = CircularArrayDataProvider.class)
    public void testProcess(String dataInput, int dataResult) {
        var result = new CircularArrayBidirectional().process(dataInput);
        Assert.assertEquals(result, dataResult);
    }
}
