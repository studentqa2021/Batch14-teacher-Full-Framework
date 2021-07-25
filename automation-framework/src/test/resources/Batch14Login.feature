Feature: Login function testing
Description: password must be like 6 character
#Background: common steps

Scenario: As Automation practice user, i can successfully login with valid credentials

Given open browser and send URL
When login with valid credentials
Then Check login was success