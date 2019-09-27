
Feature: Registeration 

Scenario: Registeration user details
Given User present at the registerartion page

When User enters valid crediantials of username="lalitha",firstname="Arjun"
And lastname="ramesh babu"
And password="akkimute"
And confirmpassword="akkimute"
And choose gender="Male"
And Enter emailid="rarjun96@gmail.com"
And mobile number="99945495894"
And Select dob="13/11/1996"
And Enter Address="No 1 dhondusa layout,mount joy road,bengaluru"
And Select security question="What is your birth place"
And Answer="Benagluru"

Then User Registered sucessfully