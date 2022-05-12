package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        String pressedKeyText;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Open browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        //Get the page title and print it to the console
        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        driver.findElement(By.cssSelector("button#confirm")).click();

        //Switch to alert window
        Alert alert = driver.switchTo().alert();

        //Get text in the alert box and print it
        System.out.println("First Time: Alert text is: " +alert.getText());

        // Click the OK button on the alert
        alert.accept();

        driver.findElement(By.cssSelector("button#confirm")).click();

        //Switch to alert window
        Alert alert1 = driver.switchTo().alert();

        //Get text in the alert box and print it
        System.out.println("Second Time: Alert text is: " +alert1.getText());

        // Click the OK button on the alert
        alert1.dismiss();



        // Close the browser
        driver.close();

    }



}
