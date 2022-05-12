package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Activity06_1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\093194744\\Desktop\\IntelliJ\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the loaded page is : " + driver.getTitle());

        WebElement toggleCheckboxButton = driver.findElement(By.id("toggleCheckbox"));
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

        toggleCheckboxButton.click();
        wait.until(ExpectedConditions.invisibilityOf(checkbox));

        toggleCheckboxButton.click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));

        checkbox.click();

        driver.close();

    }
}
