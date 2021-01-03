package org.example;

import org.testng.annotations.DataProvider;

public class CircularArrayDataProvider {
    @DataProvider(name = "all")
    public Object[][] allDataProvider() {
        return new Object[][] {
            {"AZGB", 13},
            {"ZNMD", 23}
        };
    }
}
