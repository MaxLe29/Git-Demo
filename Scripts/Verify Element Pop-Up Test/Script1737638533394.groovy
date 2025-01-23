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

Mobile.startApplication('bf6a7b1c-1fef-444a-921a-31adf8c4f9fd', true)

Mobile.verifyElementText(findTestObject('Object Repository/XCUIElementTypeStaticText - Allow Arora ATLAS Mobile to use your location'), 
    'Allow “Arora ATLAS Mobile” to use your location?')

Mobile.verifyElementText(findTestObject('Object Repository/XCUIElementTypeStaticText - When you share your location with this app, a blue location indicator will appear to view your current position on the map. This will help you to locate nearby assets of your facility'), 
    'When you share your location with this app, a blue location indicator will appear to view your current position on the map. This will help you to locate nearby assets of your facility.')

Mobile.verifyElementText(findTestObject('Object Repository/XCUIElementTypeButton - Dont Allow'), 'Don’t Allow')

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Dont Allow'), 0)

Mobile.closeApplication()

