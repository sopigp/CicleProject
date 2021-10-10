package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class CicleTeamPage extends BaseClass {

	public CicleTeamPage (WebDriver webdriver) {
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
	
//	OBJECT TEAM PAGE
	
	@FindBy(xpath = "//span[.='Home']")
	private WebElement homeLabel;
	
	@FindBy(xpath = "//h1[.='Soal D']")
	private WebElement teamSoalD;
	
	@FindBy(xpath = "//p[.='Soal untuk grup D']")
	private WebElement descTeamSoalD;
	
	@FindBy(xpath = "//img[@src='https://lh3.googleusercontent.com/a-/AOh14GgDqxVn9Gj1Tk4-C87TbP8fsj2N8lSOvYMYz4TJjJo=s96-c']")
	private WebElement memberTeam1;
	
	@FindBy(xpath = "//img[@src='https://lh5.googleusercontent.com/-pAz79_aRNbU/AAAAAAAAAAI/AAAAAAAAAAA/AMZuucmNpoIds_mGo_mEn6ETc6b9p2hmtg/s96-c/photo.jpg']")
	private WebElement memberTeam2;
	
	@FindBy(xpath = "//img[@src='https://lh3.googleusercontent.com/a-/AOh14GgF5O9nA7Cj-5OmLr0a402_FQvwUkHgYj4IVvTTqg=s96-c']")
	private WebElement memberTeam3;
	
	@FindBy(xpath = "//img[@src='https://lh3.googleusercontent.com/a-/AOh14GjdVvamPS6__BPZjE1nA82TlnBpABC4xtbK6rdkxA=s96-c']")
	private WebElement memberTeam4;
	
	@FindBy(xpath = "//div[.='Group Chat']")
	private WebElement groupChatLabel;
	
	@FindBy(xpath = "//div[.='Blast!']")
	private WebElement blastLabel;
	
	@FindBy(xpath = "//div[.='Schedule']")
	private WebElement scheduleLabel;
	
	@FindBy(xpath = "//div[.='Board']")
	private WebElement boardLabel;
	
	@FindBy(xpath = "//div[.='Check-Ins']")
	private WebElement checkInsLabel;
	
	@FindBy(xpath = "//div[.='Docs & Files']")
	private WebElement docsFilesLabel;

	
	public boolean verifyTeamPage() {
		cicleLogo.isDisplayed();
		btnChat.isDisplayed();
		btnNotification.isDisplayed();
		btnProfile.isDisplayed();
		teamSoalD.isDisplayed();
		homeLabel.isDisplayed();
		descTeamSoalD.isDisplayed();
		memberTeam1.isDisplayed();
		memberTeam2.isDisplayed();
		memberTeam3.isDisplayed();
		memberTeam4.isDisplayed();
		groupChatLabel.isDisplayed();
		blastLabel.isDisplayed();
		scheduleLabel.isDisplayed();
		boardLabel.isDisplayed();
		checkInsLabel.isDisplayed();
		docsFilesLabel.isDisplayed();
		return true;
	}
		
	public void clickBoardFeature() {
		boardLabel.click();
	}
	
	public void clickGroupFeature() {
		groupChatLabel.click();
	}
	
	public String getTeamName() 
	{
		return teamSoalD.getText();
	}
	
	public String getDescTeam() 
	{
		return descTeamSoalD.getText();
	}
	
}
