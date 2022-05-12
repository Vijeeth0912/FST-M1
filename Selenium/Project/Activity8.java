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

public class Activity8 {

    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeClass
    public void beforeClass() {
        //Create a new instance of the Firefox driver

        //Open the browser
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        driver.manage().window().maximize();
    }

    @Test
    public void testCase8() {
        WebElement userName = driver.findElement(By.id("user_login"));
        userName.sendKeys("root");
        WebElement password = driver.findElement(By.id("user_pass"));
        password.sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(), 'Dashboard')]")));

        String heading = driver.findElement(By.xpath("//h1[contains(text(), 'Dashboard')]")).getText();
        System.out.println("Heading: "+heading);
        Reporter.log("Heading is: " + heading);
        Assert.assertEquals(heading, "Dashboard");


    }

    @AfterClass
    public void afterClass() {
        //Close the browser
        driver.close();
    }
}
