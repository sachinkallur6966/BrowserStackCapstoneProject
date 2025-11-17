package com.bstack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bstack.Base.BaseTestForBstack;

public class BstackCheckoutPage  {
 WebDriver driver;
 public BstackCheckoutPage(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 @FindBy(xpath="//div[@class='buy-btn']")
 private WebElement checkOutbtn;
 //locate element firstName
 @FindBy(id="firstNameInput")
 private WebElement fname;
 //locate element lastname 
 @FindBy(id="lastNameInput")
 private WebElement lname;
 //locate address feild
 @FindBy(id="addressLine1Input")
 private WebElement address;
 //locate feild state
 @FindBy(id="provinceInput")
 private WebElement state;
 //locate postal code feild
 @FindBy(id="postCodeInput")
 private WebElement postalCode;
 //click on submit element
 @FindBy(xpath="//button[contains(@id,'checkout')]")
 private WebElement submit;
 //confirmation message
 @FindBy(id="confirmation-message")
 private WebElement confMsg;
 //locate cart bag element 
@FindBy(xpath="//span[contains(@class,'bag bag')]")
private WebElement cartBagEle;
//findElement continue shopping 
@FindBy(xpath="//div[text()='Continue Shopping']")
private WebElement contShopping;
 
 
 
 public void checkout()
 {
	 checkOutbtn.click();
 }
 public String shippingAddress()
 {
	 fname.sendKeys("Sachin");
	 lname.sendKeys("kallur");
	 address.sendKeys("Bidar");
	 state.sendKeys("karnataka");
	 postalCode.sendKeys("585221");
	 submit.click();
	 return confMsg.getText();
	 
 }
 public void clickOnBag()
 {
	 cartBagEle.click();
 }
 public void clickOnContiShopping()
 {
	 contShopping.click();
 }
}
