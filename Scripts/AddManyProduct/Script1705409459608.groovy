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

Mobile.scrollToText('for children')

Mobile.tap(findTestObject('Object Repository/AddProduct/android.view.ViewGroup'), 0)

Mobile.scrollToText('ON SALE')

Mobile.tap(findTestObject('Object Repository/AddProduct/android.view.ViewGroup (1)'), 0)

Mobile.getText(findTestObject('Object Repository/AddProduct/android.widget.TextView - Save 11'), 0)

Mobile.setText(findTestObject('Object Repository/AddProduct/android.widget.EditText - 1'), '2', 0)

Mobile.tap(findTestObject('Object Repository/AddProduct/android.widget.TextView - Add to Bag'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/AddProduct/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/AddProduct/android.widget.TextView - Add to Bag (1)'), 0)

Mobile.pressBack()

Mobile.scrollToText('Health & Nutrition')

Mobile.tap(findTestObject('Object Repository/AddProduct/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('Object Repository/AddProduct/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/AddProduct/android.widget.TextView - Add to Bag (2)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.scrollToText('Skin Care')

Mobile.tap(findTestObject('Object Repository/AddProduct/android.view.ViewGroup (5)'), 0)

Mobile.tap(findTestObject('Object Repository/AddProduct/android.view.ViewGroup (6)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/AddProduct/android.view.ViewGroup (7)'), 0)

Mobile.tap(findTestObject('Object Repository/AddProduct/android.view.ViewGroup (8)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/AddProduct/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/AddProduct/android.widget.ImageView (1)'), 0)

Mobile.getText(findTestObject('Object Repository/AddProduct/android.widget.TextView - NOVEMBER SALE Nutrilin Syrup (2-12) 120ml'), 
    0)

Mobile.getText(findTestObject('Object Repository/AddProduct/android.widget.TextView - Gcash Charge'), 0)

Mobile.getText(findTestObject('Object Repository/AddProduct/android.widget.TextView - Acorbic C-1000mg 30 Tablets Vitamin C'), 
    0)

Mobile.getText(findTestObject('Object Repository/AddProduct/android.widget.TextView - Beauty Vault Premium Rejuvenating Set'), 
    0)

Mobile.getText(findTestObject('Object Repository/AddProduct/android.widget.TextView - Bag Owls Design'), 0)

Mobile.pressBack()

Mobile.getText(findTestObject('Object Repository/AddProduct/android.widget.TextView - 6 items OMR 20.50'), 0)

Mobile.getText(findTestObject('Object Repository/AddProduct/android.widget.TextView - Checkout'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

