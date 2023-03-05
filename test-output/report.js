$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/bunty/Desktop/QA/Selenium_WorkSpace/FreeCRMBDDFramework/src/main/java/Features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "BuntyPatel",
        "admin@123"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user move to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on New Deal link",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "test deal",
        "1000",
        "50",
        "10"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user clicks on save button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 11780443500,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.title_of_page_is_free_CRM()"
});
formatter.result({
  "duration": 263938417,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 1026660000,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3905783166,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 19240834,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_move_to_new_deal_page()"
});
formatter.result({
  "duration": 228605042,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_clicks_on_New_Deal_link()"
});
formatter.result({
  "duration": 1438788666,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_enters_dealDetails(DataTable)"
});
formatter.result({
  "duration": 173106417,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_clicks_on_save_button()"
});
formatter.result({
  "duration": 1664186333,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 86234667,
  "status": "passed"
});
});