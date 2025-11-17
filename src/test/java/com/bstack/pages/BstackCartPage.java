package com.bstack.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BstackCartPage {
	WebDriver driver;
	
	public BstackCartPage(WebDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//div[@class='shelf-item__buy-btn'])[1]")
	WebElement addToCartEle1;
	//locate quantity element from cart page 
	@FindBy(xpath="//p[@class='desc']")
	WebElement quantityEle;
	//locating the multiple items in cart
	@FindBy(xpath="//div[@class='float-cart__shelf-container']")
	List<WebElement> listItems;
	//Item Number second
	@FindBy(xpath="(//div[@class='shelf-item__buy-btn'])[2]")
	WebElement addToCartEle2;

	@FindBy(xpath="(//div[@class='shelf-item__buy-btn'])[3]")
	WebElement addToCartEle3;
	//locate the element to find count in bags
	@FindBy(xpath="//span[@class='bag__quantity']")
	WebElement bagNumberEle;
	//locate logout
	@FindBy(xpath="//span[@id='signin']")
	WebElement logoutEle;
	//Locating to Remove Items fro cart
	@FindBy(xpath="(//div[@class='shelf-item__del'])")
	List<WebElement> deleteItems;
	
	
	public void AddItemToCart()
	{
		addToCartEle1.click();//Iphone 12 will be added to cart
		
	}
	public String verifyCountItemsInCart()
	{
		String quantityCount=quantityEle.getText();
		return quantityCount;
	}
	public void addMultipleItemsToCart()
	{

		addToCartEle1.click();//Iphone 12 will be added to cart
		addToCartEle2.click();//iphone 12 mini will be added to cart
		addToCartEle3.click();//iphone 12 promax will be added to cart
		
	}
	public String CountItemsInCart()
	{
		return bagNumberEle.getText();
	}
	public void logout()
	{
		logoutEle.click();
	}
	public void deleteItems()
	{
		for(WebElement item:deleteItems)	
		{
			item.click();
		}
	}
	

}
