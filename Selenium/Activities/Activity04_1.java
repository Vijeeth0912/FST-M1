package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity04_1 {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\093194744\\Desktop\\IntelliJ\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();;
        driver.get("https://training-support.net");
        Thread.sleep(3000);
        System.out.println("Title of the loaded page is : "+driver.getTitle());
        driver.findElement(By.xpath("//a[@id='about-link']")).click();
        Thread.sleep(3000);
        System.out.println("Title of the redirected page is : "+driver.getTitle());
        driver.close();
    }
}
