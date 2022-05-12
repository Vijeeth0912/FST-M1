package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void testCase2() {
        //Verify the heading
        String heading = driver.findElement(By.cssSelector(".entry-title")).getText();
        Reporter.log("Heading is: " + heading);
        Assert.assertEquals(heading, "Welcome to Alchemy Jobs");

    }

    @AfterClass
    public void afterClass() {
        //Close the browser
        driver.close();
    }


}
