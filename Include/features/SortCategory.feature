#Author: Tommy Abdullah

@Sort @SMOKE
Feature: Login
  As a user, I want to find product per category
  
  @SORT001
  Scenario: SORT001 - category Baju
  And User click baju category
  Then the website will sort the products by baju category
  
  @SORT002
  Scenario: SORT002 - category elektronik
  And User click elektronik category
  Then the website will sort the products by elektronik category
  
  @SORT003
  Scenario: SORT003 - category kesehatan
  And User click kesehatan category
  Then the website will sort the products by kesehatan category
  
  @SORT004
  Scenario: SORT004 - category kendaraan
  And User click kendaraan category
  Then the website will sort the products by kendaraan category
  
  @SORT005
  Scenario: SORT005 - category hoby
  And User click hoby category
  Then the website will sort the products by hoby category