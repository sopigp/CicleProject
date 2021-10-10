@KanbanBoard
Feature: Board Cicle
	User want add new board in team room of cicle
 	
 	@PositiveCase
	Scenario Outline: Add New Board with valid Data
		Given User already login using gmail account
		When User selects one of the available team cards
		And User choose board feature
		Then User should be navigated to the board page
		And User add list kanban board with "<listName>" as list name
		And User add card on the list of kanban board that have been created with "<cardName>" as name card
		And User completes card details with input "<notes>" as notes, "<comments>" as comment, "<labels>" as label, "<date>" as date, "<time>" as time
#		Then card details already created

		Examples:
			|		listName		|		cardName					|											notes										|	comments							| 	labels	|		date			|		time			| 
 			|		Backlog			|		Add Rate Feature	| User can add rate after transaction success	| ok, noted. thank you	| sprint1		| 10/08/2021	|		11:22 AM	|
 		
 		
 #	@NegativeCase1
#	Scenario: Add New Board with invalid Data
#		Given User already login using gmail account
#		When User selects one of the available team cards
#		And User choose board feature
#		Then User should be navigated to the board page
#		And User add list kanban board but leave list name card blank
#		Then error message will appears
#		
#		
#	@NegativeCase2
#	Scenario Outline: Add New Board with invalid Data
#		Given User already login using gmail account
#		When User selects one of the available team cards
#		And User choose board feature
#		Then User should be navigated to the board page
#		And User add list kanban board with "<listName"> as list name card
#		And User add card on the list of kanban board that have been created but leave name card blank
#		Then error message will appears
#		
#		Examples:
#			|		listName		|		cardName		| 
 #			|		Backlog			|								|
 #			
 #			
 #	@NegativeCase3
#	Scenario Outline: Add New Board with invalid Data
#		Given User already login using gmail account
#		When User selects one of the available team cards
#		And User choose board feature
#		Then User should be navigated to the board page
#		And User add list kanban board with "<listName"> as list name card
#		And User add card on the list of kanban board that have been created with "<cardName"> as name card
#		Then User should be navigated to the card details
#		And User click "<notes>", "<comments>"but leave its blank
#		Then The board still empty
#	
#		Examples:
#			|		listName		|		cardName			|	notes		|	comments	| 
 #			|		Backlog			|		Negative TC		| 				| 					|
 			
 			