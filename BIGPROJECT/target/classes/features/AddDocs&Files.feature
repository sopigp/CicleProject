@DocsFiles
Feature: Docs & Files Cicle
	User can upload files/docs in cicle
 	
 #	@PositiveCase1
#	Scenario Outline: Create new folder & new document
#		Given User already login in Cicle Website
#		When User select team
#		And User choose docs & files feature
#		Then User should be navigated to the docs & files page
#		And User create new folder with "<folderName>" as folder name
#		And User add new doc on the folder that have been created with "<titleDoc>" as title document and "<descDoc>" as body document
#		And User publish the document
#		Then The document already created & published
#	
#		Examples:
#			|		folderName						|		titleDoc											| 																						descDoc																																																					|
 #			|		WFH Terms & Conditions|		Aturan WFH PT Cilsy Foilution	|	Wajib mengikuti online meeting setiap hari kerja jam 08.00 - 10.00 WIB menggunakan google meet dengan account yang telah terdaftar oleh PT Cilsy Fioulution	|
 			
  @PositiveCase2
	Scenario: Upload files/docs with valid extention & size
		Given User already login in Cicle Website
		When User select team
		And User choose docs & files feature
		Then User should be navigated to the docs & files page
		And User choose folder to upload "fototesting.jpg"
		Then The file already uploaded & published
	
 #	@NegativeCase1
#	Scenario Outline: Upload files/docs with invalid data
#		Given User already login in Cicle Website
#		When User select team
#		And User choose docs & files feature
#		Then User should be navigated to the docs & files page
#		And User create new folder but leave "<folderName>" blank
#		Then Error message will appears
#		
#		Examples:
#			|		folderName	|
 #			|								|
		
#	@NegativeCase2
#	Scenario Outline: Upload files/docs with invalid data
#		Given User already login in Cicle Website
#		When User select team
#		And User choose docs & files feature
#		Then User should be navigated to the docs & files page
#		And User create new folder with "<folderName>" as folder name
#		And User add new doc on the folder that have been created but leave "<titleDoc>" & "<descDoc>" document blank
#		And User publish the document
#		Then The document already created & published
#		
#		Examples:
#		|		folderName							|		titleDoc	| 	descDoc		|
 #		|		WFH Terms & Conditions	|							|							|
 #			
 			
 #	@NegativeCase3
#	Scenario Outline: Upload files/docs with invalid data
#		Given User already login using gmail account
#		When User selects one of the available team cards
#		And User choose docs & files feature
#		Then User should be navigated to the docs & files page
#		And User create new folder with "<folderName"> as folder name
#		And User upload the document/file with a size larger than the limit
#		Then error message will appears
#		
#		Examples:
#			|		folderName							|
 #			|		WFH Terms & Conditions	|	