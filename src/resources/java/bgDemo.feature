Feature: Back Ground Demo
 
Background: User Login
Given user is int he login page
When user enters valid cerendentials 
Then User must be navigated to the home page 

@ProductTest
Scenario: Search Product
Given User must be in the search page
When User searches for a product by category
Then Product decsription is displayed

@RegressionTest
Scenario: Add To Cart
Given Search the product to purchase	
When select the product and add it to the cart
Then Product is sucessfully added to the cart


