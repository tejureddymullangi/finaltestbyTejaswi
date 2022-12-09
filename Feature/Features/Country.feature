Feature: AddCountry
Scenario: Successfull Login with Valid Credentails
Given  Launch Chrome browser
When User open URL "https://products.pisystindia.com/Ecommerce/admin/"
And User  enter Emails as "admin@gmail.com" and password as "123456"
And clicks on Login
Then click on Locations
And click on country
Then click on add country
And user enters country as "India"
Then clicks on add
And close the browser