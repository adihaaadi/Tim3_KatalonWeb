#Author : Sofia Awiliyah 

@EDITITEM
Feature: EDIT ITEM
	User want to edit item
	
	@EDITITEM001
	Scenario: EDITITEM001 - User want to edit item with preview in Semua Product page
		Then User login at SecondHand Store website
		Then User click daftar jual saya menu
		Then User click in product
		Then User click edit
		Then User input nama produk "paracetamol"
		Then User input harga produk "10000"
		Then User select kategori "2"
		Then User input deskripsi "ini deskripsi paracetamol"
		Then User add photo "C:\\Users\\ASUS\\Downloads\\desain1.png"
		Then User click preview
		
	@EDITITEM002
	Scenario: EDITITEM002 - User want to edit item without preview in Semua Product page
		Then User click daftar jual saya menu
		Then User click in product
		Then User click edit
		Then User input nama produk "paracetamol"
		Then User input harga produk "10000"
		Then User select kategori "2"
		Then User input deskripsi "ini deskripsi paracetamol"
		Then User add photo "C:\\Users\\ASUS\\Downloads\\desain1.png"
		Then User click terbitkan

	@EDITITEM003
	Scenario: EDITITEM003 - User want to edit item with preview in Diminati page
		Then User click daftar jual saya menu
		Then User click diminati menu
		Then User click in product
		Then User click edit
		Then User input nama produk "optic"
		Then User input harga produk "250000"
		Then User select kategori "2"
		Then User input deskripsi "ini deskripsi kacamata"
		Then User add photo "C:\\Users\\ASUS\\Downloads\\desain1.png"
		Then User click preview
		
	@EDITITEM004
	Scenario: EDITITEM004 - User want to edit item without preview in Diminati page
		Then User click daftar jual saya menu
		Then User click diminati menu
		Then User click in product
		Then User click edit
		Then User input nama produk "optic"
		Then User input harga produk "250000"
		Then User select kategori "2"
		Then User input deskripsi "ini deskripsi kacamata"
		Then User add photo "C:\\Users\\ASUS\\Downloads\\desain1.png"
		Then User click preview
		Then User click terbitkan