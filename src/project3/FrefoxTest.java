package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FrefoxTest {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        //Maximize window
        driver.manage().window().maximize();
        //Set time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get title of the page
        System.out.println("Title of the page "+ driver.getTitle());
        //get page resource of the page
        System.out.println("resource of the page "+ driver.getCurrentUrl());

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("hvthake");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("abc123");
    }
}
