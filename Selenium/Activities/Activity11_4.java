package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity11_4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        String pressedKeyText;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Open browser
        driver.get("https://www.training-support.net/selenium/tab-opener");

        //Get the page title and print it to the console
        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        //Get parent window handle
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window" +parentWindow);

        //Find link to open new tab and click it
        driver.findElement(By.id("launcher")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //Get Window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles: " + allWindowHandles);

        //Loop through each handle
        for(String handle: driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        //Print the handle of the current window
        System.out.println("Current window handle: " + driver.getWindowHandle());






    }
}
