#Author: Sandri Alfarisi

@AddItemDaftarJual @Smoke
Feature: Add Item Daftar Jual
As a user, I want to add a product item in Daftar Jual Page.

	@ADDITEMDAFTARJUAL001
	Scenario: ADDITEMDAFTARJUAL001 - User Want To Add Item in Daftar Jual Page
	Then User login to the website
	Then User click menu daftar jual saya 
	Then User click tambah produk button
	Then User fill nama produk
	Then User fill harga produk
	Then User choose produk kategori
	Then User fill deskripsi
	Then User choose Image from device
	Then User click preview button
	Then User click terbitkan button
	
	@ADDITEMDAFTARJUAL002
	Scenario: ADDITEMJAFTARJUAL002 - User Want To Click Back in Tambah Produk Page
	Then User click menu daftar jual saya 
	Then User click tambah produk button
	Then User click back button
	
	@ADDITEMDAFTARJUAL003
	Scenario: ADDITEMJAFTARJUAL003 - User Want To Click Back after filling all field
	Then User click menu daftar jual saya 
	Then User click tambah produk button
	Then User fill nama produk
	Then User fill harga produk
	Then User choose produk kategori
	Then User fill deskripsi
	Then User choose Image from device
	Then User click back button
	
	@ADDITEMDAFTARJUAL004
	Scenario: ADDITEMJAFTARJUAL004 - User Want To Search Produk in Tambah Produk Page
	Then User click menu daftar jual saya 
	Then User click tambah produk button
	Then User fill search field
	Then User press enter