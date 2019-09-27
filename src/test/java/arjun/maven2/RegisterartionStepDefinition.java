package arjun.maven2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class RegisterartionStepDefinition {
	WebDriver driver;
	@Given("^User present at the registerartion page$")
	public void user_present_at_the_registerartion_page() throws Throwable {
		 driver=UtilityClass.startBrowser("chrome","http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("^User enters valid crediantials of username=\"([^\"]*)\",firstname=\"([^\"]*)\"$")
	public void user_enters_valid_crediantials_of_username_firstname(String arg1, String arg2) throws Throwable {
		 Assert.assertEquals(driver.getTitle(),"Home");
			System.out.println("Launched testme");
			driver.findElement(By.linkText("SignUp")).click();
			driver.findElement(By.name("userName")).sendKeys("lalitha");		
			driver.findElement(By.name("firstName")).sendKeys("toby");
			String s1= driver.findElement(By.id("err")).getText();
			System.out.println(s1);
			if(s1.equals("Name Already Exists"))
			{
				driver.findElement(By.name("userName")).sendKeys("RTRRRTRjh344");
				
			}
			driver.findElement(By.name("firstName")).sendKeys("toby");			
	}

	@When("^lastname=\"([^\"]*)\"$")
	public void lastname(String arg1) throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys("kuttan");
	}

	@When("^password=\"([^\"]*)\"$")
	public void password(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys("12345678");
	}

	@When("^confirmpassword=\"([^\"]*)\"$")
	public void confirmpassword(String arg1) throws Throwable {
		driver.findElement(By.name("confirmPassword")).sendKeys("12345678");
	}

	@When("^choose gender=\"([^\"]*)\"$")
	public void choose_gender(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@type='radio' and @value = 'Male']")).click();
	}

	@When("^Enter emailid=\"([^\"]*)\"$")
	public void enter_emailid(String arg1) throws Throwable {
		driver.findElement(By.name("emailAddress")).sendKeys("tobykuttan@gmail.com");
	}

	@When("^mobile number=\"([^\"]*)\"$")
	public void mobile_number(String arg1) throws Throwable {
		driver.findElement(By.name("mobileNumber")).sendKeys("9004042530");
	}

	@When("^Select dob=\"([^\"]*)\"$")
	public void select_dob(String arg1) throws Throwable {
		driver.findElement(By.name("dob")).sendKeys("10/31/1997");
	}

	@When("^Enter Address=\"([^\"]*)\"$")
	public void enter_Address(String arg1) throws Throwable {
		driver.findElement(By.id("address")).sendKeys("212 royal gardn, No12 North Avenue , keshavaperumal puram Ra Puram ");
	}

	@When("^Select security question=\"([^\"]*)\"$")
	public void select_security_question(String arg1) throws Throwable {
		driver.findElement(By.name("securityQuestion")).sendKeys("What is your favour color");
	}

	@When("^Answer=\"([^\"]*)\"$")
	public void answer(String arg1) throws Throwable {
		driver.findElement(By.name("answer")).sendKeys("tiger");
	}

	@Then("^User Registered sucessfully$")
	public void user_Registered_sucessfully() throws Throwable {
		driver.findElement(By.name("Submit")).click();
		Assert.assertEquals(driver.findElement(By.id("err")).getText()," ");
	}

}
