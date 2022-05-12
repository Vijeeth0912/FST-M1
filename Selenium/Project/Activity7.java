package Activities;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Activity7 {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    JavascriptExecutor js1 = (JavascriptExecutor) driver;

    @BeforeClass
    public void beforeClass() {
        //Open the browser
        driver.get("https://alchemy.hguy.co/jobs/");
        driver.manage().window().maximize();
    }

    @Test
    public void testCase6() {
        //Navigate to Jobs page
        driver.findElement(By.xpath("//li[@id='menu-item-24']/a")).click();
        driver.findElement(By.xpath("//li[@id='menu-item-26']/a")).click();
        WebElement email = driver.findElement(By.id("create_account_email"));
        email.sendKeys("test61@gmail.com");
        WebElement jobTitle = driver.findElement(By.id("job_title"));
        jobTitle.sendKeys("Automation61");
        WebElement location = driver.findElement(By.id("job_location"));
        location.sendKeys("Bengaluru");
        WebElement iframe = driver.findElement(By.id("job_description_ifr"));
        driver.switchTo().frame(iframe);
        WebElement desc = driver.findElement(By.xpath("//body[contains(@class, 'job_description')]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(desc).build().perform();
        desc.sendKeys("Applying for Testing Job");

        driver.switchTo().defaultContent();

        WebElement appURL = driver.findElement(By.name("application"));
        appURL.sendKeys("testsupport61@gmail.com");
        WebElement compName = driver.findElement(By.id("company_name"));
        compName.sendKeys("IBM");
        //Click on Preview button
        WebElement btnPreview = driver.findElement(By.name("submit_job"));
        js.executeScript("arguments[0].scrollIntoView();", btnPreview);
        actions.moveToElement(btnPreview).build().perform();
        btnPreview.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("job_preview_submit_button")));
        //click on Submit Listing button
        driver.findElement(By.id("job_preview_submit_button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='menu-item-24']/a[contains(text(), 'Jobs')]")));
        //click on Jobs
        driver.findElement(By.xpath("//li[@id='menu-item-24']/a[contains(text(), 'Jobs')]")).click();
        driver.findElement(By.xpath("//li[@id='menu-item-24']/a")).click();
        WebElement search = driver.findElement(By.id("search_keywords"));
        String expectedRes = "Automation59";
        search.sendKeys(expectedRes);
        driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul/li/a/div[1]/h3")));
        List<WebElement> list1 = driver.findElements(By.xpath("//div/ul/li/a/div[1]/h3"));
        for( WebElement list : list1) {
            String actualResult = list.getText();
            System.out.println("actualResult:" + actualResult);
            Reporter.log("actualResult: " + actualResult);
            Assert.assertEquals(actualResult, expectedRes);
        }


    }

    /*@AfterClass
    public void afterClass() {
        //Close the browser
        driver.close();
    }*/
}
