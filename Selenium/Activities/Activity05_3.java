package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity05_3 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\093194744\\Desktop\\IntelliJ\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        Thread.sleep(3000);
        System.out.println("Title of the loaded page is : " + driver.getTitle());

        WebElement textField = driver.findElement(By.xpath("//input[@type='text']"));

        System.out.println("Does the Text Field displayed on the page is Enabled ? True/ False : "+textField.isEnabled());

        System.out.println("Clicking the Enable Input button to enable the text field..");

        driver.findElement(By.xpath("//button[@id='toggleInput']")).click();

        System.out.println("Does the Text Field displayed on the page is Enabled ? True/ False : "+textField.isEnabled());

        driver.close();

    }
}