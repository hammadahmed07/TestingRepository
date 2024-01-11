package com.androjava.SeleniumAutomationNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    private By searchBoxLocator = By.id("twotabsearchtextbox");
    private By searchButtonLocator = By.id("nav-search-submit-button");
    private By searchResultsLocator = By.xpath("//div[@data-component-type='s-search-results']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchForProduct(String productName) {
        WebElement searchBox = driver.findElement(searchBoxLocator);
        searchBox.sendKeys(productName);
        searchBox.submit();
    }

   /* public boolean isSearchResultsDisplayed() {
        return driver.findElement(searchResultsLocator).isDisplayed();
    }*/
}


