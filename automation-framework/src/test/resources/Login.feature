Feature: Zoopla login feature testing 
	Description: pass must be more than 8 characters

#Background:Given open browser/login


Scenario: As a Zoopla user, i can successfully login with valid credetials 
	Given Setup driver and send URL 
	When login with valid credential 
	Then validate login and close the browser 
