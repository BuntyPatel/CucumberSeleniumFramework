Feature: Deal data creation

  Scenario: Free CRM Create a new deal scenario
    Given user lands on Login Page
    When title of login page is Free CRM
    Then user enters username and password
      | username    | password  |
      | BuntyPatel | admin@123 |
    Then user clicks on login button
    Then user is on home page
    Then user move to new deal page
    Then user clicks on New Deal link
    Then user enters deal details
      | title      | amount | probability | commission |
      | test deal1 |   1000 |          50 |         10 |
      | test deal2 |   2000 |          60 |         20 |
      | test deal3 |   3000 |          70 |         30 |
    Then close the browser
