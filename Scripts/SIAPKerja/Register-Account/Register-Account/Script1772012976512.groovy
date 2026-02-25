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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://siapkerja.kemnaker.go.id/app/home')

WebUI.click(findTestObject('SIAPKerja/Register-Account/Page_Masuk ke Akun  SIAPkerja ID  Kementeri_eaf591/a_Daftar Sekarang'))

WebUI.setText(findTestObject('SIAPKerja/Register-Account/Page_Registrasi  SIAPkerja ID  Kementerian _0a6096/input_Masukkan nomor induk kependudukan'), 
    identityNumber)

WebUI.setText(findTestObject('SIAPKerja/Register-Account/Page_Registrasi  SIAPkerja ID  Kementerian _0a6096/input_Masukkan nama lengkap'), 
    fullName)

WebUI.click(findTestObject('SIAPKerja/Register-Account/Page_Registrasi  SIAPkerja ID  Kementerian _0a6096/span_Berikutnya'))

WebUI.setText(findTestObject('SIAPKerja/Register-Account/Page_Registrasi  SIAPkerja ID  Kementerian _0a6096/input_Contoh_ iqbaldomain.com'), 
    email)

WebUI.setText(findTestObject('SIAPKerja/Register-Account/Page_Registrasi  SIAPkerja ID  Kementerian _0a6096/input_Contoh_ 081288488955'), 
    phoneNumber)

WebUI.click(findTestObject('SIAPKerja/Register-Account/Page_Registrasi  SIAPkerja ID  Kementerian _0a6096/input_Password'))

WebUI.setText(findTestObject('SIAPKerja/Register-Account/Page_Registrasi  SIAPkerja ID  Kementerian _0a6096/input_Password'), 
    password)

WebUI.click(findTestObject('SIAPKerja/Register-Account/Page_Registrasi  SIAPkerja ID  Kementerian _0a6096/button_Daftar Sekarang'))

WebUI.verifyElementText(findTestObject('SIAPKerja/Register-Account/Page_Aktivasi Akun  SIAPkerja ID  Kementerian Ketenagakerjaan RI/h4_Verifikasi'), 
    'Verifikasi')

WebUI.delay(5)

WebUI.closeBrowser()

