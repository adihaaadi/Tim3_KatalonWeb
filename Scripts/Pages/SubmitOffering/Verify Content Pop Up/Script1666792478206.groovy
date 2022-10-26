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

WebUI.verifyElementVisible(findTestObject('Page_Submit_Offering/div_popup'))

WebUI.verifyElementVisible(findTestObject('Page_Submit_Offering/text_header_masukkan_haga_tawarmu'))

WebUI.verifyElementVisible(findTestObject('Page_Submit_Offering/button_close_popup'))

WebUI.verifyElementVisible(findTestObject('Page_Submit_Offering/text_area_harga_tawarmu_akan_diketahui_penjual'))

WebUI.verifyElementVisible(findTestObject('Page_Submit_Offering/text_area_product_display'))

WebUI.verifyElementVisible(findTestObject('Page_Submit_Offering/image_product_tesla'))

WebUI.verifyElementVisible(findTestObject('Page_Submit_Offering/text_productname_tesla'))

WebUI.verifyElementVisible(findTestObject('Page_Submit_Offering/text_productprice_tesla'))

WebUI.verifyElementVisible(findTestObject('Page_Submit_Offering/text_label_Harga Tawar'))

WebUI.verifyElementVisible(findTestObject('Page_Submit_Offering/text_input_numberarea_Harga Tawar_form'))

WebUI.verifyElementVisible(findTestObject('Page_Submit_Offering/button_Kirim'))

