package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class AddItemDaftarJual {
	@Then("User login to the website")
	public void user_login_to_the_website() {
		WebUI.callTestCase(findTestCase('StepDefinition/Feature Login/LOGIN001 - Login with Valid Email and Password'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User click menu daftar jual saya")
	public void user_click_menu_daftar_jual_saya() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem(Daftar Jual)/Click Menu Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User click tambah produk button")
	public void user_click_tambah_produk_button() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem(Daftar Jual)/Click Tambah Produk Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User fill nama produk")
	public void user_fill_nama_produk() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem(Daftar Jual)/Input Nama Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User fill harga produk")
	public void user_fill_harga_produk() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem(Daftar Jual)/Input Harga Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User choose produk kategori")
	public void user_choose_produk_kategori() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem(Daftar Jual)/Choose Kategori'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User fill deskripsi")
	public void User_fill_deskripsi() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem(Daftar Jual)/Input Deskripsi'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User choose Image from device")
	public void user_choose_image_from_devicee() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem(Daftar Jual)/Add Image'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User click preview button")
	public void user_click_preview_button() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem(Daftar Jual)/Click Preview Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User click terbitkan button")
	public void user_click_terbitkan_button() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem(Daftar Jual)/Click Terbitkan Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User click back button")
	public void user_click_back_button() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem(Daftar Jual)/Click Back Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User fill search field")
	public void User_fill_search_field() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem(Daftar Jual)/Input Search Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User press enter")
	public void User_press_enter() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem(Daftar Jual)/Enter Search Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}