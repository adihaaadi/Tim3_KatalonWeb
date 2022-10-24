#Author: Sofia Awiliyah (cofiali53@gmail.com)
@EDITITEM
Feature: Edit Item
  User want to edit the product in Semua Product page and Diminati page

  @EDITITEM001
  Scenario Outline: User want to edit item with preview in Semua Product page
		Then User login at SecondHand Store website
		Then User click daftar jual saya menu
		Then User click diminati menu 

  @EDITITEM002
  Scenario Outline: User want to edit item withot preview in Semua Product page
    Then User login at SecondHand Store website
    Then User click daftar jual saya menu

  @EDITITEM003
  Scenario Outline: User want to edit item with preview in Diminati page
    Then User login at SecondHand Store website
    Then User click daftar jual saya menu
    Then User click diminati menu

  @EDITITEM004
  Scenario Outline: User want to edit item without preview in Diminati page
    Then User login at SecondHand Store website
    Then User click daftar jual saya menu
    Then User click diminati menu
