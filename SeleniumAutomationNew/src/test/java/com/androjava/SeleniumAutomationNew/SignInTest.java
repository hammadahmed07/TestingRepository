package com.androjava.SeleniumAutomationNew;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends TestClass {

    @Test(priority = 1)
    public void testSignIn() {
    	  super.setup();
        signInPage.signIn("hamyahmed007@gmail.com", "hamy@royal");
//        Assert.assertTrue(true, "Assertion message if sign-in fails");
        super.tearDown();
    }
}
