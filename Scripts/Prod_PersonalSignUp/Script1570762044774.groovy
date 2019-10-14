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

WebUI.navigateToUrl('https://kode.id/')

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_KODE - Cara Mudah Belajar Online Bersama KODE/a_Masuk'))

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Login ke KODE/span_Daftar Disini'))

WebUI.setText(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Daftar ke KODE/input_First Name_firstName'), 'Katrina Dwi')

WebUI.setText(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Daftar ke KODE/input_Last Name_lastName'), 'Lousina')

WebUI.setText(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Daftar ke KODE/input_Email_email'), 'kodetesting04@yahoo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Daftar ke KODE/input_Password_password'), 
    'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.setEncryptedText(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Daftar ke KODE/input_Confirm Password_confirmPassword'), 
    'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Daftar ke KODE/button_Daftar'))

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Daftar ke KODE/button_Ya'))

WebUI.navigateToUrl('https://id.yahoo.com/?p=us')

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Yahoo Indonesia  Berita Keuangan dan Hiburan/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Yahoo -masuk/input_Masukkan Kode Negara_username'), 
    'kodetesting04@yahoo.com')

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Yahoo -masuk/input_Masukkan Kode Negara_signin'))

WebUI.setEncryptedText(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Yahoo/input_BukanAnda_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Yahoo/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Yahoo Indonesia  Berita Keuangan dan Hiburan/a_Email'))

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_(26 belum dibaca) - kodetesting04yahoocom - Yahoo Mail/div_Selamat datang di KODE'))

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_(25 belum dibaca) - kodetesting04yahoocom - Yahoo Mail/a_Verifikasi Email'))

WebUI.switchToWindowTitle('Verify Email KODE')

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Verify Email KODE/span_Login ke Akun'))

WebUI.setText(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Login ke KODE/input_Alamat Email_email'), 'kodetesting04@yahoo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Login ke KODE/input_Password_password'), 
    'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Login ke KODE/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Bagikan kategori favorit anda/button_Personal Development'))

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Bagikan kategori favorit anda/button_Marketing'))

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Bagikan kategori favorit anda/button_Business'))

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Bagikan kategori favorit anda/button_Development'))

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Bagikan kategori favorit anda/button_LANJUT'))

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Katalog Course - KODE/a_home'))

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Home - KODE/div_Katrina DwiKD'))

WebUI.click(findTestObject('Object Repository/Prod_PersonalSignUp/Page_Home - KODE/span_logout'))

WebUI.closeBrowser()

