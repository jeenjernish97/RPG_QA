$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featurefiles/communicationlog.feature");
formatter.feature({
  "name": "Login Page for RBG",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the new account in RBG login page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters username \"pratimtester09@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.userEntersUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password \"123456\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.userEntersPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigated into communication log",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.navigatedIntoCommunicationLog()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Some information should show that no communication happened",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.someInformationShouldShowThatNoCommunicationHappened()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d110.0.5481.178)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027JEEN\u0027, ip: \u0027192.168.29.7\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_341\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 110.0.5481.178, chrome: {chromedriverVersion: 110.0.5481.77 (65ed616c6e8e..., userDataDir: C:\\Users\\JERNISH\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:54919}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 7f8f441c21b24f6e3223994fa297c1be\n*** Element info: {Using\u003dxpath, value\u003d//span[text()\u003d\u0027No communication happened so far\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.getText(Unknown Source)\r\n\tat com.report.BaseClass.toGetText(BaseClass.java:83)\r\n\tat com.steps.LoginPageSteps.someInformationShouldShowThatNoCommunicationHappened(LoginPageSteps.java:51)\r\n\tat ✽.Some information should show that no communication happened(file:src/test/resources/featurefiles/communicationlog.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the existing account in RPG login page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter the value in username \"test-marchant@tier5.in\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.userEnterTheValueInUsername(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d110.0.5481.178)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027JEEN\u0027, ip: \u0027192.168.29.7\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_341\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 110.0.5481.178, chrome: {chromedriverVersion: 110.0.5481.77 (65ed616c6e8e..., userDataDir: C:\\Users\\JERNISH\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:54972}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 0ea290f17dfa963bf74bbf7fc30f9a0f\n*** Element info: {Using\u003dxpath, value\u003d//h1[text()\u003d\u0027Sign In\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.getText(Unknown Source)\r\n\tat com.report.BaseClass.toGetText(BaseClass.java:83)\r\n\tat com.steps.LoginPageSteps.userEnterTheValueInUsername(LoginPageSteps.java:60)\r\n\tat ✽.user enter the value in username \"test-marchant@tier5.in\"(file:src/test/resources/featurefiles/communicationlog.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter the value in password\"123456\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.userEnterTheValueInPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.userClickTheLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "navigated to communication log",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.navigatedToCommunicationLog()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Some information should show that communication happened",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.someInformationShouldShowThatCommunicationHappened()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});