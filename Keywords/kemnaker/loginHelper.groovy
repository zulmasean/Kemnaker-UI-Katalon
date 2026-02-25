package kemnaker

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class loginHelper {
	@Keyword
	def login(String emailTo, String passTo) {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://siapkerja.kemnaker.go.id/app/home')
		WebUI.setText(findTestObject('SIAPKerja/Login-Account/Page_Masuk ke Akun  SIAPkerja ID  Kementeri_eaf591/input_Masukkan email atau nomor handphone'), 
		    email)
		WebUI.click(findTestObject('SIAPKerja/Login-Account/Page_Masuk ke Akun  SIAPkerja ID  Kementeri_eaf591/input_Masukkan password'))
		WebUI.setText(findTestObject('SIAPKerja/Login-Account/Page_Masuk ke Akun  SIAPkerja ID  Kementeri_eaf591/input_Masukkan password'), 
		    password)
		WebUI.click(findTestObject('SIAPKerja/Login-Account/Page_Masuk ke Akun  SIAPkerja ID  Kementeri_eaf591/button_Masuk'))
	}
}
