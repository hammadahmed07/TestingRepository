package com.androjava.SeleniumAutomationNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {
    private By emailInputLocator = By.id("ap_email");
    private By passwordInputLocator = By.id("ap_password");
    private By signInButtonLocator = By.id("signInSubmit");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void signIn(String email, String password) {
        driver.findElement(emailInputLocator).sendKeys(email);
        driver.findElement(passwordInputLocator).sendKeys(password);
        driver.findElement(signInButtonLocator).click();
    }
    

    // Add more methods or assertions as needed
}
