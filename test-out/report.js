$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/workspace.feature");
formatter.feature({
  "line": 2,
  "name": "Workspace Login",
  "description": "",
  "id": "workspace-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 5383817299,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Login with Existing Token login",
  "description": "",
  "id": "workspace-login;login-with-existing-token-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is in workspace",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User click the SKIP button to skip the profile",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User click the Explore our resources and Dashboard link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click the Token Login link",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enter Token login id",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click the Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enter in to workspace with Log out button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_is_in_workspace()"
});
formatter.result({
  "duration": 6433620700,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_click_the_SKIP_button_to_skip_the_profile()"
});
formatter.result({
  "duration": 3383663401,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_click_the_Explore_our_resources_and_Dashboard_link()"
});
formatter.result({
  "duration": 8152528099,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_click_the_Token_Login_link()"
});
formatter.result({
  "duration": 119472301,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enter_Token_login_id()"
});
formatter.result({
  "duration": 183690599,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_click_the_Submit_button()"
});
formatter.result({
  "duration": 3096020099,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enter_in_to_workspace_with_Log_out_button()"
});
formatter.result({
  "duration": 49492001,
  "status": "passed"
});
formatter.after({
  "duration": 98746000,
  "status": "passed"
});
});