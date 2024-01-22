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

Mobile.startApplication('C:\\Users\\user\\Katalon Studio\\Happy Day Shopping\\mobileapp\\Happy Day Shopping_v1.1.apk', true)

Mobile.scrollToText('Food Products')

Mobile.tap(findTestObject('Object Repository/Food Product/android.view.ViewGroup'), 0)

Mobile.getText(findTestObject('Object Repository/Food Product/android.widget.TextView - Food Products'), 0)

Mobile.tap(findTestObject('Object Repository/Food Product/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.scrollToText('Oishi')

Mobile.tap(findTestObject('Object Repository/Food Product/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Food Product/android.view.ViewGroup (3)'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Food Product/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Food Product/android.view.ViewGroup (5)'), 0)

Mobile.closeApplication()

