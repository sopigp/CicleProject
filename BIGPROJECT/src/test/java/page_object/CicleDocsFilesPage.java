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
	
//	DOC & FILES OBJECT
	
	@FindBy(xpath = "//h1[contains(.,'Docs & Files')]")
	private WebElement labelDocsFiles;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm']")
	private WebElement btnAddDocsFiles;
	
	@FindBy(css = ".RoundActionMenu_container__2ta8s > .MuiSvgIcon-root")
	private WebElement btnAction;
	
//	ADD NEW DOC
	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm']")
	private WebElement btnAdd;
	
	@FindBy(xpath = "//p[.='Add a New Doc']")
	private WebElement btnAddNewDoc;
	
	@FindBy(xpath = "//div[@class='CreateDocPage_inputTitleSection__3PwFx']/textarea[1]")
	private WebElement fieldTitleDoc;
	
	@FindBy(xpath = "//div[@class='fr-element fr-view']")
	private WebElement fieldDescDoc;
	
	@FindBy(xpath = "//div[.='Publish']")
	private WebElement btnPublishDoc;
	
//	CREATE NEW FOLDER
	
	@FindBy(xpath = "//p[.='Create a New Folder']")
	private WebElement btnCreateNewFolder;
	
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement fieldNewFolderName;
	
	@FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
	private WebElement btnSaveFolder;
	
	@FindBy(xpath = "//div[@class='Folder_main__1InOC']")
	private WebElement newFolder;
	
	@FindBy(css = ".Folder_main__title__ecEIq > h1")
	private WebElement folderNameLabel;
	
	@FindBy(css = ".BucketPage_headerSection__2RDI0 h1")
	private WebElement inFolderNameLabel;
	
	@FindBy(xpath = "//div[@class='BucketPage_subscribersItem__2UWS0']")
	private WebElement ownerFolder;
	
// DOC OBJECT
	
	@FindBy(css = ".Doc_main__title__37T5Y > h1")
	private WebElement docTitle;
	
	@FindBy(css = ".fr-view > p")
	private WebElement descDoc;
	
	@FindBy(css = "h1")
	private WebElement inDocTitle;
	
	@FindBy(css = ".fr-view > p")
	private WebElement inDescDoc;
	
// UPLOAD FILE
	@FindBy(xpath = "//p[.='Upload Files']")
	private WebElement btnUploadFiles;
	
	
//	DOCS & FILES METHOD
	
	public boolean verifyDocsFilesPage() {
		cicleLogo.isDisplayed();
		btnChat.isDisplayed();
		btnNotification.isDisplayed();
		btnProfile.isDisplayed();
		labelDocsFiles.isDisplayed();
		btnAddDocsFiles.isDisplayed();
		btnAction.isDisplayed();
		return true;
	}
	
//	ADD NEW FOLDER METHOD
	
	public void clickAdd() {
		btnAdd.click();
	}
	
	public void clickNewFolder() {
		btnCreateNewFolder.click();
	}
	
	public void setFolderName(String folderName) {
		fieldNewFolderName.sendKeys(folderName);
	}
	
	public void clickSaveFolder() {
		btnSaveFolder.click();
	}
	
	public boolean verifyFolder() {
		folderNameLabel.isDisplayed();
		return true;
	}
	
	public void clickFolder() {
		newFolder.click();
	}
	
	public boolean verifyInFolder() {
		inFolderNameLabel.isDisplayed();
		ownerFolder.isDisplayed();
		return true;
	}
	
//	ADD NEW DOC METHOD
	
	public void clickAddNewDoc() {
		btnAddNewDoc.click();
	}
	
	public void setTitleDoc(String title) {
		fieldTitleDoc.sendKeys(title);
	}
	
	public void setDescDoc(String title) {
		fieldDescDoc.sendKeys(title);
	}
		
	public void clickPublish() {
		btnPublishDoc.click();
	}
	
	public boolean verifyDocs() {
		inDocTitle.isDisplayed();
		inDescDoc.isDisplayed();
		return true;
	}
}
