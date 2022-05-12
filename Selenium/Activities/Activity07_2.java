package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity07_2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\093194744\\Desktop\\IntelliJ\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Title of the loaded page is : " + driver.getTitle());

        WebElement username = driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
        WebElement confirmPassword = driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input"));
        //WebElement email = driver.findElement(By.xpath("//input[@type='email']"));//This also can be used instead of below line code
        WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'Email')]/following-sibling::input"));
        WebElement signupButton = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
        WebElement dynamicText = driver.findElement(By.xpath("//div[@id='action-confirmation']"));


        username.sendKeys("testname");
        password.sendKeys("password123");
        confirmPassword.sendKeys("password123");
        email.sendKeys("testselenium321@xyz.com");

        signupButton.click();
        wait.until(ExpectedConditions.visibilityOf(dynamicText));
        System.out.println("Registration Message is : "+dynamicText.getText());
        driver.close();
    }
}