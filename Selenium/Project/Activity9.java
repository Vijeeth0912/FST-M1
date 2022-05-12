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

public class Activity9 {
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
    public void testCase9() {
        WebElement userName = driver.findElement(By.id("user_login"));
        userName.sendKeys("root");
        WebElement password = driver.findElement(By.id("user_pass"));
        password.sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(), 'Job Listings')]")));

        //Click on Job Listings from Left Menu
        driver.findElement(By.xpath("//div[contains(text(), 'Job Listings')]")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class, 'page-title-action')]")));

        //click on Add New button
        driver.findElement(By.xpath("//a[contains(@class, 'page-title-action')]")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("post-title-0")));

        WebElement textArea = driver.findElement(By.id("post-title-0"));
        textArea.sendKeys("Test Engineer");

        driver.findElement(By.id("_company_name")).sendKeys("IBM INDIA");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(), 'Publish')]")));

        driver.findElement(By.xpath("//button[contains(text(), 'Publish')]")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//strong[contains(text(), 'Are you ready to publish?')]")));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(), 'Publish')]")));

        driver.findElement(By.cssSelector(".editor-post-publish-button")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("post-title-0")));

        String jobListing = driver.findElement(By.className("editor-post-title__input")).getText();
        System.out.println("Heading: "+jobListing);
        Reporter.log("Heading is: " + jobListing);
        Assert.assertEquals(jobListing, "Test Engineer");

    }

    @AfterClass
    public void afterClass() {
        //Close the browser
        driver.close();
    }
}

