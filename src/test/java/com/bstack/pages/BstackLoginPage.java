package com.bstack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class BstackLoginPage {
	WebDriver driver;

	public BstackLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// find username feild InputEle
	@FindBy(xpath = "//input[@id='react-select-2-input']")
	private WebElement undemouserInputEle;
	@FindBy(xpath="(//div[@class=' css-1hwfws3'])[1]")
	private WebElement undemouserDivEle;
	@FindBy(xpath="//div[@id='react-select-2-option-1']")
	private WebElement clickOnCreateUn;
	// select valid username
	@FindBy(xpath = "//div[@id='react-select-2-option-0-0']")
	private WebElement selectdemouser;
	
    // locate password feild using div element 
	@FindBy(xpath="(//div[@class=' css-1hwfws3'])[2]")
	private WebElement pswDivEle;
	//locate and click on createElement ofpassword
	@FindBy(xpath="//div[@id='react-select-3-option-1']")
	WebElement clickOnCreatePsw;
	// find password feild located using Input ele
	@FindBy(xpath = "//input[@id='react-select-3-input']")
	private WebElement pswInputEle;
	// Select password
	
	@FindBy(xpath = "//div[@id='react-select-3-option-0-0']")
	private WebElement selectPsw;
	// click On login
	@FindBy(id = "login-btn")
	private WebElement loginBtn;
	//locate h3 heading element to get Error 
	@FindBy(xpath="//h3[@class='api-error']")
	private WebElement errorEle;

	public void selectUsername()
	{
		undemouserDivEle.click();
		selectdemouser.click();
	}

	public void selectPassword() {
		pswDivEle.click();
		selectPsw.click();
	}

	public void clickOnLogin() {
		loginBtn.click();
	}

	public void checkForsuccessfullLogin() {
		String exp = "https://bstackdemo.com/?signin=true";
		Assert.assertEquals(exp,driver.getCurrentUrl());
	}

	public void invalidCredentials()  {
		undemouserDivEle.click();
		undemouserInputEle.sendKeys("testuser");
		clickOnCreateUn.click();
		pswDivEle.click();
		pswInputEle.sendKeys("testuser123");
		clickOnCreatePsw.click();
		
	}
	public String getErrorMsg()
	{
		String message=errorEle.getText();	
		return message;
	}

	

}
