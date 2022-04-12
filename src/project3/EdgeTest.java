package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        //Maximize window
        driver.manage().window().maximize();
        //Time set for window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Title of the page
        System.out.println("Title of the page " + driver.getTitle());
        //Resource of the page
        System.out.println("Resource of the page " + driver.getPageSource());
        //current URL of the page
        System.out.println("Current URL of the page" + driver.getCurrentUrl());

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("hvthake");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("abc123");
        driver.close();


    }
}
