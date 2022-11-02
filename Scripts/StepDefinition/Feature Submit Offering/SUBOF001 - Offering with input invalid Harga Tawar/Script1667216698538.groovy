import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('StepDefinition/Feature Login/LOGIN001 - Login with Valid Email and Password'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Submit_Offering/div_TeslaKendaraanRp1.500.000,00'))

WebUI.click(findTestObject('Page_Submit_Offering/button_Saya tertarik dan ingin nego'))

WebUI.callTestCase(findTestCase('Pages/SubmitOffering/Verify Content Pop Up'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Submit_Offering/input_Harga Tawar_form-control'), 'lima ribu')

WebUI.callTestCase(findTestCase('Pages/SubmitOffering/Message Success'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/SubmitOffering/Click Kirim'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

