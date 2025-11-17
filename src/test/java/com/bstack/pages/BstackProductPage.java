package com.bstack.pages;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BstackProductPage {
	WebDriver driver ;
	public BstackProductPage(WebDriver driver ) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class=\"shelf-container\"]//p")
	private List<WebElement> itemNames;
	
	
	public List<String> getItemNames()
	{
	    List<String> names = new ArrayList<>();

		for(WebElement li:itemNames)
		{
			 names.add(li.getText());
		}
		return names;
	 
		
	}
	

}
