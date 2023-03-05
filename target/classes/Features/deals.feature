Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given user is on Login Page
When title of login page is Free CRM
Then user enters username and password
| BuntyPatel | admin@123 |
Then user clicks on login button
Then user is on home page
Then user move to new deal page
Then user clicks on New Deal link
Then user enters deal details
| test deal | 1000 | 50 | 10 |
Then user clicks on save button
Then close the browser 