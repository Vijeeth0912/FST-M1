package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class Activity02 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\093194744\\Desktop\\IntelliJ\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.training-support.net");
        Thread.sleep(3000);
        System.out.println("Title of the page is : "+driver.getTitle());
        WebElement withID, withClassName, withLinkText, withCSSSelector;
        withID = driver.findElement(By.id("about-link"));
        withClassName = driver.findElement(By.className("green"));
        withLinkText = driver.findElement(By.linkText("About Us"));
        withCSSSelector = driver.findElement(By.cssSelector("#about-link"));
        System.out.println("Text in Element with ID is : "+withID.getText());
        System.out.println("Text in Element with classname is : "+withClassName.getText());
        System.out.println("Text in Element with link text  is : "+withLinkText.getText());
        System.out.println("Text in Element with css Selector is : "+withCSSSelector.getText());

        driver.close();
    }
}
