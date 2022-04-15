package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

       WebElement usernameField = driver.findElement(By.id("txtUsername"));
       usernameField.sendKeys("admin123");

       WebElement passwordField = driver.findElement(By.name("txtPassword"));
       passwordField.sendKeys("pram678");

       driver.close();


    }
}
