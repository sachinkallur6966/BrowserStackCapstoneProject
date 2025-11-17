package com.bstack.testCases;

import org.testng.annotations.Test;

import com.bstack.Base.BaseTestForBstack;

public class BstackCheckoutPageTestCases extends BaseTestForBstack {

	@Test
	public void TC_007_checkout()
	{
		blp.selectUsername();
		blp.selectPassword();
		blp.clickOnLogin();
		bcp.AddItemToCart();
		bop.checkout();
		String cmsg=bop.shippingAddress();
		System.out.println("Confirmation Message is:"+cmsg);
	}
	@Test
	public void TC_008_checkoutWithoutAddingItem()
	{

		blp.selectUsername();
		blp.selectPassword();
		blp.clickOnLogin();
		bop.clickOnBag();
		bop.clickOnContiShopping();
		//bcp.AddItemToCart();
		//bop.checkout();
	}
}
