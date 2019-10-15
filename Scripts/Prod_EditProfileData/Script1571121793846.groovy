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

WebUI.click(findTestObject('Object Repository/Prod_EditProfileData/Page_KODE - Cara Mudah Belajar Online Bersama KODE/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Prod_EditProfileData/Page_Login ke KODE/input_Alamat Email_email'), 'kodetesting05@yahoo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Prod_EditProfileData/Page_Login ke KODE/input_Password_password'), 
    'b7O+JRsCsz4PFDcKlA0dOA==')

WebUI.click(findTestObject('Object Repository/Prod_EditProfileData/Page_Login ke KODE/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Prod_EditProfileData/Page_Katalog Course - KODE/div_NovryantiNS'))

WebUI.click(findTestObject('Object Repository/Prod_EditProfileData/Page_Katalog Course - KODE/a_Pengaturan Akun'))

WebUI.click(findTestObject('Object Repository/Prod_EditProfileData/Page_Profil Saya - KODE/div_Pilih jenis kelamin'))

WebUI.click(findTestObject('Object Repository/Prod_EditProfileData/Page_Profil Saya - KODE/div_Perempuan'))

WebUI.click(findTestObject('Object Repository/Prod_EditProfileData/Page_Profil Saya - KODE/div_ option 1 focused 1 of 31'))

WebUI.click(findTestObject('Object Repository/Prod_EditProfileData/Page_Profil Saya - KODE/div_6'))

WebUI.click(findTestObject('Object Repository/Prod_EditProfileData/Page_Profil Saya - KODE/div_Bulan_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/Prod_EditProfileData/Page_Profil Saya - KODE/div_Jun'))

WebUI.click(findTestObject('Object Repository/Prod_EditProfileData/Page_Profil Saya - KODE/div_Tahun_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/Prod_EditProfileData/Page_Profil Saya - KODE/div_1988'))

WebUI.setText(findTestObject('Object Repository/Prod_EditProfileData/Page_Profil Saya - KODE/input_Alamat_address'), 'Jalan Kutilang Raya No 16X RT 001/004 Kerendeng Utara Jakarta Barat')

WebUI.click(findTestObject('Object Repository/Prod_EditProfileData/Page_Profil Saya - KODE/button_Simpan Perubahan'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Prod_EditProfileData/Page_Profil Saya - KODE/div_NovryantiNS'))

WebUI.click(findTestObject('Object Repository/Prod_EditProfileData/Page_Profil Saya - KODE/span_logout'))

