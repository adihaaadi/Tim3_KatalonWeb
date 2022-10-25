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



class AddItem {
	@Then("User click link masuk")
	public void user_click_link_masuk() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem/Click Link Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input Username")
	public void user_input_Username() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem/Input Username'), [('email') : 'binarqae1@gmail.com'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input Password")
	public void user_input_Password() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem/Input Password'), [('password') : 'students1234'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User click login button")
	public void user_click_login_button() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem/Click login button'), [:], FailureHandling.STOP_ON_FAILURE)
		}

	@Then("User click Jual")
	public void user_click_Jual() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem/Click Jual'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(2)
		}

	@Then("User fill Nama Produk field")
	public void user_fill_Nama_Produk_field() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem/Input Nama Produk'), [('nm_produk') : 'Oskadon Sp 4 Tablet'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User fill Harga Produk field")
	public void user_fill_Harga_Produk_field() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem/Input Harga Produk'), [('harga_produk') : '2500'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User choose Kategori")
	public void user_choose_Kategori() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem/Select Kategori'), [('kategori') : '0-5'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User Deskripsi field")
	public void user_Deskripsi_field() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem/Input Deskripsi'), [('deskripsi') : 'Obat untuk meredakan nyeri otot pada punggung dan pinggang'],
			FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User choose Image from device or local drive")
	public void user_choose_Image_from_device_or_local_drive() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem/Add foto'), [('root') : 'C:\\Users\\Lenovo\\Obat\\Oskadon Sp.jpg'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User click Terbitkan")
	public void user_click_Terbitkan() {
		WebUI.callTestCase(findTestCase('Pages/UserAddItem/Click Terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(2)
	}
}