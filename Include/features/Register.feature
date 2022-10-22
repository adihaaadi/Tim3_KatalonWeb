@Signup @Smoke
Feature: Register
	As a user, I want to register in SecondHand Store Web.
	
	@SIGNUP001
	Scenario: SIGNUP001 - Sign up with unregistered email
		
		Then User input name at nama field
		Then User input email address field
		Then User input password field
		Then User click daftar button
	