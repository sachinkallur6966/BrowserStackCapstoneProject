package com.bstack.testCases;

import java.util.List;

import org.testng.annotations.Test;

import com.bstack.Base.BaseTestForBstack;

public class BstackProductPageTestCases extends BaseTestForBstack  {
  @Test
  public void getNoOfProductsOnPage() {
	  int count=0;
	  blp.selectUsername();
	  blp.selectPassword();
	  blp.clickOnLogin();
	  List<String> itemNames=bpp.getItemNames();
	  for(String i:itemNames)
	  {
	  System.out.println(count++ +":"+i);
	  }
	  System.out.println("There are total "+count+":"+ "Products");
	  
  }
}
