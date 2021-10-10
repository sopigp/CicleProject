package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class CicleDashboardPage extends BaseClass {

	public CicleDashboardPage (WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
//	HEADER OBJECT
	
	@FindBy(xpath = "//span[@class='NavHeader_brand__15DaJ navbar-brand']")
	private WebElement cicleLogo;
	
	@FindBy(xpath = "//div[@class='NavIcon_back__17EAr']")
	private WebElement btnChat;
	
	@FindBy(xpath = "//div[2]/div[@class='NavIcon_back__17EAr']")
	private WebElement btnNotification;
	
	@FindBy(xpath = "//div[@class='NavHeader_navMemberSection__ApwJH']")
	private WebElement btnProfile;
	
//	PROFILE OBJECT
	@FindBy(className = "ImageMember_image__x7ApH")
	private WebElement photoProfile;
	
	@FindBy(css = ".UserProfile_text__1qq9b > p")
	private WebElement nameAccount;
	
	@FindBy(css = ".UserProfile_text__1qq9b > span")
	private WebElement emailAccount;
	
	@FindBy(css = "[d='M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z']")
	private WebElement btnCloseProfile;
	
//	OBJECT DASHBOARD PAGE

	@FindBy(xpath = "//button[@class='btn btn-dark btn-block btn-sm']")
	private WebElement companyName;
	
	@FindBy(xpath = "//h1[.='SQA']")
	private WebElement companyLabel;
	
	@FindBy(xpath = "//h1[.='Sekolah QA HQ']")
	private WebElement headQuarterLabel;
	
	@FindBy(xpath = "//h1[.='Soal D']")
	private WebElement teamsLabel;
	
	@FindBy(xpath = "//h1[.='You can create a Project too']")
	private WebElement projectLabel;
	
	@FindBy(xpath = "//div[1]/button[@class='btn btn-primary btn-sm']")
	private WebElement btnAddHeadquarter;
	
	@FindBy(xpath = "//div[3]/button[@class='btn btn-primary btn-sm']")
	private WebElement btnAddTeams;
	
	@FindBy(xpath = "//div[5]/button[@class='btn btn-primary btn-sm']")
	private WebElement btnAddProjects;
		
	public boolean verifyDashboardCicle() {
		cicleLogo.isDisplayed();
		btnChat.isDisplayed();
		btnNotification.isDisplayed();
		btnProfile.isDisplayed();
		companyName.isDisplayed();
		companyLabel.isDisplayed();
		headQuarterLabel.isDisplayed();
		teamsLabel.isDisplayed();
		projectLabel.isDisplayed();
		btnAddHeadquarter.isDisplayed();
		btnAddTeams.isDisplayed();
		btnAddProjects.isDisplayed();
		return true;
	}
	
	public void clickAccount() 
	{
		photoProfile.click();
	}
	
	public String getAccountName() 
	{
		return nameAccount.getText();
	}
	
	public String getAccountEmail() 
	{
		return emailAccount.getText();
	}
	
	public void clickCloseProfile() 
	{
		btnCloseProfile.click();
	}
	
	public String getCompanyName() 
	{
		return companyLabel.getText();
	}
	
	public String getHeadquarterName() 
	{
		return headQuarterLabel.getText();
	}
	
	public String getTeamName() 
	{
		return teamsLabel.getText();
	}
	
	public void clickTeam() 
	{
		teamsLabel.click();
	}
	
}
