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

WebUI.setText(findTestObject('SIAPKerja/Login-Account/Page_Masuk ke Akun  SIAPkerja ID  Kementeri_eaf591/input_Masukkan email atau nomor handphone'),
	email)

WebUI.click(findTestObject('SIAPKerja/Login-Account/Page_Masuk ke Akun  SIAPkerja ID  Kementeri_eaf591/input_Masukkan password'))

WebUI.setText(findTestObject('SIAPKerja/Login-Account/Page_Masuk ke Akun  SIAPkerja ID  Kementeri_eaf591/input_Masukkan password'),
	password)

WebUI.click(findTestObject('SIAPKerja/Login-Account/Page_Masuk ke Akun  SIAPkerja ID  Kementeri_eaf591/button_Masuk'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Pencari kerja'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/ion-button_Daftar Pencari Kerja-donesia-ff9'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/ion-button_Selanjutnya-donesia-bb8'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-bb8-7e7'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_bg-transparent w-full h-full absolute top-0'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Saya tidak memiliki riwayat kerja'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/ion-button_Pilih-donesia-2de'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-bb8-7e7'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_bg-transparent w-full h-full absolute top-0'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Saya tidak memiliki riwayat kerja'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-2de-bfc'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-bb8-7e7'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_bg-transparent w-full h-full absolute top-0'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Saya tidak memiliki riwayat kerja'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-2de-bfc'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-bb8-7e7'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_bg-transparent w-full h-full absolute top-0'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Saya tidak memiliki riwayat kerja'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-2de-bfc'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-bb8-7e7'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/input_Pilih bidang pekerjaan'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Kapten Laut'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Reporter'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/ion-popover_ion-overlay-21-donesia-829'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/input_Pilih lokasi'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Kapten Laut'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/ion-backdrop_ios hydrated-sia-829-9b0'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/input_Pilih industri_sektor'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Kapten Laut'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/ion-backdrop_ios hydrated-sia-829-9b0'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Pilih gaji minimum yang diinginkan'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Rp 3 juta (0-3 juta)'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Pilih kondisi kebekerjaan'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Fresh Graduate'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/ion-checkbox_ion-cb-3-lbl-donesia-e33'))

WebUI.click(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-bb8-7e7'))

WebUI.rightClick(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/ion-button_Konfirmasi-donesia-757'))

WebUI.verifyElementText(findTestObject('SIAPKerja/Profile-Pencari-Kerja/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-757-383'), 
    '')

