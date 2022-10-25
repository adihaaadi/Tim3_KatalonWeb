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

WebUI.verifyElementVisible(findTestObject('Page_Register/tittle_Daftar'))

WebUI.verifyElementVisible(findTestObject('Page_Register/label_Nama'))

WebUI.verifyElementVisible(findTestObject('Page_Register/textfield_Nama'))

WebUI.verifyElementVisible(findTestObject('Page_Register/label_Email address'))

WebUI.verifyElementVisible(findTestObject('Page_Register/textfield_Email address'))

WebUI.verifyElementVisible(findTestObject('Page_Register/label_Password'))

WebUI.verifyElementVisible(findTestObject('Page_Register/textfield_Password'))

WebUI.verifyElementVisible(findTestObject('Page_Register/button_Daftar'))

WebUI.verifyElementVisible(findTestObject('Page_Register/text_Sudah punya akun'))

WebUI.verifyElementVisible(findTestObject('Page_Register/link_Masuk di sini'))

WebUI.verifyElementVisible(findTestObject('Page_Register/image_SecondHand'))

WebUI.verifyElementVisible(findTestObject('Page_Register/text_SecondHand'))

