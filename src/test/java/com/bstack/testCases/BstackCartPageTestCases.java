package com.bstack.testCases;

import org.testng.annotations.Test;

import com.bstack.Base.BaseTestForBstack;

public class BstackCartPageTestCases extends BaseTestForBstack{
  @Test(priority=1)
  public void TC_004_AddSingleItemToCard() throws InterruptedException {
	  blp.selectUsername();
	  blp.selectPassword();
	  blp.clickOnLogin();
	  bcp.AddItemToCart();
	  String quantityCount=bcp.verifyCountItemsInCart();
	  System.out.println("The  items And number of Items in cart is :"+quantityCount);
	  //bcp.logout();
	  Thread.sleep(5000);
  }
  @Test(priority=2)
  public void TC_005_AddMultipleItemToCart()
  {
	  blp.selectUsername();
	  blp.selectPassword();
	  blp.clickOnLogin();
     bcp.addMultipleItemsToCart();
	 System.out.println("The Number Of Items in Bage are:"+bcp.CountItemsInCart());
  }
  @Test(priority=3)
  public void TC_006_RemoveItemsFromCart()
  {
	  blp.selectUsername();
	  blp.selectPassword();
	  blp.clickOnLogin();
	  bcp.deleteItems();
	  System.out.println("The Number Of Items in Bage after deletingAll Items are:"+bcp.CountItemsInCart());
  }
  
}
