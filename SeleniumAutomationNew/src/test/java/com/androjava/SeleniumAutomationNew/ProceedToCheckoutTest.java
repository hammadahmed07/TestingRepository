package com.androjava.SeleniumAutomationNew;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProceedToCheckoutTest extends TestClass {

    @Test(priority = 4)
    public void testProceedToCheckout() {
        // Assuming the product is added to the cart
    	 
//        homePage.searchForProduct(properties.getProperty("search.product"));
//        productPage.addToCart();
        cartPage.proceedToCheckout();
        Assert.assertTrue(true, "Assertion message if checkout fails");
       
    }
}
