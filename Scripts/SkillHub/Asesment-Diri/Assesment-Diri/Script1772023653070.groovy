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

WebUI.navigateToUrl('https://sandbox.skillhub.kemnaker.go.id/')

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_Layanan Pelatihan Terbaik dan Gratis d_6b5026/button_Lihat Selengkapnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_Layanan Pelatihan Terbaik dan Gratis d_6b5026/input_Batch 1 Tahun 2026_1'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_Layanan Pelatihan Terbaik dan Gratis d_6b5026/span_Lihat Pelatihan'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_Instagram Ads  Skillhub/span_Daftar Pelatihan'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_Instagram Ads  Skillhub/span_Isi Sekarang'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/ion-button_Lakukan Asesmen-donesia-4e7'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/ion-button_Selanjutnya-donesia-bb8'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Sangat Sesuai'))

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Selanjutnya'))

WebUI.delay(5)

WebUI.click(findTestObject('SkillHub/Asesment-Diri/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/ion-button_Ok, Tutup  Lanjutkan-donesia-086'))

WebUI.delay(10)

