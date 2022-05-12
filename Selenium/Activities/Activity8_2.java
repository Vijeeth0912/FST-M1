package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity8_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/tables");

        //Get Columns
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'ui sortable celled table')]/tbody/tr[1]/td"));

        //Get Rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'ui sortable celled table')]/tbody/tr"));

        //Number of columns
        System.out.println("Number of columns are: " + cols.size());
        //Number of rows
        System.out.println("Number of rows are: " + rows.size());

        //Get Second row second column cell value and print them
        WebElement cellValueBefore = driver.findElement(By.xpath("//table[contains(@class, 'ui sortable celled table')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row Cell value: " + cellValueBefore.getText());

        //Sort the table
        driver.findElement(By.xpath("//table[contains(@class, 'ui sortable celled table')]/thead/tr/th[2]")).click();

        //Print the cell value at second row and second column
        WebElement cellValueAfter = driver.findElement(By.xpath("//table[contains(@class, 'ui sortable celled table')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row Cell value: " + cellValueAfter.getText());

        //Print footer cell value
        WebElement footer = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
        System.out.println("Table footer values: " + footer.getText());

        //Close browser
        driver.close();

    }
}
