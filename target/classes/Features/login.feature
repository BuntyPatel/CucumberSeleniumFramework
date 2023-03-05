Feature: Free CRM Login Feature

#With Examples Keyword
Scenario Outline: Free CRM Login Test Scenario
Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login butoon
Then user is on home page
Then close the browser

Examples:
	| username    | password |
	| BuntyPatel  | admin@123 |
	| BuntyPatel	| admin@123 |

#Without Examples Keyword:
#Scenario: Free CRM Login Test Scenario
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "BuntyPatel" and "admin123"
#Then user clicks on login butoon
#Then user is on home page
#Then close the browser

