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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://hive.kode.id/login')

WebUI.setText(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/input_Email_w-100 ph2 outline-0 bn css-1atig4m'), 
    'ardiansyah@kode.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/input_Password_w-100 ph2 outline-0 bn css-1atig4m'), 
    '0BT9ptQDurfx4txHk5kdTA==')

WebUI.click(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/button_Login ke Dashboard'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/a_Companies'))

WebUI.click(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/button_Add New Company'))

WebUI.setText(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/input_name_name'), 'PT TokoMedia Nusantara, Tbk')

WebUI.setText(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/input_description_description'), 'Media Toko Online Se-Nusantara')

WebUI.click(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/div_slot'))

WebUI.setText(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/input_slot_slot'), '5')

WebUI.click(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/div_Select'))

WebUI.click(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/div_4'))

WebUI.click(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/div_ option Jan focused 1 of 12'))

WebUI.click(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/div_Jun'))

WebUI.click(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/div_Select'))

WebUI.click(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/div_2019'))

WebUI.click(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/button_Add Company'))

WebUI.click(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/button_Ya'))

WebUI.click(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/a_Companies'))

WebUI.setText(findTestObject('Object Repository/Prod_CreateCompanies/Page_KODE  CORE/input_Search Company_w-100 ph2 outline-0 bn css-1atig4m'), 
    'PT Tokomedia')

WebUI.closeBrowser()

