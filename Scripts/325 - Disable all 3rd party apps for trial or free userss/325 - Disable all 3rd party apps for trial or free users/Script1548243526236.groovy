import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://my-development.pawoon.com/login')

WebUI.setText(findTestObject('Object Repository/325 - Disable all 3rd party apps for trial or free users/Page_Pawoon POS - My Pawoon v2 - Lo/input_Daftar disini_email'), 
    'ForRiska@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/325 - Disable all 3rd party apps for trial or free users/Page_Pawoon POS - My Pawoon v2 - Lo/input_Daftar disini_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/325 - Disable all 3rd party apps for trial or free users/Page_Pawoon POS - My Pawoon v2 - Lo/button_Login'))

WebUI.scrollToElement(findTestObject('325 - Disable all 3rd party apps for trial or free users/Page_Pawoon POS - Dashboard/span_Aplikasi'), 
    0)

WebUI.click(findTestObject('Object Repository/325 - Disable all 3rd party apps for trial or free users/Page_Pawoon POS - Dashboard/span_Aplikasi'))

WebUI.click(findTestObject('Object Repository/325 - Disable all 3rd party apps for trial or free users/Page_Pawoon POS/div_Fitur Aplikasi pihak ke-3'))

WebUI.click(findTestObject('Object Repository/325 - Disable all 3rd party apps for trial or free users/Page_Pawoon POS/div_Fitur Aplikasi pihak ke-3'))

WebUI.verifyElementText(findTestObject('325 - Disable all 3rd party apps for trial or free users/disable all 3rd party'), 
    '')

WebUI.closeBrowser()

