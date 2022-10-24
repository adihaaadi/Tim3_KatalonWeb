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



class SortCategory {
	@Given("User click baju category")
	public void user_click_baju_category() {
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click kategori baju'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("the website will sort the products by baju category")
	public void the_website_will_sort_the_products_by_baju_category() {
		WebUI.verifyElementText(findTestObject('Homepage/text_product3_category'), 'Baju')
	}

	@Given("User click elektronik category")
	public void user_click_elektronik_category() {
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click kategori elektronik'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("the website will sort the products by elektronik category")
	public void the_website_will_sort_the_products_by_elektronik_category() {
		WebUI.verifyElementText(findTestObject('Homepage/text_product3_category'), 'Elektronik')
	}

	@Given("User click kesehatan category")
	public void user_click_kesehatan_category() {
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click kategori kesehatan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("the website will sort the products by kesehatan category")
	public void the_website_will_sort_the_products_by_kesehatan_category() {
		WebUI.verifyElementText(findTestObject('Homepage/text_product3_category'), 'Kesehatan')
	}

	@Given("User click kendaraan category")
	public void user_click_kendaraan_category() {
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click kategori kendaraan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("the website will sort the products by kendaraan category")
	public void the_website_will_sort_the_products_by_kendaraan_category() {
		WebUI.verifyElementText(findTestObject('Homepage/text_product3_category'), 'Kendaraan')
	}

	@Given("User click hoby category")
	public void user_click_hoby_category() {
		WebUI.callTestCase(findTestCase('Pages/Homepage/Click kategori hobi'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("the website will sort the products by hoby category")
	public void the_website_will_sort_the_products_by_hoby_category() {
		WebUI.verifyElementText(findTestObject('Homepage/text_product3_category'), 'Hoby')
	}
}