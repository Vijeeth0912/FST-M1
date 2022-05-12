package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity01 {

    public static void main(String[] args) throws InterruptedException {
        //Create a new instance of the Firefox driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\093194744\\Desktop\\IntelliJ\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();;
        driver.get("https://www.training-support.net");
        Thread.sleep(3000);
        System.out.println("Browser is Opened");
        driver.close();
        System.out.println("Browser is Closed");

    }
}
