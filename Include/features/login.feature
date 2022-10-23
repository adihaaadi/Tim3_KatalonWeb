#Author: Tommy Abdullah

@LOGIN @SMOKE
Feature: Login
  As a user, I want to login in Secondhand Store.

  @LOGIN002
  Scenario: LOGIN002 - Login with invalid email
    And User click button masuk
  	And User clear text on email field
    Then User input registered email "xxxx@gmail.com"
    And User clear text on password field
    Then User input registered password "students1234"
    Then User click on LOGIN button
    Then Web show message error on email "Akun tidak ditemukan"

  @LOGIN003
  Scenario: LOGIN003 - Login with invalid password
  	And User clear text on email field
    Then User input registered email "binarqae1@gmail.com"
    And User clear text on password field
    Then User input registered password "123445"
    Then User click on LOGIN button
    Then Web show message error on password "Password anda salah!"
    
    @LOGIN001
  	Scenario: LOGIN001 - Login with valid email and password
  	And User clear text on email field
    Then User input registered email "binarqae1@gmail.com"
    And User clear text on password field
    Then User input registered password "students1234"
    Then User click on LOGIN button
    Then User redirected to homepage
