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

WebUI.setText(findTestObject('Object Repository/Prod_PTPEnrollment/Page_KODE  CORE/input_Email_w-100 ph2 outline-0 bn css-1atig4m'), 
    'ardiansyah@kode.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Prod_PTPEnrollment/Page_KODE  CORE/input_Password_w-100 ph2 outline-0 bn css-1atig4m'), 
    '0BT9ptQDurfx4txHk5kdTA==')

WebUI.click(findTestObject('Object Repository/Prod_PTPEnrollment/Page_KODE  CORE/button_Login ke Dashboard'))

WebUI.click(findTestObject('Object Repository/Prod_PTPEnrollment/Page_KODE  CORE/a_PTP Enrollments'))

WebUI.click(findTestObject('Object Repository/Prod_PTPEnrollment/Page_KODE  CORE/button_ENROLL USER TO COURSE'))

WebUI.setText(findTestObject('Object Repository/Prod_PTPEnrollment/Page_KODE  CORE/textarea_k'), 'kodetesting03@outlook.com')

WebUI.click(findTestObject('Object Repository/Prod_PTPEnrollment/Page_KODE  CORE/div_option HACKTIV8 React and React Native'))

WebUI.click(findTestObject('Object Repository/Prod_PTPEnrollment/Page_KODE  CORE/div_HACKTIV8 Expert with ExpressJS'))

WebUI.click(findTestObject('Object Repository/Prod_PTPEnrollment/Page_KODE  CORE/button_ENROLL USERS'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Prod_PTPEnrollment/Page_KODE  CORE/a_Sign Out'))

WebUI.navigateToUrl('https://outlook.live.com/mail')

WebUI.click(findTestObject('Object Repository/Prod_PTPEnrollment/Page_Outlook  free personal email and calendar from Microsoft/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Prod_PTPEnrollment/Page_Sign in to your Microsoft account/input_Sign in_loginfmt'), 
    'kodetesting03@outlook.com')

WebUI.click(findTestObject('Object Repository/Prod_PTPEnrollment/Page_Sign in to your Microsoft account/input_Create one_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prod_PTPEnrollment/Page_Sign in to your Microsoft account/input_Enter password_passwd'), 
    'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Object Repository/Prod_PTPEnrollment/Page_Sign in to your Microsoft account/input_Forgotten your password_idSIButton9'))

WebUI.click(findTestObject('Prod_PTPEnrollment/Page_Email - Kode Testing03 - Outlook/Page_Email - Kode Testing03 - Outlook/div_KIKODE IndonesiaKamu telah di undang'))

WebUI.click(findTestObject('Object Repository/Prod_PTPEnrollment/Page_Email - Kode Testing03 - Outlook/a_Mulai'))

WebUI.switchToWindowTitle('Daftar ke KODE')

WebUI.setText(findTestObject('Object Repository/Prod_PTPEnrollment/Page_Daftar ke KODE/input_First Name_firstName'), 'Nathan')

WebUI.setText(findTestObject('Object Repository/Prod_PTPEnrollment/Page_Daftar ke KODE/input_Last Name_lastName'), 'Delafoso')

WebUI.setEncryptedText(findTestObject('Object Repository/Prod_PTPEnrollment/Page_Daftar ke KODE/input_Password_password'), 
    'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.setEncryptedText(findTestObject('Object Repository/Prod_PTPEnrollment/Page_Daftar ke KODE/input_Confirm Password_confirmPassword'), 
    'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Object Repository/Prod_PTPEnrollment/Page_Daftar ke KODE/button_Daftar'))

WebUI.click(findTestObject('Object Repository/Prod_PTPEnrollment/Page_Daftar ke KODE/button_Ya'))

WebUI.setText(findTestObject('Prod_PTPEnrollment/Page_Login ke KODE/input_Alamat Email_email'), 'kodetesting03@outlook.com')

WebUI.setEncryptedText(findTestObject('Prod_PTPEnrollment/Page_Login ke KODE/input_Password_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Prod_PTPEnrollment/Page_Login ke KODE/button_Masuk'))

WebUI.click(findTestObject('Prod_PTPEnrollment/Page_Bagikan kategori favorit anda/a_home'))

WebUI.click(findTestObject('Prod_PTPEnrollment/Page_Home - KODE/div_NathanND'))

WebUI.click(findTestObject('Prod_PTPEnrollment/Page_Home - KODE/span_logout'))

