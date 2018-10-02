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
  "duration": 3826297025,
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
  "duration": 6945016205,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_click_the_SKIP_button_to_skip_the_profile()"
});
formatter.result({
  "duration": 3475885538,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_click_the_Explore_our_resources_and_Dashboard_link()"
});
formatter.result({
  "duration": 260374154,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_click_the_Token_Login_link()"
});
formatter.result({
  "duration": 868137026,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enter_Token_login_id()"
});
formatter.result({
  "duration": 228212513,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_click_the_Submit_button()"
});
formatter.result({
  "duration": 3170590359,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enter_in_to_workspace_with_Log_out_button()"
});
formatter.result({
  "duration": 110020923,
  "status": "passed"
});
formatter.after({
  "duration": 2347683692,
  "status": "passed"
});
formatter.before({
  "duration": 2250967795,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Common Search Functionality",
  "description": "",
  "id": "workspace-login;common-search-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User is in workspace",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User click the SKIP button to skip the profile",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User click the Search text box and enter search term with typo error",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User click the Search button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User should get the warning message says \u0027did you mean\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_is_in_workspace()"
});
formatter.result({
  "duration": 6982210872,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_click_the_SKIP_button_to_skip_the_profile()"
});
formatter.result({
  "duration": 3438492718,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_click_the_Search_text_box_and_enter_search_term_with_typo_error()"
});
formatter.result({
  "duration": 41994256,
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression (.//*[ormalize-space(text()) and normalize-space(.)\u003d\u0027Welcome\u0027])[1]/following::input[1] because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027(.//*[ormalize-space(text()) and normalize-space(.)\u003d\u0027Welcome\u0027])[1]/following::input[1]\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.41.578737 (49da6702b16031c40d63e5618de03a32ff6c197e),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 33 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027LDCL313952\u0027, ip: \u002710.97.0.119\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:54745}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.41.578737 (49da6702b16031c40d63e5618de03a32ff6c197e), userDataDir\u003dC:\\Users\\sjain1\\AppData\\Local\\Temp\\1\\scoped_dir18968_32555}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d69.0.3497.100, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: cd17adcb54d92f03b514eb88045e70d7\n*** Element info: {Using\u003dxpath, value\u003d(.//*[ormalize-space(text()) and normalize-space(.)\u003d\u0027Welcome\u0027])[1]/following::input[1]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:509)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:402)\r\n\tat com.discoveryeducation.StepDef.user_click_the_Search_text_box_and_enter_search_term_with_typo_error(StepDef.java:65)\r\n\tat ✽.And User click the Search text box and enter search term with typo error(src/test/resources/Features/workspace.feature:22)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDef.user_click_the_Search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDef.user_should_get_the_warning_message_says_did_you_mean()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 309522871,
  "status": "passed"
});
});