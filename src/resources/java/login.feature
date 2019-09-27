Feature: Login feature          
Scenario Outline: Login       
Given user is on the home page
When User performs login using "<username>" and "<password>"
Then user must in home page and display success message
Examples: 
|username| |password|
|lalitha| |Password123|
|alex| |alex123|

