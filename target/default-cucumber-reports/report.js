$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/home.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@all"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Home_steps.user_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "login bookit",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@all"
    },
    {
      "name": "@for"
    }
  ]
});
formatter.step({
  "name": "user logs in as a teacher",
  "keyword": "When "
});
formatter.match({
  "location": "Home_steps.user_logs_in_as_a_teacher()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "homepage should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Mapdetail_steps.homepage_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});