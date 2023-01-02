$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("API.feature");
formatter.feature({
  "line": 1,
  "name": "API Test feature",
  "description": "",
  "id": "api-test-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1319306500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "API Scenario",
  "description": "",
  "id": "api-test-feature;api-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@API"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "As a owner add new pet to the store with the below data",
  "rows": [
    {
      "cells": [
        "url",
        "petId",
        "categoryId",
        "categoryName",
        "petName",
        "photoUrls",
        "tagsId",
        "tagsName",
        "status"
      ],
      "line": 5
    },
    {
      "cells": [
        "/pet",
        "10",
        "0",
        "dog",
        "doggie",
        "\\src\\image\\download.jpg",
        "0",
        "test",
        "available"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "search pet ID with \"10\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "delete the pet profile by id \"10\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "End test case",
  "keyword": "Then "
});
formatter.match({
  "location": "StepAPI.as_a_owner_I_would_add_new_pet_to_the_store_with_url(String,String\u003e\u003e)"
});
formatter.result({
  "duration": 5257470200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 20
    }
  ],
  "location": "StepAPI.add_new_pet_it_shoud_be_avilable_to_serach_with_pet_by_ID(String)"
});
formatter.result({
  "duration": 565816600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 30
    }
  ],
  "location": "StepAPI.delete_the_pet_profile_by_id(String)"
});
formatter.result({
  "duration": 1011654100,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 267000,
  "status": "passed"
});
formatter.uri("MyTest.feature");
formatter.feature({
  "line": 1,
  "name": "Test feature",
  "description": "",
  "id": "test-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 36900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verification on web pages",
  "description": "",
  "id": "test-feature;verification-on-web-pages",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Launch application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Validate todays date",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Navigate to Sports",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "validate background color for primary and secondary navigation",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Navigate to Football",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Navigate to first article",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Click on first image from article",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "validate Previous button on image is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "validate Next button on image is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Validate Next button functionality",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Validate Previous button functionality",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Click on close button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Click on Facebook icon and verify opened window",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Click on Video full screen",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "exhibit points for \"Liverpool\" team",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Close the test run",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.launch_application()"
});
formatter.result({
  "duration": 20747556300,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for pages.MainPage$$Lambda$728/0x00000008012b7c40@629600d7 (tried for 15 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:87)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:231)\r\n\tat pages.MainPage.launch(MainPage.java:41)\r\n\tat Steps.MyStepdefs.launch_application(MyStepdefs.java:35)\r\n\tat ✽.Given Launch application(MyTest.feature:5)\r\nCaused by: org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d108.0.5359.125)\nBuild info: version: \u00274.7.2\u0027, revision: \u00274d4020c3b7\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [b99dbb3efdb68a5be42eb7fa4335d71f, executeScript {script\u003dreturn document.readyState, args\u003d[]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.125, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: C:\\Temp\\scoped_dir15388_141...}, goog:chromeOptions: {debuggerAddress: localhost:40855}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:40855/devtoo..., se:cdpVersion: 108.0.5359.125, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: b99dbb3efdb68a5be42eb7fa4335d71f\r\n\tat jdk.internal.reflect.GeneratedConstructorAccessor27.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:535)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:472)\r\n\tat pages.MainPage.lambda$launch$0(MainPage.java:42)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:208)\r\n\tat pages.MainPage.launch(MainPage.java:41)\r\n\tat Steps.MyStepdefs.launch_application(MyStepdefs.java:35)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)\r\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:598)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:173)\r\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\r\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:824)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1511)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:794)\r\n\tat org.testng.TestRunner.run(TestRunner.java:596)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:377)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:371)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:332)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:276)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1212)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1134)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1063)\r\n\tat org.testng.TestNG.run(TestNG.java:1031)\r\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\r\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyStepdefs.validate_todays_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.navigate_to_Sports()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.validate_background_color_for_primary_and_secondory_navigation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.navigate_to_Football()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.navigate_to_first_article()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.click_on_first_image_from_article()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.validate_Previous_button_on_image_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.validate_Next_button_on_image_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.validate_Next_button_functionality()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.validate_Previous_button_functionality()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.click_on_close_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.click_on_Facebook_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.click_on_Video_full_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Liverpool",
      "offset": 20
    }
  ],
  "location": "MyStepdefs.exhibit_points_for_team(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.close()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 245200,
  "status": "passed"
});
});