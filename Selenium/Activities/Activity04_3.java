package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity04_3 {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\093194744\\Desktop\\IntelliJ\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://training-support.net/selenium/target-practice");
        Thread.sleep(3000);
        System.out.println("Title of the loaded page is : "+driver.getTitle());

        System.out.println("Third Header Text with in the page is : "+driver.findElement(By.xpath("//*[@id='third-header']")).getText());

        System.out.println("Colour of the Fifth Header in the page is : "+driver.findElement(By.xpath("//h5")).getCssValue("color"));

        System.out.println("Class Attribute value of the Violet button is : "+driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class"));

        System.out.println("Grey button text in the page is : "+driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText());

        driver.close();
    }
}
