package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class CicleDocsFilesPage extends BaseClass {

	public CicleDocsFilesPage (WebDriver webdriver) {
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
	
//	ADD DOC & FILES
	
	@FindBy(xpath = "//h1[contains(.,'Docs & Files')]")
	private WebElement labelDocsFiles;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm']")
	private WebElement btnAddDocsFiles;
	
	@FindBy(xpath = "//h1[.='Add items to this folder']")
	private WebElement labelAddItems;
	
//	add new doc
	@FindBy(xpath = "//p[.='Add a New Doc']")
	private WebElement btnAddNewDoc;
	
	@FindBy(xpath = "//div[@class='CreateDocPage_inputTitleSection__3PwFx']/textarea[1]")
	private WebElement titleDoc;
	
	@FindBy(xpath = "//div[@class='fr-element fr-view']")
	private WebElement descDoc;
	
	@FindBy(xpath = "//div[.='Publish']")
	private WebElement btnPublishDoc;
	
//	create a new folder
	
	@FindBy(xpath = "//p[.='Create a New Folder']")
	private WebElement btnCreateNewFolder;
	
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement fieldNewFolderName;
	
	@FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
	private WebElement btnSave;
	
	@FindBy(xpath = "//div[@class='Folder_Folder__KnpzQ']")
	private WebElement newFolder;
	
	@FindBy(xpath = "//div[@class='BucketPage_subscribersItem__2UWS0']")
	private WebElement ownerFolder;
	
//	upload files
	@FindBy(xpath = "//p[.='Upload Files']")
	private WebElement btnUploadFiles;
	

	
//	public void clickSignInGoogle() {
//		btnSignInGoogle.click();
//	}
//	
//	
//	public boolean verifyLoginPageCicle() {
//		logoCicle.isDisplayed();
//		return true;
//	}

	
}
