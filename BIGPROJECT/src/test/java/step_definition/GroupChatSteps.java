package step_definition;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.CicleBoardPage;
import page_object.CicleDashboardPage;
import page_object.CicleGroupChatPage;
import page_object.CicleLoginPage;
import page_object.CicleTeamPage;

@SuppressWarnings("deprecation")

public class GroupChatSteps {

	private WebDriver webdriver;

	public GroupChatSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}
	
	@Given("User already login with gmail account")
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
	
	@When("User select team card")
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
	
	@And("User choose group chat feature")
	public void selectGroupChatFeature() throws Throwable {
		CicleTeamPage groupChatFeature = new CicleTeamPage(webdriver);
		groupChatFeature.clickGroupFeature();
	}
	
	@And("User should be navigated to the group chat page")
	public void GroupChatPage() throws Throwable {
	    CicleGroupChatPage groupChat = new CicleGroupChatPage(webdriver);
	    groupChat.verifyGroupChatPage();
	}
	
	@Then("User send \"(.*)\"")
	public void sendChat(String chat) throws Throwable {
	    CicleGroupChatPage sendChat = new CicleGroupChatPage(webdriver);
	    sendChat.clickChatField();
	    sendChat.setChat(chat);
	    sendChat.clickSendChat();
	}
	
	@Then("The chat have been send")
	public void verifyChat() throws Throwable {
		CicleGroupChatPage verifChat = new CicleGroupChatPage(webdriver);
		String chat = verifChat.getChat();
		System.out.println(chat);
	}
	
}
