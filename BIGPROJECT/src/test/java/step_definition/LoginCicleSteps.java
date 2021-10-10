package step_definition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.CicleDashboardPage;
import page_object.CicleLoginPage;

@SuppressWarnings("deprecation")

public class LoginCicleSteps {
	private WebDriver webdriver;

	public LoginCicleSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}

	@Given("User on The Cicle Login Page")
	public void loginCicle() throws Throwable {
		CicleLoginPage login = new CicleLoginPage(webdriver);
		login.getCurrentURL();

	}
	
	@When("User login with Gmail Account")
	public void setLoginGmail() throws Throwable {
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

	}
	
	@Then("User Should be Navigated to Dashboard Cicle")
	public void dashboardPageCicle() throws Throwable {
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
	    
		String actualTeam = dashboard.getTeamName();
	    String expectedTeam = dashboard.getTeamName();
	    assertEquals(expectedTeam, actualTeam);
	    System.out.println("Team Name :" + actualTeam);
	}
	
}
