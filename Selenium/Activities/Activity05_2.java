package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity05_2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\093194744\\Desktop\\IntelliJ\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        Thread.sleep(3000);
        System.out.println("Title of the loaded page is : " + driver.getTitle());

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

        System.out.println("Does the check box displayed on the page is Selected ? True/ False : "+checkbox.isSelected());

        System.out.println("Clicking the check box to select it...");

        checkbox.click();

        System.out.println("Does the check box displayed on the page is Selected after checking it? True/ False : "+checkbox.isSelected());

        driver.close();

    }
}
