package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class CicleBoardPage extends BaseClass {

	public CicleBoardPage (WebDriver webdriver)  {
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
	

//	BOARD OBJECT
	@FindBy(xpath = "//span[.='Home']")
	private WebElement homeLabel;
	
	@FindBy(xpath = "//span[.='Soal D']")
	private WebElement teamSoalDLabel;
	
	@FindBy(xpath = "//div[@class='Button_container__1WNuB Button_flexStart__2nS1S']")
	private WebElement addListBoard;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement fieldAddListNameBoard;
	
	@FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
	private WebElement btnCreateListBoard;
	
	@FindBy(xpath = "//div[@class='ListContainer_ListContainer__noMargin__uGZef ListContainer_headerSection__1imwD row']")
	private WebElement nameListBoard;
	
//	CARD OBJECT
	
	@FindBy(xpath = "//a[.='Add Card']")
	private WebElement btnAddNewCard;
	
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement fieldAddCardNameBoard;
	
	@FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
	private WebElement btnAddCard;
	
	@FindBy(css = ".ModalLinkNoDecor_ModalLink__1zSCj")
	private WebElement cardCreated;
	
	@FindBy(xpath = "//div[@class='modal-title h4']")
	private WebElement detailsCardName;
	
//	@FindBy(xpath = ".RoundActionMenu_container__2ta8s > .MuiSvgIcon-root")
//	private WebElement actionMenu;
	
	@FindBy(id = "editCardMenuIcon")
	private WebElement btnEditCard;
	
	@FindBy(xpath = "//div[@id='notistack-snackbar']")
	private WebElement errorMessage;
	
//	ARCHIVED ITEMS OBJECT
	
	@FindBy(xpath = "//p[.='Archived Items']")
	private WebElement btnArchivedItems;
	
//	SEARCH OBJECT
	
	@FindBy(xpath = "//p[.='Search']")
	private WebElement btnSearch;
	
//	CARD DETAILS OBJECT
	@FindBy(className = "CardDetailContainer_listAndTeamSection__listName__wWqcb")
	private WebElement inList;
	
	@FindBy(xpath = "//a[2]")
	private WebElement atTeam;
	
	@FindBy(xpath = "//div[@class='modal-title h4']")
	private WebElement titleCardDetails;
	
	@FindBy(xpath = "//p[@class='ManageDesc_mediumTitle__2evhm']")
	private WebElement labelNotes;
	
	@FindBy(xpath = "//div[@class='ManageDesc_sectionEmptyDesc__md0ll']")
	private WebElement boxNotes;
	
	@FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
	private WebElement fieldNotes;
	
	@FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
	private WebElement btnNotes;
	
	@FindBy(xpath = "//p[@class='ManageAttachments_mediumTitle__8RnWX']")
	private WebElement labelAttachments;
	
	@FindBy(xpath = "//div[contains(@Class, 'CardDetailContainer_CardDetailContainer__sideColumn')]//input")
	private WebElement fieldAttachments;
	
	@FindBy(xpath = "//h1[.='fototesting.jpg']")
	private WebElement fileUploaded;
	
	@FindBy(xpath = "//p[@class='CommentsSectionContainer_CommentsSectionContainer__mediumTitle__2KVWn']")
	private WebElement labelComments;
	
	@FindBy(xpath = "//div[@class='CheersButton_container__3mdsQ']")
	private WebElement btnCheers;
	
	@FindBy(xpath = "//input[@class='CreateCommentForm_formInitial__3AVVg form-control']")
	private WebElement formComments;
	
	@FindBy(xpath = "//div[@class='fr-element fr-view']")
	private WebElement fieldComments;
	
	@FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
	private WebElement btnSaveComments;
	
	@FindBy(xpath = "//span[.='×']")
	private WebElement btnCloseCard;
	
//	ADD TO CARD DETAILS OBJECT
	
	@FindBy(xpath = "//div[@class='CardDetailContainer_buttonAction__2Sfwo']//div[contains(.,'Members')]")
	private WebElement btnAddMembers;
	
	@FindBy(xpath = "//p[.='Muhammad Fakhri Abdillah']")
	private WebElement chooseTeamMembers;
	
	@FindBy(css = ".ManageMembersContainer_ManageMembersContainer__body__1skzm > div:nth-of-type(1) .MuiSvgIcon-root")
	private WebElement checklisboxToggleMember;
	
	@FindBy(xpath = "//button[contains(.,'Labels')]")
	private WebElement btnLabels;
	
	@FindBy(xpath = "//button[@class='btn btn-light btn-block btn-sm']")
	private WebElement btnCreateNewLabel;
	
	@FindBy(css = "[placeholder='Input name']")
	private WebElement fieldLabelsName;
	
	@FindBy(xpath = "//div[@class='CreateLabel_CreateLabelContainer__body__1tydf']/div[5]")
	private WebElement labelColor;
	
	@FindBy(className = "Label_label__block__3aY7I")
	private WebElement chooseLabel;
	
	@FindBy(css = "[d='M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z']")
	private WebElement closeLabels;
	
	@FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
	private WebElement btnCreateLabel;
	
	@FindBy(xpath = "//button[contains(.,'Due Date')]")
	private WebElement btnDueDate;
	
	@FindBy(id = "date-picker-dialog")
	private WebElement dateCard;
	
	@FindBy(id = "time-picker")
	private WebElement timeCard;
	
	@FindBy(xpath = "//div[.='Save']")
	private WebElement btnSaveDueDate;
		
	@FindBy(xpath = "//button[contains(.,'Attach File')]")
	private WebElement btnAttachFile;
	
	@FindBy(xpath = "//button[contains(.,'Move')]")
	private WebElement btnMove;
	
	@FindBy(xpath = "//button[contains(.,'Private Card')]")
	private WebElement btnPrivateCard;
	
	@FindBy(xpath = "//button[contains(.,'Archive')]")
	private WebElement btnArchive;
	
//	BOARD PAGE
	public boolean verifyBoardPage() {
		cicleLogo.isDisplayed();
		btnChat.isDisplayed();
		btnNotification.isDisplayed();
		btnProfile.isDisplayed();
		homeLabel.isDisplayed();
		teamSoalDLabel.isDisplayed();
		addListBoard.isDisplayed();
		btnSearch.isDisplayed();
		btnArchivedItems.isDisplayed();
		return true;
	}
	
	public String getTeamName() 
	{
		return teamSoalDLabel.getText();
	}
	
//	ADD NEW LIST MEHOD
	public void clickAddList() {
		addListBoard.click();
	}
	
	public void setListName(String listName) {
		fieldAddListNameBoard.sendKeys(listName);
	}
	
	public void clickCreateAddList() {
		btnCreateListBoard.click();
	}
	
	public String getListName() 
	{
		return nameListBoard.getText();
	}
	
//	ADD NEW CARD METHOD
	public void clickNewAddCard() {
		btnAddNewCard.click();
	}
	
	public void setCardName(String cardName) {
		fieldAddCardNameBoard.sendKeys(cardName);
	}
	
	public void clickAddCard() {
		btnAddCard.click();
	}
	
	public String getCardName() 
	{
		return fieldAddCardNameBoard.getText();
	}
	
//	public String getCardName() 
//	{
//		return cardCreated.getText();
//	}
//	
//	COMPLETE CARD DETAILS
	public String getInList() 
	{
		return inList.getText();
	}
	
	public String getAtTeam() 
	{
		return atTeam.getText();
	}
	
	public void clickCard() {
		cardCreated.click();
	}
	
	public String getDetailsCardName() 
	{
		return detailsCardName.getText();
	}
	
//	**NOTES
	public void clickBoxNotes() {
		boxNotes.click();
	}
	
	public void setNotes(String notes) {
		fieldNotes.sendKeys(notes);
	}
	
	public void clickSaveNotes() {
		btnNotes.click();
	}

	public void clickFormComments() {
		formComments.click();
	}
	
//	**COMMENTS
	
	public void setComments(String comments) {
		fieldComments.sendKeys(comments);
	}

	public void clickSaveComments() {
		btnSaveComments.click();
	}
	
//	**LABELS
	
	public void clickLabels() {
		btnLabels.click();
	}
	
	public void clickCreateNewLabels() {
		btnCreateNewLabel.click();
	}
	
	public void setLabelsName(String labels) {
		fieldLabelsName.sendKeys(labels);
	}
	
	public void clickLabelColor() {
		labelColor.click();
	}
	
	public void clickLabel() {
		chooseLabel.click();
	}
	
	public void clickSaveLabels() {
		btnCreateLabel.click();
	}
	
	public void clickCloseLabels() {
		closeLabels.click();
	}
	
//	**DUEDATE
	
	public void clickAddDueDate() {
		btnDueDate.click();
	}
	
	public void setDate(String date) {
		dateCard.sendKeys(date);
	}
	public void setTime(String time) {
		timeCard.sendKeys(time);
	}
	
	public void clickSaveDueDate() {
		btnSaveDueDate.click();
	}
	
//	**CLOSE CARD DETAILS
	public void clickCloseCard() {
		btnCloseCard.click();
	}
	
//	ERROR MESSAGE
	public String getErrorMessage() {
		return errorMessage.getText();
	}
	
//	UPLOAD FILE METHOD
	public void clickUploadFile(String image) throws Throwable {
		String projectLocation = System.getProperty("user.dir");
		String path = projectLocation + "//lib//files//";
		path = path + image;
		fieldAttachments.sendKeys(path);
	}
	
	public boolean verifyFile() {
		fileUploaded.isDisplayed();
		return true;
	}
	
//	QUIT BROWSER
	public void closeBrowser() {
		webdriver.quit();
	}
}
