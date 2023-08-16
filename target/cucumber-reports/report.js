$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/discover.feature");
formatter.feature({
  "name": "Validation of APR for Cash Advances",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.scenario({
  "name": "As a user I should be able to verify that APR for Cash Advances is greater than 20%",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.step({
  "name": "User navigates to Discover HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStep.user_navigates_to_Discover_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the “Credit Cards” icon",
  "keyword": "When "
});
formatter.match({
  "location": "CreditCardStep.user_clicks_on_the_Credit_Cards_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks “Apply Now” for card type: Secured Credit Card",
  "keyword": "And "
});
formatter.match({
  "location": "ApplyNowStep.user_clicks_Apply_Now_for_card_type_Secured_Credit_Card()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user skips the pre-fill step",
  "keyword": "Then "
});
formatter.match({
  "location": "SkipStep.user_skips_the_pre_fill_step()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that the APR for Cash Advances is greater than 20%",
  "keyword": "And "
});
formatter.match({
  "location": "AssertStep.user_verifies_that_the_APR_for_Cash_Advances_is_greater_than(Integer)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//p[contains(text(), \u0027%\u0027)]\"}\n  (Session info: chrome\u003d116.0.5845.97)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MY-ASUS-LAPTOP\u0027, ip: \u002710.0.0.186\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.4\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 116.0.5845.97, chrome: {chromedriverVersion: 116.0.5845.96 (1a3918166880..., userDataDir: C:\\Users\\cahid\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:60181}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 9c53b3421099d51d04bfa7338ae44d29\n*** Element info: {Using\u003dxpath, value\u003d//p[contains(text(), \u0027%\u0027)]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy17.getText(Unknown Source)\r\n\tat stepDefinitions.AssertStep.user_verifies_that_the_APR_for_Cash_Advances_is_greater_than(AssertStep.java:17)\r\n\tat ✽.user verifies that the APR for Cash Advances is greater than 20%(file:src/test/resources/features/discover.feature:9)\r\n",
  "status": "failed"
});
});