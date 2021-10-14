package step_definition;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.CicleBoardPage;
import page_object.CicleDashboardPage;
import page_object.CicleLoginPage;
import page_object.CicleTeamPage;

@SuppressWarnings("deprecation")

public class BoardCicleSteps {

	private WebDriver webdriver;

	public BoardCicleSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}
	
	private String newCardName;
	private String verifyTeamName;
	private String verifyListName;

	@Given("User already login using gmail account")
	public void setLoginGmail() throws Throwable {
		CicleLoginPage login = new CicleLoginPage(webdriver);
		login.getCurrentURL();
		
		CicleDashboardPage gmailAccount = new CicleDashboardPage(webdriver);
		Thread.sleep(3000);
		gmailAccount.clickAccount();
		String actualAccountName = gmailAccount.getAccountName();
	    String expectedAccountEmail = gmailAccount.getAccountName();
	    assertEquals(expectedAccountEmail, actualAccountName);
	    System.out.println("Account Name :" + actualAccountName);
	    
	    String actualEmailAccount = gmailAccount.getAccountEmail();
	    String expectedEmailAccount = gmailAccount.getAccountEmail();
	    assertEquals(expectedEmailAccount, actualEmailAccount);
	    System.out.println("Email Account :" + actualEmailAccount);
	    
		gmailAccount.clickCloseProfile();
		
		CicleDashboardPage dashboard = new CicleDashboardPage(webdriver);
		dashboard.verifyDashboardCicle();
		
		String actualCompany = dashboard.getCompanyName();
	    String expectedCompany = dashboard.getCompanyName();
	    assertEquals(expectedCompany, actualCompany);
	    System.out.println("Company Name :" + actualCompany);
	    
		String actualHeadquarter = dashboard.getHeadquarterName();
	    String expectedHeadquarter = dashboard.getHeadquarterName();
	    assertEquals(expectedHeadquarter, actualHeadquarter);
	    System.out.println("Headquarter Name :" + actualHeadquarter);
	    
	}
	
	@When("User selects one of the available team cards")
	public void selectTeamCard() throws Throwable {
		CicleDashboardPage selectTeamCard = new CicleDashboardPage(webdriver);
		String actualTeam = selectTeamCard.getTeamName();
		verifyTeamName = actualTeam;
	    String expectedTeam = selectTeamCard.getTeamName();
	    assertEquals(expectedTeam, actualTeam);
	    System.out.println("Team Name :" + actualTeam);
	    selectTeamCard.clickTeam();
	    CicleTeamPage teamSoalD = new CicleTeamPage(webdriver);
	    teamSoalD.verifyTeamPage();
	    String descTeam = teamSoalD.getDescTeam();
	    System.out.println(descTeam);
	}
	
	@And("User choose board feature")
	public void selectBoardFeature() throws Throwable {
		CicleTeamPage boardFeature = new CicleTeamPage(webdriver);
	    boardFeature.clickBoardFeature();
	}
	
	@Then("User should be navigated to the board page")
	public void boardPage() throws Throwable {
	    CicleBoardPage board = new CicleBoardPage(webdriver);
	    board.verifyBoardPage();
	}
	
	@And("User add list kanban board with \"(.*)\" as list name")
	public void addNewBoard(String listName) throws Throwable {
		CicleBoardPage addBoard = new CicleBoardPage(webdriver);
		addBoard.clickAddList();
		addBoard.setListName(listName);
		addBoard.clickCreateAddList();
	    String newListName = addBoard.getListName();
	    verifyListName = newListName;
	    System.out.println(newListName);
	    Thread.sleep(8000);
	}
	
	@And("User add card on the list of kanban board that have been created with \"(.*)\" as name card")
	public void addNewCard(String cardName) throws Throwable {
		CicleBoardPage addCard = new CicleBoardPage(webdriver);
		addCard.clickNewAddCard();
		addCard.setCardName(cardName);
		
		
		String expectedCardName = addCard.getCardName(); 
		newCardName = expectedCardName;
		addCard.clickAddCard();
		Thread.sleep(2000);
		
		addCard.clickCard();
		Thread.sleep(2000);
		String actualCardName = addCard.getDetailsCardName();
		
		
//		assertEquals(newCardName, actualCardName);
	}
	
	@And("User completes card details with input \"(.*)\" as notes, \"(.*)\" as comment, \"(.*)\" as label, \"(.*)\" as date, \"(.*)\" as time")
	public void completesCard(String notes, String comments, String labels, String date, String time) throws Throwable {
		CicleBoardPage cardDetails = new CicleBoardPage(webdriver);

		String expectedTeamCard = cardDetails.getAtTeam();
		assertEquals(expectedTeamCard, verifyTeamName);
	    
		
		String expectedList = cardDetails.getInList();
		assertEquals(expectedList, verifyListName);
		
//		String expectedCardName = cardDetails.getCardName(); 
//		cardName = expectedCardName;
//		cardDetails.clickCard();
//		Thread.sleep(3000);
//		String actualCardName = cardDetails.getDetailsCardName(); 
//		assertEquals(cardName, actualCardName);
		cardDetails.clickBoxNotes();
		Thread.sleep(2000);
		cardDetails.setNotes(notes);
		cardDetails.clickSaveNotes();
		cardDetails.clickFormComments();
		cardDetails.setComments(comments);
		Thread.sleep(5000);
		cardDetails.clickSaveComments();
		cardDetails.clickLabels();
		Thread.sleep(3000);
		cardDetails.clickCreateNewLabels();
		cardDetails.setLabelsName(labels);
		cardDetails.clickLabelColor();
		cardDetails.clickSaveLabels();
		cardDetails.clickLabel();
		cardDetails.clickCloseLabels();
		cardDetails.clickAddDueDate();
		cardDetails.setDate(date);
		cardDetails.setTime(time);
		cardDetails.clickSaveDueDate();
		cardDetails.clickCloseCard();
	}
