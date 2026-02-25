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


WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Lengkapi profil untuk Akses SIAPkerja-ID'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Lengkapi Profil'))

WebUI.setText(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/input_Dimana tempat kamu lahir_1'), 
    'pangkalpinang')

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Pilih status perkawinan'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Kawin'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/button_button-native-sia-0dd-66d'))

WebUI.setText(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/input_Ketik untuk mulai mencari_1'), 
    'bangka')

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/h4_kepulauan bangka belitung'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/h4_kota pangkal pinang'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan Republik Indonesia/h4_taman sari'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/h4_kejaksaan'))

WebUI.setText(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/input_ion-input-8'), 
    '11234')

WebUI.setText(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/textarea_Masukkan alamat kamu sesuai KTP_1'), 
    'test')

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/ion-checkbox_ion-cb-5-lbl-donesia-ced'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-bb8-7e7'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/ion-button_Tambah Pendidikan-donesia-d10'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Pilih tingkat'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_S1'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Pilih sekolah atau universitas'))

WebUI.setText(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/input_Pilih sekolah atau universitas'), 
    'Bina nusantara')

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/p_Pilih Bina nusantara'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Pilih status perkawinan'))

WebUI.setText(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/input_Ketik bidang studi'), 
    'teknik informatika')

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Pilih teknik informatika'))

WebUI.setText(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/input_Tambahkan , apabila desimal'), 
    '4')

WebUI.setText(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/input_Masukan tahun mulai'), 
    '2010')

WebUI.setText(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/input_Masukan tahun selesai'), 
    '2014')

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Pilih lokasi daerah'))

WebUI.setText(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/input_Ketik untuk mulai mencari'), 
    'jakarta')

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/h4_dki jakarta'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/h4_kota adm. jakarta barat'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/h4_pal merah'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan Republik Indonesia/h4_palmerah'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Upload'))

WebUI.setText(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/input_file_1'), 
    'C:\\fakepath\\siapkerja.png')

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/ion-button_Simpan-donesia-b52'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-bb8-7e7'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_bg-transparent w-full h-full absolute top-0'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Saya tidak memiliki riwayat kerja'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/ion-button_Pilih-donesia-2de'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-bb8-7e7'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_bg-transparent w-full h-full absolute top-0'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Saya tidak memiliki riwayat kerja'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-2de-bfc'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-bb8-7e7'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_bg-transparent w-full h-full absolute top-0'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Saya tidak memiliki riwayat kerja'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-2de-bfc'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-bb8-7e7'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_bg-transparent w-full h-full absolute top-0'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Saya tidak memiliki riwayat kerja'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-2de-bfc'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-bb8-7e7'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-d10-13e'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Pilih bahasa'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Kawin'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Pilih status perkawinan'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_Tingkat Fasih atau Bahasa Ahli'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/ion-button_Simpan-donesia-b52_1'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-bb8-7e7'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/input_Pilih keahlian'))

WebUI.setText(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/input_Pilih keahlian_1'), 
    'developer')

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_developer'))

WebUI.click(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/span_button-inner-sia-bb8-7e7'))

WebUI.rightClick(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Selamat datang'))

WebUI.verifyElementText(findTestObject('SIAPKerja/Complete-Profile/Page_SIAPkerja  Kementerian Ketenagakerjaan_18fb92/div_Selamat datang'), 
    'Selamat datang,')

