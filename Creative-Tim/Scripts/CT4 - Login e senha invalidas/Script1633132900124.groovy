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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.creative-tim.com/')

WebUI.click(findTestObject('Object Repository/Page_Premium Bootstrap Themes and Templates_56f221/p_LoginRegister'))

WebUI.setText(findTestObject('Object Repository/Page_Premium Bootstrap Themes and Templates_56f221/input_or_email'), 'teste_de_Software')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Premium Bootstrap Themes and Templates_56f221/input_or_password'), 
    'hcZbaR+Hx86/Ob4GYDniUg==')

WebUI.click(findTestObject('Object Repository/Page_Premium Bootstrap Themes and Templates_56f221/input_or_commit'))

WebUI.verifyElementText(findTestObject('Page_Premium Bootstrap Themes and Templates Download  Creative Tim/div_Invalid emailpassword combination'), 
    'Invalid email/password combination!')

WebUI.closeBrowser()

