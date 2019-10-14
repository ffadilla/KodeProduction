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

WebUI.setText(findTestObject('Prod_CompaniesInviteUser/Page_KODE  CORE/input_Email_w-100 ph2 outline-0 bn css-1atig4m'), 
    'ardiansyah@kode.id')

WebUI.setEncryptedText(findTestObject('Prod_CompaniesInviteUser/Page_KODE  CORE/input_Password_w-100 ph2 outline-0 bn css-1atig4m'), 
    '0BT9ptQDurfx4txHk5kdTA==')

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_KODE  CORE/button_Login ke Dashboard'))

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_KODE  CORE/a_Companies'))

WebUI.setText(findTestObject('Prod_CompaniesInviteUser/Page_KODE  CORE/input_Search Company_w-100 ph2 outline-0 bn css-1atig4m'), 
    'PT ')

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_KODE  CORE/a_PT TokoMedia Nusantara Tbk'))

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_KODE  CORE/button_Tambah Banyak Employee'))

WebUI.setText(findTestObject('Prod_CompaniesInviteUser/Page_KODE  CORE/textarea_k'), 'kodetesting02@hotmail.com')

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_KODE  CORE/button_ADD USERS'))

WebUI.delay(4)

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_KODE  CORE/a_Sign Out'))

WebUI.navigateToUrl('https://outlook.live.com/mail/')

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_Outlook  free personal email and calendar from Microsoft/a_Sign in'))

WebUI.setText(findTestObject('Prod_CompaniesInviteUser/Page_Sign in to your Microsoft account/input_Sign in_loginfmt'), 
    'kodetesting02@hotmail.com')

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_Sign in to your Microsoft account/input_Create one_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Prod_CompaniesInviteUser/Page_Sign in to your Microsoft account/input_Enter password_passwd'), 
    'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_Sign in to your Microsoft account/input_Forgotten your password_idSIButton9'))

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_Email - Kode Testing02 - Outlook/span_Undangan bergabung ke KODE dari PT TokoMedia Nusantara Tbk'))

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_Email - Kode Testing02 - Outlook/a_Mulai'))

WebUI.switchToWindowTitle('Daftar ke KODE')

WebUI.setText(findTestObject('Prod_CompaniesInviteUser/Page_Daftar ke KODE/input_First Name_firstName'), 'Nabila')

WebUI.setText(findTestObject('Prod_CompaniesInviteUser/Page_Daftar ke KODE/input_Last Name_lastName'), 'Asyad')

WebUI.setEncryptedText(findTestObject('Prod_CompaniesInviteUser/Page_Daftar ke KODE/input_Password_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.setEncryptedText(findTestObject('Prod_CompaniesInviteUser/Page_Daftar ke KODE/input_Confirm Password_confirmPassword'), 
    'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_Daftar ke KODE/button_Daftar'))

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_Daftar ke KODE/button_Ya'))

WebUI.navigateToUrl('https://kode.id/')

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_KODE - Cara Mudah Belajar Online Bersama KODE/a_Masuk'))

WebUI.setText(findTestObject('Prod_CompaniesInviteUser/Page_Login ke KODE/input_Alamat Email_email'), 'kodetesting02@hotmail.com')

WebUI.setEncryptedText(findTestObject('Prod_CompaniesInviteUser/Page_Login ke KODE/input_Password_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_Login ke KODE/button_Masuk'))

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_Bagikan kategori favorit anda/button_Personal Development'))

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_Bagikan kategori favorit anda/button_Marketing'))

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_Bagikan kategori favorit anda/button_Business'))

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_Bagikan kategori favorit anda/button_Development'))

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_Bagikan kategori favorit anda/button_LANJUT'))

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_Katalog Course - KODE/a_home'))

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_Home - KODE/div_NabilaNA'))

WebUI.click(findTestObject('Prod_CompaniesInviteUser/Page_Home - KODE/span_logout'))

WebUI.closeBrowser()

