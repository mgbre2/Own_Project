$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "name": "login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a manager login the page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Steps.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in using \"in_ex_manager2@info.com\" and \"LLighg89\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Steps.user_logs_in_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Expenses title should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Steps.expenses_title_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click Expenses button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Steps.user_should_click_Expenses_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});