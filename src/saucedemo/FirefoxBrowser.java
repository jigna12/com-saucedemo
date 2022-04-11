package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowser {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get(baseurl);//Launch the URL
        driver.manage().window().maximize();//Maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//We give Implicit time to driver

        String title = driver.getTitle();//Get the title of the page
        System.out.println("Page title = " +title);
        System.out.println("Current URL = " +driver.getCurrentUrl());//Get Current URL

        String p = driver.getPageSource();//Get the page-source
        System.out.println("Page-Source=" +p);

        WebElement usernameField = driver.findElement(By.id("user-name"));//Find the username field element
        usernameField.sendKeys("abc123@gmail.com");

        WebElement passwordField = driver.findElement(By.id("password"));//Find the password field element
        passwordField.sendKeys("abc123");

        driver.close();//Close the browser

    }
}
