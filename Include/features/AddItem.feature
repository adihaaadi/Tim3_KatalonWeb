@AddItem @Smoke
Feature: Add Item
As a user, I want to add a product item.

	@ADDITEM001
	Scenario: ADDITEM001 - User Want To Add Item
	Then User click link masuk
	Then User input Username
	Then User input Password
	Then User click login button
	Then User click Jual
	Then User fill Nama Produk field
	Then User fill Harga Produk field
	Then User choose Kategori
	Then User Deskripsi field
	Then User choose Image from device or local drive
	Then User click Terbitkan