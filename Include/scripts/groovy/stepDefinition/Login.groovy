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



class Login {
	@Given("User click button masuk")
	public void user_click_button_masuk() {
		WebUI.callTestCase(findTestCase('Pages/UserRegister/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@Given("User clear text on email field")
	public void user_clear_text_on_email_field() {
		WebUI.clearText(findTestObject('Page_Login/input_Email'))
	}

	@Then("User input registered email {string}")
	public void user_input_registered_email(String email) {
		WebUI.callTestCase(findTestCase('Pages/UserLogin/Input Username'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User clear text on password field")
	public void user_clear_text_on_password_field() {
		WebUI.clearText(findTestObject('Page_Login/input_Password'))
	}

	@Then("User input registered password {string}")
	public void user_input_registered_password(String password) {
		WebUI.callTestCase(findTestCase('Pages/UserLogin/Input Password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User click on LOGIN button")
	public void user_click_on_LOGIN_button() {
		WebUI.callTestCase(findTestCase('Pages/UserLogin/Click login button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Web show message error on email {string}")
	public void web_show_message_error_on_email(String message1) {
		WebUI.callTestCase(findTestCase('Pages/UserLogin/Verify Error Message'), [('message') : message1], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Web show message error on password {string}")
	public void web_show_message_error_on_password(String message2) {
		WebUI.callTestCase(findTestCase('Pages/UserLogin/Verify Error Message'), [('message') : message2], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User redirected to homepage")
	public void user_redirected_to_homepage() {
		WebUI.callTestCase(findTestCase('Pages/UserLogin/Verify Content'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}