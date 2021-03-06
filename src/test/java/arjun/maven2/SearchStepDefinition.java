package arjun.maven2;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStepDefinition {
	WebDriver driver;
	@Given("^Alex enters valid login crendentials$")
	public void alex_enters_valid_login_crendentials() throws Throwable {
		driver=UtilityClass.startBrowser("chrome","http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		WebDriverWait wait= new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Login")));
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignOut")));
//		Assert.assertEquals("Home", driver.getTitle());
		System.out.println("logged in Successfully !!");
	}

	@When("^Alex searches for the product by entering first four characters$")
	public void alex_searches_for_the_product_by_entering_first_four_characters() throws Throwable {
		driver.findElement(By.name("products")).click();
	     driver.findElement(By.name("products")).sendKeys("head");
	 
	     
	}
	@Then("^Alex gets suggestion of the product$")
	public void alex_gets_suggestion_of_the_product() throws Throwable {
//		driver.findElement(By.className("autocomplete-items")).click();
		 // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Assert.assertEquals(1,driver.findElement(By.id("itemscount")).getText());
	     driver.findElement(By.xpath("//input[@type='submit' and @value='FIND DETAILS']")).click();
	     } 

	@Then("^Alex clicks on product and clicks on add to cart$")
	public void alex_clicks_on_product_and_clicks_on_add_to_cart() throws Throwable {
	     driver.findElement(By.linkText("Add to cart")).click(); 
		driver.findElement(By.partialLinkText("Cart")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 driver.findElement(By.partialLinkText("Checkout")).click();
	}

	@Then("^Alex completes payment by checking out$")
	public void alex_completes_payment_by_checking_out() throws Throwable {
		System.out.println(driver.findElements(By.id("demo3")).size());
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
		  driver.findElement(By.id("btn")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.name("username")).sendKeys("123457");
		  driver.findElement(By.name("password")).sendKeys("Pass@457");
		  driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		  driver.findElement(By.name("transpwd")).sendKeys("Trans@457");
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  driver.findElement(By.partialLinkText("SignOut")).click();
		  driver.close();
	}

	@Then("^Searh product is unavailabel in testME$")
	public void searh_product_is_unavailabel_in_testME() throws Throwable {
		driver.findElement(By.name("products")).sendKeys("dgdg");       
		Assert.assertEquals(0,(driver.findElement(By.id("itemscount"))).getText());
		Assert.assertEquals(driver.getTitle(),"Home");
		driver.close();
	}

}
