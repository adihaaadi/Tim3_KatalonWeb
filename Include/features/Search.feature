#Author : Sofia Awiliyah 

@SEARCH
Feature: Search
	User want to search product
	
	@SEARCH001
	Scenario: SEARCH001 - User search for a product already on the display
		Then User login at SecondHand Store website
    Then User input keyword
    Then verify element exist
    
  @SEARCH002
  Scenario: SEARCH002 - User search for a product not in the product list
    Then User input keyword
    Then verify element doesn't exist