$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/DataDrivenLogin.feature");
formatter.feature({
  "name": "User account test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify user information",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wig"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cybertek.library.step_definitions.LoginStepDefs.i_am_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user name should be \"Test Librarian 12\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cybertek.library.step_definitions.DashBoardStepDefs.user_name_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});