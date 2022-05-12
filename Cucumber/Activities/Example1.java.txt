package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Example1{
	WebDriver driver;
@Given("^user is on the Amazon website$")
public void user_is_on_Home_Page() throws Throwable {
	 driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("http://www.amazon.in");
}

@When("^user searches a product$")
	public void user_searches_a_product() throws Throwable {
	driver.findElement(By.xpath(".//*[@id='account']/a")).click();
}
}