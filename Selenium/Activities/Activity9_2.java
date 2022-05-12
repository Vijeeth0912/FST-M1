package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity9_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Open browser
        driver.get("https://training-support.net/selenium/selects");

        //Chosen option
        WebElement chosen = driver.findElement(By.id("multi-value"));

        //Find dropdown
        Select multiList = new Select(driver.findElement(By.id("multi-select")));

        //Select the 'JavaScript' option
        multiList.selectByVisibleText("Javascript");
        System.out.println(chosen.getText());

        //Select the 'NodeJS' option
        multiList.selectByValue("node");
        System.out.println(chosen.getText());

        //Select the 4th, 5th, and the 6th options
        for (int i = 4; i <= 6; i++) {
            multiList.selectByIndex(i);
        }
        System.out.println(chosen.getText());

        //Deselect the 'NodeJS' option
        multiList.deselectByValue("node");
        System.out.println(chosen.getText());

        //Deselect the 7th option by Index
        multiList.deselectByIndex(7);
        System.out.println(chosen.getText());

        //Get all selected options
        List<WebElement> options = multiList.getAllSelectedOptions();
        //Print all selected options
        for (WebElement option : options) {
            System.out.println("Selected Options " + option.getText());
        }
        //Deselect all options
        multiList.deselectAll();
        System.out.println(chosen.getText());

        //Close browser
        driver.close();
    }

}
