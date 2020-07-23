package search

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class redirection_INV_click {

	@Keyword

	def redirect_INV(){

		//WebUI.waitForPageLoad(30)

		//WebUI.delay(10)

		WebUI.waitForElementPresent(findTestObject('POR/Inventory_click'), 30)

		WebUI.click(findTestObject('POR/Inventory_click'))

		WebUI.waitForElementPresent(findTestObject('search/Inventory_Records_click'), 30)

		WebUI.click(findTestObject('search/Inventory_Records_click'))

		WebUI.waitForElementClickable(findTestObject('search/Inventory_Records_click'), 30)
	}
}
