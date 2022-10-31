#Author Tri

@SubmitOffering
Feature: Submit Offering
	User want to submit ofering
	
	@SUBOF001
	Scenario: SUBOF001 - User want to submit offering with input invalid harga tawar
		Then User login at SecondHand Store website
		Then User click teslakendaraan
		Then User click saya tertarik dan ingin nego button
		Then User input harga tawar "lima ribu"
		Then User click kirim
		
	@SUBOF002
	Scenario: SUBOF002 - User want to submit offering with input valid harga tawar
		Then User login at SecondHand Store website
		Then User click teslakendaraan
		Then User click saya tertarik dan ingin nego button
		Then User input harga tawar "100000"
		Then User click kirim
