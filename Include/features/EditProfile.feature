#Author Tri

@EditProfile
Feature: EditProfile
	User want to edit profile
	
	@EditProf001
	Scenario: EditProf001 - User want to edit profile without add photo
		Then User login at SecondHand Store website
		Then User click profile button
		Then User click profile menu
		Then User input nama akun "binar qae1"
		Then User select kota "Bandung"
		Then User input alamat "Bandung Timur"
		Then User input no handphone "098886829"
		Then User click submit