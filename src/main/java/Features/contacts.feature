Feature: Free CRM Create Contacts

Scenario Outline: user is able to create a new contact

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user move to new contact page
Then user clicks on New Contacts link
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then user clicks on save button
Then verify contact Title "<Title>"
Then close the browser 

Examples:

			|  username   |  password  |  firstname  |  lastname  | position  | Title 			|
			|  BuntyPatel | admin@123  |  Bunty      |  Patel     | WebMaster | Bunty Patel	|
			|	 BuntyPatel	| admin@123  |  Abc        |  xyz       | Artist    |	Abc xyz			|
			
