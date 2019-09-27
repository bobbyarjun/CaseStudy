          package arjun.maven2;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BgStepDefinition {
String str="Not Navigated";
@Given("^user is int he login page$")
public void user_is_int_he_login_page() throws Throwable {
	System.out.println("User is in the login page");  
}

@When("^user enters valid cerendentials$")
public void user_enters_valid_cerendentials() throws Throwable {
	System.out.println("user enters credential and performs login");
}

@Then("^User must be navigated to the home page$")
public void user_must_be_navigated_to_the_home_page() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
	System.out.println("Logged in successfully !!");
}
@Given("^User must be in the search page$")
public void user_must_be_in_the_search_page() throws Throwable {
	System.out.println("in Search page");
}
@When("^User searches for a product by category$")
public void user_searches_for_a_product_by_category() throws Throwable {
	System.out.println("Search the product ");
}

@Then("^Product decsription is displayed$")
public void product_decsription_is_displayed() throws Throwable {
	System.out.println("user in product description page");
}

@Given("^Search the product to purchase$")
public void search_the_product_to_purchase() throws Throwable {
	System.out.println("");
}


@When("^select the product and add it to the cart$")
public void select_the_product_and_add_it_to_the_cart() throws Throwable {
	System.out.println(" add it to cart");
}

@Then("^Product is sucessfully added to the cart$")
public void product_is_sucessfully_added_to_the_cart() throws Throwable {
	System.out.println("cart is increased by 1");
}

}
