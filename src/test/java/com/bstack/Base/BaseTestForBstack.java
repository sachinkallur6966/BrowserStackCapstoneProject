package com.bstack.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import com.bstack.pages.BstackCartPage;
import com.bstack.pages.BstackCheckoutPage;
import com.bstack.pages.BstackLoginPage;
import com.bstack.pages.BstackProductPage;

import Utility.AppUtility1;
import Utility.WebDriverFactory;

public class BaseTestForBstack {
	WebDriver driver ;
	public  BstackLoginPage blp;
	public  BstackCartPage bcp;
	public BstackCheckoutPage bop;
	public BstackProductPage bpp;
	
	@BeforeMethod
	public void setUp(){
	 WebDriver driver=WebDriverFactory.initDrivers("chrome");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://bstackdemo.com/signin");
	blp= new BstackLoginPage(driver);
	bcp= new BstackCartPage(driver);
	bop= new BstackCheckoutPage(driver);
	bpp=new BstackProductPage(driver);
	}
	
	@AfterMethod
	public void  tearDown()
	{
		WebDriverFactory.quitDriver();
	}
	

}
