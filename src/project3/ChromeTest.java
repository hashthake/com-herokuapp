package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String basicUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(basicUrl);
        //maximize window
        driver.manage().window().maximize();
        //set time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get title of the page
        System.out.println("Title of the page " + driver.getTitle());
        //get page resource of the page
        System.out.println("Resource of the page " + driver.getPageSource());
        //get current URL of the page
        System.out.println("Current URL of the page "+ driver.getCurrentUrl());

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("Hthaker");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password123");
        driver.close();
    }
}
