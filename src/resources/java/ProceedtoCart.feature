Feature: Alex moves to cart without any item in it

Scenario: Succesfull search
    Given Alex enters valid login crendential
    When Alex searches the product by entering first four characters
    Then Alex gets suggestions of the product
    And Alex clicks on product and clicks on add to cart link
    And Alex complete payment by checking out
  

Scenario: Unsuccesfull search
  Then Searh product is unavailable in testME
     
  Scenario: The one where user moves to the cart without adding any item in it
    Given Alex has registered  to testMe App                 
    When Alex searchs a particular product like headphone                                
    Then TestMeApp doesnt display  the cart iconn      

