package arjun.maven2;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Print {

	String str;
	@When("^user enters hello word$")
	public void initialse() throws Throwable {
		str="hello World";
	}

	@Then("^console displays the same$")
	public void display() throws Throwable {
		System.out.println(str);
	}
}
