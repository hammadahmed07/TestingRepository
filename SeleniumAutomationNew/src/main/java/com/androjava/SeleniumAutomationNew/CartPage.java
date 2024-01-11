package com.androjava.SeleniumAutomationNew;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    private By proceedToCheckoutButtonLocator = By.id("sc-buy-box-ptc-button");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void proceedToCheckout() {
       /* driver.findElement(proceedToCheckoutButtonLocator).click();*/
       /* driver.get("https://www.amazon.in/Microsoft-Surface-Laptop5-Platinum-Ultimate/dp/B0BLYZ9377/ref=sr_1_1_sspa?keywords=laptop+laptop&qid=1703774710&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");*/
        WebElement proceedToCheckout1 =driver.findElement(By.xpath("//input[@id=\"sc-buy-box-ptc-button\"]"));
        proceedToCheckout1.click();
        
    }

    // Placeholder method - adjust based on your actual application flow
   /* public boolean isCheckoutSuccessful() {
        // Implement logic to determine if the checkout process is successful
        // For example, check if the order confirmation message is displayed
        // Return true if successful, false otherwise
        return driver.getPageSource().contains("Order Confirmation");
    }*/
}