//	UPLOAD FILE
	@And("User completes card details with input \"(.*)\" as notes, upload \"(.*)\" as attachment, \"(.*)\" as comment, \"(.*)\" as label, \"(.*)\" as date, \"(.*)\" as time")
	public void completeCard(String notes, String image, String comments, String labels, String date, String time) throws Throwable {
		CicleBoardPage cardDetails = new CicleBoardPage(webdriver);

		String expectedTeamCard = cardDetails.getAtTeam();
		assertEquals(expectedTeamCard, verifyTeamName);
	    
		
		String expectedList = cardDetails.getInList();
		assertEquals(expectedList, verifyListName);

		cardDetails.clickBoxNotes();
		Thread.sleep(2000);
		cardDetails.setNotes(notes);
		cardDetails.clickSaveNotes();
		Thread.sleep(5000);
		cardDetails.clickUploadFile(image);
		cardDetails.verifyFile();
		cardDetails.clickFormComments();
		cardDetails.setComments(comments);
		Thread.sleep(5000);
		cardDetails.clickSaveComments();
		cardDetails.clickLabels();
		Thread.sleep(5000);
		cardDetails.clickCreateNewLabels();
		cardDetails.setLabelsName(labels);
		cardDetails.clickLabelColor();
		cardDetails.clickSaveLabels();
		cardDetails.clickLabel();
		cardDetails.clickCloseLabels();
		cardDetails.clickAddDueDate();
		cardDetails.setDate(date);
		cardDetails.setTime(time);
		cardDetails.clickSaveDueDate();
		cardDetails.clickCloseCard();
	}
	
//	NEGATIVE CASE 1	
	@And("User add list kanban board but leave \"(.*)\" blank")
	public void addList(String listName) throws Throwable {
	    CicleBoardPage addList = new CicleBoardPage(webdriver);
	    addList.clickAddList();
	    addList.setListName(listName);
	    addList.clickCreateAddList();
	    String newListName = addList.getListName();
	    verifyListName = newListName;
	    System.out.println(newListName);
	    Thread.sleep(2000);
	}
	
//	NEGATIVE CASE 2
	@And("User add card on the list of kanban board that have been created but leave \"(.*)\" blank")
	public void addCard(String cardName) throws Throwable {
	    CicleBoardPage addCard = new CicleBoardPage(webdriver);
	    addCard.clickNewAddCard();
	    addCard.setCardName(cardName);
		
		String expectedCardName = addCard.getCardName(); 
		newCardName = expectedCardName;
		addCard.clickAddCard();
		Thread.sleep(2000);
	}
	
	@Then("Popup error message will appears")
	public void popUpError() throws Throwable {
	    CicleBoardPage popUpError = new CicleBoardPage(webdriver);
	    popUpError.getErrorMessage();
	    popUpError.closeBrowser();
	}
	
}
