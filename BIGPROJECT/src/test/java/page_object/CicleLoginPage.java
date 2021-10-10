package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;

import utilities.BaseClass;

public class CicleLoginPage extends BaseClass {

	public CicleLoginPage (WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}

//	@FindBy(xpath = "//span[@class='NavHeader_brand__15DaJ navbar-brand']")
//	private WebElement logoCicle;
//	
//	@FindBy(xpath = "//div[@class='AuthPage_AuthPage__container__eW8TR']/img[@src='https://stagingapi.cicle.app/public/images/logo-square center-black.png']")
//	private WebElement imgCicle;
//	
//	@FindBy(xpath = "//h1[.='Please Signin']")
//	private WebElement labelLogin;
//	
//	@FindBy(xpath = "//span[.='Sign in with Google']")
//	private WebElement btnSignInGoogle;
//	
//	@FindBy(xpath = "//span[.='Sign in with Apple ID']")
//	private WebElement btnSignInAppleId;
//	
//	@FindBy(xpath = "//span[.='Berikutnya']")
//	private WebElement btnBerikutnya;
	
//	@FindBy(xpath = "//input")
//	private WebElement emailField;
//	
//	@FindBy(xpath = "//input")
//	private WebElement passwordField;
	
//	public void clickSignInGoogle() {
//		btnSignInGoogle.click();
//	}
	
//	public void clickSignInAppleId() {
//		btnSignInAppleId.click();
//	}
	
//	public void clickBerikutnya() {
//		btnBerikutnya.click();
//	}
	
//	public void setEmail(String email) {
//		emailField.sendKeys(email);
//	}
//	
//	public void setPassword(String password) {
//		passwordField.sendKeys(password);
//	}
	
//	public boolean verifyLoginPageCicle() {
//		logoCicle.isDisplayed();
//		imgCicle.isDisplayed();
//		labelLogin.isDisplayed();
//		btnSignInGoogle.isDisplayed();
//		btnSignInAppleId.isDisplayed();
//		return true;
//	}
	
	public void getCurrentURL() {
		String strUrl = webdriver.getCurrentUrl();
	    System.out.println("Current Url is:"+ strUrl);
	}
	
}
