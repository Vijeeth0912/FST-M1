package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity07_1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\093194744\\Desktop\\IntelliJ\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Title of the loaded page is : " + driver.getTitle());

        WebElement username = driver.findElement(By.xpath("//input[contains(@class,'username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@class,'password')]"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        WebElement welcomeMessage = driver.findElement(By.xpath("//div[@id='action-confirmation']"));

        username.sendKeys("admin");
        password.sendKeys("password");
        loginButton.click(); // here submit() is not working, why ? Even though the type is set to submit in HTML and also the Element is button.

        wait.until(ExpectedConditions.visibilityOf(welcomeMessage));

        System.out.println("Login Message is : "+welcomeMessage.getText());

        driver.close();

    }
}