//Sofia Awiliyah - QAE Wave 1 Binar

package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

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

class EditItem {
	@Then("User click in product")
	public void user_click_in_product() {
		WebUI.click(findTestObject('Page_Daftar_Jual/btn_Paracetamol 500mgboxKesehatanRp1.000.000,00'))
	}

	@Then("User click edit")
	public void user_click_edit() {
		WebUI.click(findTestObject('Page_Daftar_Jual/button_Edit'))
	}

	@Then("User input nama produk {string}")
	public void user_input_nama_produk(nama_product) {
		WebUI.callTestCase(findTestCase('Pages/UserEditItem/Input Nama Produk'), [('nama_produk') : nama_product], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input harga produk {string}")
	public void user_input_harga_produk(harga_product) {
		WebUI.callTestCase(findTestCase('Pages/UserEditItem/Input Harga Produk'), [('harga_produk') : harga_product], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User select kategori {string}")
	public void user_select_kategori(select_kategori) {
		WebUI.callTestCase(findTestCase('Pages/UserEditItem/Select Kategori'), [('select_kategori') : select_kategori], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input deskripsi {string}")
	public void user_input_deskripsi(deskripsi) {
		WebUI.callTestCase(findTestCase('Pages/UserEditItem/Input Deskripsi'), [('deskripsi') : deskripsi], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User add photo {string}")
	public void user_add_photo(photo_location) {
		WebUI.callTestCase(findTestCase('Pages/UserEditItem/Add Photo'), [('add_photo') : photo_location],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User click preview")
	public void user_click_preview() {
		WebUI.callTestCase(findTestCase('Pages/UserEditItem/Click Preview'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User click terbitkan")
	public void user_click_terbitkan() {
		WebUI.callTestCase(findTestCase('Pages/UserEditItem/Click Terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}