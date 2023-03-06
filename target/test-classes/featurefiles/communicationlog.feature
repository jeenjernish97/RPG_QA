Feature: Login Page for RBG

Scenario: To validate the new account in RBG login page

When user enters username "pratimtester09@gmail.com"
And user enters password "123456"
And user clicks on Login button
And navigated into communication log 
Then Some information should show that no communication happened


Scenario: To validate the existing account in RPG login page

When user enter the value in username "test-marchant@tier5.in"
And user enter the value in password"123456"
And user click the login button
And navigated to communication log
Then Some information should show that communication happened
