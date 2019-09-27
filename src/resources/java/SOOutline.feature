Feature: Scenario Outline File
Scenario Outline: Login
Given User not logged in
When User performs login using <username> and <password>
Then logged in successfully

Examples:
 |username| |password|
 |mercury| |mercury|
 |tutorial| |tutorial|