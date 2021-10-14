package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class CicleGroupChatPage extends BaseClass {

	public CicleGroupChatPage (WebDriver webdriver) {
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
	
//	GROUP CHAT OBJECT
	
	@FindBy(xpath = "//span[.='Home']")
	private WebElement homeLabel;
	
	@FindBy(xpath = "//span[.='Soal D']")
	private WebElement teamSoalDLabel;
	
	@FindBy(xpath = "//h1[.='Group Chat - Soal D']")
	private WebElement groupChatLabel;
	
	@FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
	private WebElement fieldChat;
	
	@FindBy(xpath = "//div[contains(@Class,'CreateGroupMessage_actionSection')]/div/input")
	private WebElement btnAttachFile;
	
	@FindBy(xpath = "//button[@class='rounded-circle btn btn-warning btn-sm']")
	private WebElement btnSendChat;
	
	@FindBy(css = ".infinite-scroll-component .Message_contentMessage__2NnUS p")
	private WebElement chat;
	
// GROUP CHAT METHOD
	public boolean verifyGroupChatPage() {
	cicleLogo.isDisplayed();
	btnChat.isDisplayed();
	btnNotification.isDisplayed();
	btnProfile.isDisplayed();
	homeLabel.isDisplayed();
	teamSoalDLabel.isDisplayed();
	groupChatLabel.isDisplayed();
	fieldChat.isDisplayed();
	btnAttachFile.isDisplayed();
	btnSendChat.isDisplayed();
	return true;
	}
	
	public void clickChatField() {
		fieldChat.click();
	}
	
	public void setChat(String chat) {
		fieldChat.sendKeys(chat);
	}
	
	public void clickSendChat() {
		btnSendChat.click();
	}
	
	public String getChat() 
	{
		return chat.getText();
	}
	
//	UPLOAD FILE METHOD
	public void clickUploadFile(String image) throws Throwable {
		String projectLocation = System.getProperty("user.dir");
		String path = projectLocation + "//lib//files//";
		path = path + image;
		btnAttachFile.sendKeys(path);
	}
	
//	QUIT BROWSER
	public void closeBrowser() {
		webdriver.quit();
	}
}

