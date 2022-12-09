Feature: AddCity
Scenario: Successfull Login with Valid Credentails
Given  Launches Chrome browser
When User opens URL "https://products.pisystindia.com/Ecommerce/admin/"
And User  enters Emails as "admin@gmail.com" and password as "123456"
And click on Login
Then clicks on Locations
And clicks on city
Then clicks on add city
And user enter city as "Vizag"
Then click on add
And closes the browser