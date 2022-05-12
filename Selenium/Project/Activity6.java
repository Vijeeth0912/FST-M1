package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Activity6 {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeClass
    public void beforeClass() {
        //Open the browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void testCase6() {
        //Navigate to Jobs page
        driver.findElement(By.xpath("//li[@id='menu-item-24']/a")).click();
        WebElement search = driver.findElement(By.id("search_keywords"));
        search.sendKeys("Banking");
        driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul/li/a/div[1]/h3")));
        driver.findElement(By.xpath("//div/ul/li/a/div[1]/h3")).click();
        driver.findElement(By.cssSelector(".application_button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'abhiram@cklabs.com')]")));
        String emailText = driver.findElement(By.xpath("//a[contains(text(),'abhiram@cklabs.com')]")).getText();
        System.out.println("emailText " +emailText);
        Reporter.log("email is: " + emailText);
    }

    @AfterClass
    public void afterClass() {
        //Close the browser
        driver.close();
    }

}
