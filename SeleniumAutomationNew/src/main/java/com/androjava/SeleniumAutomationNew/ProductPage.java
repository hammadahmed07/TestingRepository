package com.androjava.SeleniumAutomationNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {
    private By addToCartButtonLocator = By.id("add-to-cart-button");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
       /* driver.findElement(addToCartButtonLocator).click();*/
        driver.get("https://www.amazon.in/Microsoft-Surface-Laptop5-Platinum-Ultimate/dp/B0BLYZ9377/ref=sr_1_1_sspa?keywords=laptop+laptop&qid=1703774710&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
        WebElement addToCart1 =driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
        addToCart1.click();
    

   /* public boolean isProductAddedToCart() {
        // Placeholder implementation, you need to customize this based on your application behavior
        // For example, check for a success message or an element indicating the product is in the cart
        return driver.getPageSource().contains("Added to Cart");
    }*/
}
}

