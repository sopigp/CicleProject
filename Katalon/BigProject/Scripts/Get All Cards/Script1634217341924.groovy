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
import groovy.json.JsonSlurper as JsonSlurper
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

response = WS.sendRequestAndVerify(findTestObject('Get All Cards', [('url') : GlobalVariable.url, ('token') : GlobalVariable.token, ('board') : GlobalVariable.board]))

WS.verifyElementPropertyValue(response, 'message', 'Get board list card successful')

WS.verifyElementPropertyValue(response, 'board._id', '615e9f9ad3cd858f463ca530')

WS.verifyElementPropertyValue(response, 'board.lists[0]._id', '6162fe595e723573521d8e3d')

WS.verifyElementPropertyValue(response, 'board.lists[0].name', 'Move Card From')

WS.verifyElementPropertyValue(response, 'board.lists[2]._id', '615fe8ead3cd85135c3d5119')

WS.verifyElementPropertyValue(response, 'board.lists[2].name', 'Move Card To')

JsonSlurper slurper = new JsonSlurper()

Map parsedJson = slurper.parseText(response.getResponseText())

// LIST FROM
String listFrom = parsedJson.board.lists[0]._id

GlobalVariable.listFrom = listFrom

// CARD LIST
String cardList1 = parsedJson.board.lists[0].cards[0]._id

GlobalVariable.cardList1 = cardList1

String cardList2 = parsedJson.board.lists[0].cards[1]._id

GlobalVariable.cardList2 = cardList2

String cardList3 = parsedJson.board.lists[0].cards[2]._id

GlobalVariable.cardList3 = cardList3

String cardList4 = parsedJson.board.lists[0].cards[3]._id

GlobalVariable.cardList4 = cardList4

String cardList5 = parsedJson.board.lists[0].cards[4]._id

GlobalVariable.cardList5 = cardList5

String cardList6 = parsedJson.board.lists[0].cards[5]._id

GlobalVariable.cardList6 = cardList6

String cardList7 = parsedJson.board.lists[0].cards[6]._id

GlobalVariable.cardList7 = cardList7

String cardList8 = parsedJson.board.lists[0].cards[7]._id

GlobalVariable.cardList8 = cardList8

String cardList9 = parsedJson.board.lists[0].cards[8]._id

GlobalVariable.cardList9 = cardList9

String cardList10 = parsedJson.board.lists[0].cards[9]._id

GlobalVariable.cardList10 = cardList10

// LIST TO
String listTo = parsedJson.board.lists[2]._id

GlobalVariable.listTo = listTo

System.out.println(parsedJson)

