package com.androjava.SeleniumAutomationNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestClass {
    protected WebDriver driver;
    protected HomePage homePage;
    protected ProductPage productPage;
    protected CartPage cartPage;
    protected SignInPage signInPage;
    protected Properties properties;
    protected ExtentReports extent;
    protected ExtentTest test;

    @BeforeTest
    public void setup() {
        // Load properties from config.properties file
        properties = loadProperties("config.properties");

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", properties.getProperty("chromedriver.path"));

        // Initialize ExtentReports
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreportnew.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // Create a test
        test = extent.createTest("AmazonTest", "Automating Amazon website");

        // Initialize the WebDriver
        driver = new ChromeDriver();

        // Set global wait time
        int globalWaitTime = Integer.parseInt(properties.getProperty("global.wait.time.seconds"));
        driver.manage().timeouts().implicitlyWait(globalWaitTime, TimeUnit.SECONDS);

        // Open the application URL
        driver.get(properties.getProperty("application.url"));

        // Initialize Page Objects
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        signInPage = new SignInPage(driver);
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
//        driver.quit();
        extent.flush();
    }

    protected static Properties loadProperties(String filePath) {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream("C:\\Users\\hammadahmed\\eclipse-workspace\\SeleniumAutomationNew\\src\\main\\java\\config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
