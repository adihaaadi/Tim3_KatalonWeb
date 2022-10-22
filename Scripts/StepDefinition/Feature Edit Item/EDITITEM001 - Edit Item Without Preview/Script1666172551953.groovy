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

WebUI.callTestCase(findTestCase('StepDefinition/Feature Login/LOGIN001- Login With Valid Email and Password'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Home/svg_Profile_svg-inline--fa fa-list fa-lg'))

WebUI.click(findTestObject('Page_Secondhand Store/btn_Paracetamol 500mgboxKesehatanRp1.000.000,00'))

WebUI.click(findTestObject('Page_Secondhand Store/button_Edit'))

WebUI.callTestCase(findTestCase('Pages/UserEditItem/Input Nama Produk'), [('nama_produk') : 'Paracetamol'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/UserEditItem/Input Harga Produk'), [('harga_produk') : '10000'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/UserEditItem/Select Kategori'), [('select_kategori') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/UserEditItem/Input Deskripsi'), [('deskripsi') : 'ini deskripsi paracetamol'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/UserEditItem/Add Photo'), [('add_photo') : 'C:\\Users\\ASUS\\Downloads\\desain1.png'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/UserEditItem/Click Terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)

