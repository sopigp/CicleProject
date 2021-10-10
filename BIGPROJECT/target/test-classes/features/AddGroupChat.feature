@GroupChat
Feature: Group Chat Cicle
	User start chating in group chat cicle
 	
 	@PositiveCase1
	Scenario Outline: Start chating with valid Data
		Given User already login with gmail account
		When User select team card
		And User choose group chat feature
		Then User should be navigated to the group chat page
		And User send "<chat>"
		Then The chat have been send
	
		Examples:
			|										chat							| 
 			|		Hi All, apa kabs nih?							|
 			
 			
 #	@PositiveCase2
#	Scenario Outline: Start chating with valid Data
#		Given User already login using gmail account
#		When User selects one of the available team cards
#		And User choose group chat feature
#		Then User should be navigated to the group chat page
#		And User type "<chat>" with tag someone in the group chat
#		Then Chat have been send
#	
#		Examples:
#			|						chat										| 
 #			|		Hi kak, gimana kerjaan lancar?	|	
 #			
 #	@PositiveCase3
#	Scenario Outline: Start chating with valid Data
#		Given User already login using gmail account
#		When User selects one of the available team cards
#		And User choose group chat feature
#		Then User should be navigated to the group chat page
#		And User send "<chat>"
#		When User delete the message on the group chat
#		Then Message text will disappear
#	
#		Examples:
#			|						chat																	| 
 #			|		Hi All, kerjaan terkait publikasi udh beres?	|	
 #			
 #			
 #	@NegativeCase1
#	Scenario: Start chating with invalid Data
#		Given User already login using gmail account
#		When User selects one of the available team cards
#		And User choose group chat feature
#		Then User should be navigated to the group chat page
#		And User the document/file with a size larger than the limit
#		Then error message will appears