package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void testCase4() {
        //Navigate to Jobs page
        driver.findElement(By.xpath("//li[@id='menu-item-24']/a")).click();
        //Verify the page title
        String pageTitle = driver.getTitle();
        Reporter.log("pageTitle is: " + pageTitle);
        Assert.assertEquals(pageTitle, "Jobs – Alchemy Jobs");

    }

    @AfterClass
    public void afterClass() {
        //Close the browser
        driver.close();
    }

}
