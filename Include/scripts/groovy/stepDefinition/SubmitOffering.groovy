// TRI

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



class SubmitOffering {@Then("User click teslakendaraan")
public void user_click_teslakendaraan() {
	WebUI.click(findTestObject('Page_Submit_Offering/div_TeslaKendaraanRp1.500.000,00'))
}

@Then("User click saya tertarik dan ingin nego button")
public void user_click_saya_tertarik_dan_ingin_nego_button() {
	WebUI.click(findTestObject('Page_Submit_Offering/button_Saya tertarik dan ingin nego'))
}

@Then("User input harga tawar {string}")
public void user_input_harga_tawar(String harga_tawar) {
	WebUI.setText(findTestObject('Page_Submit_Offering/input_Harga Tawar_form-control'), [('harga_tawar') : harga_tawar], FailureHandling.STOP_ON_FAILURE)
}

@Then("User click kirim")
public void user_click_kirim() {
	WebUI.callTestCase(findTestCase('Pages/SubmitOffering/Click Kirim'), [:], FailureHandling.STOP_ON_FAILURE)
}
}