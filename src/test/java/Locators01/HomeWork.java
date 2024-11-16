package Locators01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/locator-homework.php");

        WebElement fullName = driver.findElement(By.name("FullName"));
        fullName.sendKeys("Lianne Joie");

        WebElement email = driver.findElement(By.id("yourEmail"));
        email.sendKeys("Ren@yehey.com");

        WebElement nameID=driver.findElement(By.id("clientNameId"));
        nameID.sendKeys("REN");

        WebElement clientId = driver.findElement(By.name("ClientId"));
        clientId.sendKeys("13234664");

        WebElement clientFeed = driver.findElement(By.id("ClientfeedbackId"));
        clientFeed.sendKeys("this is my feedback.");

        WebElement projectName=driver.findElement(By.name("ProjectName"));
        projectName.sendKeys("Awesome Project!");

        WebElement projectTimeId = driver.findElement(By.id("ProjectTimeId"));
        projectTimeId.sendKeys("8:00 am EST");

        WebElement currentAdd = driver.findElement(By.name("CurrentAddress"));
        currentAdd.sendKeys("888 Happy Place, Clayton NC 27777");

        WebElement permanentAdd = driver.findElement(By.id("PermanentAddressId"));
        permanentAdd.sendKeys("Same as Above");

        //WebElement clickHere = driver.findElement(By.linkText("Click Here."));
        //clickHere.click();

        WebElement submitBtn = driver.findElement(By.name("btn-submit"));
        submitBtn.click();


        Thread.sleep(4000);

    }
}
