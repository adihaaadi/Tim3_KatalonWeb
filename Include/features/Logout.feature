@Logout @Smoke
Feature: Logout
	As a user, I want to logout from SecondHand Store web.
	
	@LOGOUT001
	Scenario: LOGOUT001 - User want to logout
		Then User login at SecondHand Store website
		Then User click profile menu
		Then User click logout