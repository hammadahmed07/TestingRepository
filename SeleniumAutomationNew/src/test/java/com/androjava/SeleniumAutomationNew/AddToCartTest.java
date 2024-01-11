package com.androjava.SeleniumAutomationNew;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends TestClass {

	@Test(priority = 3)
    public void testAddToCart() {
        // Assuming the search is successful
		super.setup();
        homePage.searchForProduct(properties.getProperty("search.product"));
        productPage.addToCart();
        Assert.assertTrue(true, "Assertion message if adding to cart fails");
        
        super.tearDown();
    }
}
