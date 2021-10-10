@AddDocsFiles
Feature: Docs & Files Cicle
	User can upload files/docs in cicle
 	
 	@PositiveCase
	Scenario Outline: Upload files/docs with valid extention & size
		Given User already login using gmail account
		When User selects one of the available team cards
		And User choose docs & files feature
		Then User should be navigated to the docs & files page
		And User create new folder with "<folderName"> as folder name
		And User add new doc on the folder that have been created with "<titleDoc"> as title document and "<bodyDoc"> as body document
		When User publish the document
		Then The document already created & published
	
		Examples:
			|		folderName						|		titleDoc											| 		bodyDoc																																																																									|
 			|		WFH Terms & Conditions|		Aturan WFH PT Cilsy Foilution	|	Wajib mengikuti online meeting setiap hari kerja jam 08.00 - 10.00 WIB menggunakan google meet dengan account yang telah terdaftar oleh PT Cilsy Fioulution	|
 			
 			
 	@NegativeCase1
	Scenario: Upload files/docs with invalid data
		Given User already login using gmail account
		When User selects one of the available team cards
		And User choose docs & files feature
		Then User should be navigated to the docs & files page
		And User create new folder but leave folder name blank
		Then error message will appears
		
		
	@NegativeCase2
	Scenario Outline: Upload files/docs with invalid data
		Given User already login using gmail account
		When User selects one of the available team cards
		And User choose docs & files feature
		Then User should be navigated to the docs & files page
		And User create new folder with "<folderName"> as folder name
		And User add new doc on the folder that have been created but leave title & body document blank
		When User publish the document
		Then The document already created & published
		
		Examples:
			|		folderName							|
 			|		WFH Terms & Conditions	|		
 			
 			
 	@NegativeCase3
	Scenario Outline: Upload files/docs with invalid data
		Given User already login using gmail account
		When User selects one of the available team cards
		And User choose docs & files feature
		Then User should be navigated to the docs & files page
		And User create new folder with "<folderName"> as folder name
		And User upload the document/file with a size larger than the limit
		Then error message will appears
		
		Examples:
			|		folderName							|
 			|		WFH Terms & Conditions	|	