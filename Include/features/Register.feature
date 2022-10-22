@Signup @Smoke
Feature: Register
	As a user, I want to register in SecondHand Store Web.
	
	@SIGNUP001
	Scenario: SIGNUP001 - Sign up with unregistered email
		Then User click masuk button
		Then User click daftar di sini link
		Then User input name at nama field
		Then User input unregistered email address field
		Then User input password field
		Then User click daftar button
	
	@SIGNUP002
	Scenario: SIGNUP002 - Sign up with registered email
		Then User click masuk button
		Then User click daftar di sini link
		Then User input name at nama field
		Then User input registered email address field
		Then User input password field
		Then User click daftar button
		
	@SIGNUP003
	Scenario: SIGNUP003 - Sign up with less than 8 characters of password
		Then User click masuk button
		Then User click daftar di sini link
		Then User input name at nama field
		Then User input unregistered email address field
		Then User input less than 8 characters at password field
		Then User click daftar button 
		
	@SIGNUP004
	Scenario: SIGNUP004 - Sign up with name contains special characters
		Then User click masuk button
		Then User click daftar di sini link
		Then User input name contains special characters at nama field
		Then User input unregistered email address field
		Then User input password field
		Then User click daftar button 