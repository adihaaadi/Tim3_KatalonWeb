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

//Afi Sherma - QAE Wave 1 Binar

public class Register {
	//Sign up using unregistered email
	@Then("User click masuk button")
	public void user_click_masuk_button() {
		WebUI.callTestCase(findTestCase('Pages/UserRegister/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User click daftar di sini link")
	public void user_click_daftar_di_sini_link() {
		WebUI.callTestCase(findTestCase('Pages/UserRegister/Click Link Daftar Di Sini'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input name at nama field")
	public void user_input_name_at_nama_field() {
		WebUI.callTestCase(findTestCase('Pages/UserRegister/Input Nama'), [('nama') : 'Afi Sherma'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input unregistered email address field")
	public void user_input_email_address_field() {
		WebUI.callTestCase(findTestCase('Pages/UserRegister/Input Email Address'), [('email') : 'pltnmchllgn05@yopmail.com'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User input password field")
	public void user_input_password_field() {
		WebUI.callTestCase(findTestCase('Pages/UserLogin/Input Password'), [('password') : 'Password.123'], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User click daftar button")
	public void user_click_daftar_button() {
		WebUI.callTestCase(findTestCase('Pages/UserRegister/Click Daftar'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.openBrowser('');
		WebUI.maximizeWindow();
		WebUI.navigateToUrl('https://deployed-five.vercel.app/')
	}
	
	//Sign up using registered email
	@Then("User input registered email address field")
	public void user_input_registered_email_address_field() {
		WebUI.callTestCase(findTestCase('Pages/UserRegister/Input Email Address'), [('email') : 'pltnmchllgn04@yopmail.com'], FailureHandling.STOP_ON_FAILURE)
	}
	
	//Sign up with less than 8 characters of password
	@Then("User input less than {int} characters at password field")
	public void user_input_less_than_characters_at_password_field(Integer int1) {
		WebUI.callTestCase(findTestCase('Pages/UserLogin/Input Password'), [('password') : '123'], FailureHandling.STOP_ON_FAILURE)
	}

	//Sign up with special characters at name
	@Then("User input name contains special characters at nama field")
	public void user_input_name_contains_special_characters_at_nama_field() {
		WebUI.callTestCase(findTestCase('Pages/UserRegister/Input Nama'), [('nama') : 'Afi&81*'], FailureHandling.STOP_ON_FAILURE)
	}
}
