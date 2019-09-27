package arjun.maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginTest {
	WebDriver driver;
	@Given("^user is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
		 driver=UtilityClass.startBrowser("chrome","http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		    driver.findElement(By.linkText("SignIn")).click();
			WebDriverWait wait= new WebDriverWait(driver, 100);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Login")));
	}

	@When("^User performs login using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_performs_login_using_lalitha_and_Password(String arg1,String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
		driver.findElement(By.name("Login")).click();
	}

	@Then("^user must in home page and display success message$")
	public void user_must_in_home_page_and_display_success_message() throws Throwable {
		WebDriverWait wait= new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("val")));
		Assert.assertEquals(driver.getTitle(), "Home");
		System.out.println("Logged in Successfully !!");
		driver.close();
	}


}
