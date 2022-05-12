package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity06_2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\093194744\\Desktop\\IntelliJ\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/ajax");
        System.out.println("Title of the loaded page is : " + driver.getTitle());

        WebElement elementButton = driver.findElement(By.xpath("//button[contains(@class,'violet')]"));

        elementButton.click();
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//div[@id='ajax-content']")),"HELLO!"));
        System.out.println("Text on the page is : "+driver.findElement(By.xpath("//*[@id='ajax-content']")).getText());

        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//div[@id='ajax-content']")),"I'm late!"));
        System.out.println("Text on the page is : "+driver.findElement(By.xpath("//*[@id='ajax-content']")).getText());

        driver.close();
    }
}