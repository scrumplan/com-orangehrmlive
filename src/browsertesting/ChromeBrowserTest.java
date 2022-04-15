package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        WebElement userNameField = driver.findElement(By.id("txtUsername"));
        userNameField.sendKeys("Prama123");

        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        passwordField.sendKeys("Pram12=3");
        driver.close();


    }
}
