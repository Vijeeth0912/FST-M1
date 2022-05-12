package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void testCase1() {
        String title = driver.getTitle();
        Reporter.log("Title is: " + title);
        Assert.assertEquals(title, "Alchemy Jobs – Job Board Application");

    }

    @AfterClass
    public void afterClass() {
        //Close the browser
        driver.close();
    }



}
