$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/login/LoginTest.feature");
formatter.feature({
  "line": 1,
  "name": "Testing for login  page",
  "description": "",
  "id": "testing-for-login--page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login with valid credentials",
  "description": "",
  "id": "testing-for-login--page;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I login with valid credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I expect the userName is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.iLoginWithValidCredentials()"
});
formatter.result({
  "duration": 17364626259,
  "status": "passed"
});
formatter.match({
  "location": "LoginAssert.itIsExpectedThatTheDisplayUserName()"
});
formatter.result({
  "duration": 56162881,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Adding a user client",
  "description": "",
  "id": "testing-for-login--page;adding-a-user-client",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I am on catalog page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I insert a user client information",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I expect the userName is create sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "CatalogStepDef.goToCatalogPage()"
});
formatter.result({
  "duration": 159406122,
  "status": "passed"
});
formatter.match({
  "location": "CatalogStepDef.addNewUser()"
});
formatter.result({
  "duration": 2380048694,
  "status": "passed"
});
formatter.match({
  "location": "CatalogAssert.itIsExpectedThatTheDisplayUserName()"
});
formatter.result({
  "duration": 1422771259,
  "status": "passed"
});
});