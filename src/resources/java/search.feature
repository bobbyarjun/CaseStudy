Feature: Alex Search 

Scenario: Succesfull search
    Given Alex enters valid login crendentials
    When Alex searches for the product by entering first four characters
    Then Alex gets suggestion of the product
    And Alex clicks on product and clicks on add to cart
    And Alex completes payment by checking out
  

Scenario: Unsuccesfull search
   Given Alex enters valid login crendentials
  When Alex searches for the product by entering first four characters
  Then Searh product is unavailabel in testME
     