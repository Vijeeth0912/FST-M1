package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity9_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Open browser
        driver.get("https://training-support.net/selenium/selects");

        //Choose option
        WebElement chosen = driver.findElement(By.id("single-value"));

        //Find dropdown
        Select dropdown = new Select(driver.findElement(By.id("single-select")));

        //Select second option
        dropdown.selectByVisibleText("Option 2");
        System.out.println(chosen.getText());

        //Select third option
        dropdown.selectByIndex(3);
        System.out.println(chosen.getText());

        //Select fourth option
        dropdown.selectByValue("4");
        System.out.println(chosen.getText());

        //Get all options
        List<WebElement> options = dropdown.getOptions();
        //Print them
        for(WebElement option : options) {
            System.out.println("Option: " + option.getText());
        }

        //Close browser
        driver.close();
    }

}
