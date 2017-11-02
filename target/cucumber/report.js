$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SignInTest.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "As a User I should be able to get an error with no details on Login",
  "id": "",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1974693320,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User SignIn",
  "description": "",
  "id": ";user-signin",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Chooses to SignIn",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should see an error",
  "keyword": "Then "
});
formatter.match({
  "location": "StartingSteps.navigateToUrl()"
});
formatter.result({
  "duration": 5148506582,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userChoosesToSignIn()"
});
formatter.result({
  "duration": 800586851,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.showError()"
});
formatter.result({
  "duration": 161846542,
  "status": "passed"
});
formatter.after({
  "duration": 83702918,
  "status": "passed"
});
});