package step_definition;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.CicleDashboardPage;
import page_object.CicleDocsFilesPage;
import page_object.CicleGroupChatPage;
import page_object.CicleLoginPage;
import page_object.CicleTeamPage;

@SuppressWarnings("deprecation")

public class DocsFilesSteps {

	private WebDriver webdriver;

	public DocsFilesSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}
	
	@Given("User already login in Cicle Website")
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
	
	@When("User select team")
	public void selectTeamCard() throws Throwable {
		CicleDashboardPage selectTeamCard = new CicleDashboardPage(webdriver);
		String actualTeam = selectTeamCard.getTeamName();
	    String expectedTeam = selectTeamCard.getTeamName();
	    assertEquals(expectedTeam, actualTeam);
	    System.out.println("Team Name :" + actualTeam);
	    selectTeamCard.clickTeam();
	    CicleTeamPage teamSoalD = new CicleTeamPage(webdriver);
	    teamSoalD.verifyTeamPage();
	    String descTeam = teamSoalD.getDescTeam();
	    System.out.println(descTeam);
	}
	
	@And("User choose docs & files feature")
	public void selectDocsFilesFeature() throws Throwable {
		CicleTeamPage docsFilesFeature = new CicleTeamPage(webdriver);
		docsFilesFeature.clickDocsFilesFeature();
	}
	
	@And("User should be navigated to the docs & files page")
	public void DocsFilesPage() throws Throwable {
	    CicleDocsFilesPage docsFilesPage = new CicleDocsFilesPage(webdriver);
	    docsFilesPage.verifyDocsFilesPage();
	}
	
	@Then("User create new folder with \"(.*)\" as folder name")
	public void sendChat(String folderName) throws Throwable {
		CicleDocsFilesPage createNewFolder = new CicleDocsFilesPage(webdriver);
		createNewFolder.clickAdd();
		createNewFolder.clickNewFolder();
		createNewFolder.setFolderName(folderName);
		createNewFolder.clickSaveFolder();
		createNewFolder.verifyFolder();
		createNewFolder.clickFolder();
	}
	
	@Then("User add new doc on the folder that have been created with \"(.*)\" as title document and \"(.*)\" as body document")
	public void addNewDoc(String titleDoc, String descDoc) throws Throwable {
		CicleDocsFilesPage addNewDoc = new CicleDocsFilesPage(webdriver);
		addNewDoc.verifyInFolder();
		addNewDoc.clickAdd();
		addNewDoc.clickAddNewDoc();
		addNewDoc.setTitleDoc(titleDoc);
		addNewDoc.setDescDoc(descDoc);
	}
	
	@Then("User publish the document")
	public void publishDoc() throws Throwable {
		CicleDocsFilesPage publishDoc = new CicleDocsFilesPage(webdriver);
		publishDoc.clickPublish();
	}
	
	@Then("The document already created & published")
	public void docCreated() throws Throwable {
		CicleDocsFilesPage verifyDoc = new CicleDocsFilesPage(webdriver);
		verifyDoc.verifyDocs();
	}
	
}
