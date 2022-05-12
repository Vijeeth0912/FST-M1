package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void testCase3() {
        //Verify the Image URL and print in console
        String imageURL = driver.findElement(By.xpath("//div/img")).getAttribute("src");
        Reporter.log("Image URL is: " + imageURL);


    }

    @AfterClass
    public void afterClass() {
        //Close the browser
        driver.close();
    }

}
