package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity03 {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\093194744\\Desktop\\IntelliJ\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();;
        driver.get("https://training-support.net/selenium/simple-form");
        Thread.sleep(3000);
        System.out.println("Title of the page is : "+driver.getTitle());
        driver.findElement(By.id("firstName")).sendKeys("Vijeeth");
        driver.findElement(By.id("lastName")).sendKeys("Jayan");
        driver.findElement(By.id("email")).sendKeys("test123@test.com");
        driver.findElement(By.id("number")).sendKeys("9999911111");
        driver.findElement(By.xpath("//div[@class='field']/textarea")).sendKeys("Testing Form");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@type='submit']")).submit();
        Thread.sleep(3000);
        driver.close();




    }
}