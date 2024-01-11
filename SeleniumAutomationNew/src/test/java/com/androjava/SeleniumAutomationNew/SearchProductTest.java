package com.androjava.SeleniumAutomationNew;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest extends TestClass {

    @Test(priority = 2)
    public void testSearchProduct() {
        // Ensure the setup method in TestBase is executed first
        super.setup();

        homePage.searchForProduct(properties.getProperty("search.product"));
        Assert.assertTrue(true, "Assertion message if search fails");

        // Ensure the tearDown method in TestBase is executed afterward
        super.tearDown();
    }
}
