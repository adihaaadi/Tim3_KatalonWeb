// Tri 
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



class EditProfile {@Then("User click profile button")
public void user_click_profile_button() {
	WebUI.click(findTestObject('Page_Home/button_profile'))
}

@Then("User input nama akun {string}")
public void user_input_nama_akun(String nama_akun) {
	WebUI.callTestCase(findTestCase('Pages/ProfilePage/Input Nama Akun'), [('nama_akun') : nama_akun], FailureHandling.STOP_ON_FAILURE)
}

@Then("User select kota {string}")
public void user_select_kota(String select_kota) {
	WebUI.callTestCase(findTestCase('Pages/ProfilePage/Select Kota'), [('select_kota') : select_kota], FailureHandling.STOP_ON_FAILURE)
}

@Then("User input alamat {string}")
public void user_input_alamat(String alamat) {
	WebUI.callTestCase(findTestCase('Pages/ProfilePage/Input Alamat'), [('alamat') : alamat], FailureHandling.STOP_ON_FAILURE)
}

@Then("User input no handphone {string}")
public void user_input_no_handphone(String no_handphone) {
	WebUI.callTestCase(findTestCase('Pages/ProfilePage/Input No Handphone'), [('no_handphone') : no_handphone], FailureHandling.STOP_ON_FAILURE)
}

@Then("User click submit")
public void user_click_submit() {
	WebUI.callTestCase(findTestCase('Pages/ProfilePage/Click Submit'), [:], FailureHandling.STOP_ON_FAILURE)
}
}