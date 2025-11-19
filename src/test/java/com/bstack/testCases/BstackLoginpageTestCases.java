package com.bstack.testCases;

import org.testng.annotations.Test;

import com.bstack.Base.BaseTestForBstack;

public class BstackLoginpageTestCases extends BaseTestForBstack {
  @Test
  public void TC_001_login() throws InterruptedException {
	  blp.selectUsername();
	  blp.selectPassword();
	  blp.clickOnLogin();
	  Thread.sleep(3000);
	  blp.checkForsuccessfullLogin();
  }
  @Test
  public void TC_002InvalidCredentials() throws InterruptedException 
  {
	  blp.invalidCredentials();
	  Thread.sleep(3000);
	  blp.clickOnLogin();
	  Thread.sleep(5000);
	 String message= blp.getErrorMsg();
	 System.out.println("The Message is:"+message );//Invalid Username  
  }
  @Test
  public void TC_003LoginWithEmptyPassword() throws InterruptedException
  {
	  blp.selectUsername();
	  //blp.selectPassword();
	  blp.clickOnLogin();
	  Thread.sleep(5000);
	  String message=blp.getErrorMsg();
	  System.out.println("The Message is:"+message );//Invalid Password  
  }
}
