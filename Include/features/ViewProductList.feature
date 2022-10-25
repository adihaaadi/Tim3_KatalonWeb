@ViewProductList @Smoke
Feature: View Product List
As a user, I want to see the product list.

	@VIEWPRODUCTLIST 
	Scenario: VIEWPRODUCTLIST - User Want To See View Product List
	Then User click link masuk
	Then User input Username
	Then User input Password
	Then User click login button
	Then User can see all the product list