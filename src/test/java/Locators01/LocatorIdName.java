package Locators01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorIdName {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/input-form-locator.php");

        WebElement fName = driver.findElement(By.id("first_name"));
        fName.sendKeys("John");

        WebElement lName = driver.findElement(By.name("last_name"));
        lName.sendKeys("Wick");

        WebElement eMail=driver.findElement(By.name("email"));
        eMail.sendKeys("JW@ggmail.com");

        WebElement submitBtn=driver.findElement(By.id("submit_button"));
        submitBtn.click();

        Thread.sleep(4000);

        driver.close();
    }
}
