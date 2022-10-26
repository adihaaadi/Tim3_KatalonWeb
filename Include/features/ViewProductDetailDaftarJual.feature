#Author: Sandri Alfarisi

@AddItemDaftarJual @Smoke
Feature: View Product Detail
As a user, I want to View Product Detail in Daftar Jual Page.

	@PRODUCTDAFTARJUAL001
	Scenario: PRODUCTDAFTARJUAL001 - View Product Details in Daftar Jual Page
	Then User login to the website
	Then User click menu daftar jual saya
	Then User click produk already uploaded
	Then User view details of product
	