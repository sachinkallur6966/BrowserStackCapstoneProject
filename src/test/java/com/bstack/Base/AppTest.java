package com.bstack.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bstackdemo.com/signin");
		driver.findElement(By.xpath("(//div[@class=\" css-1hwfws3\"])[1]")).click();
		//find input ele
		driver.findElement(By.xpath("//input[@id='react-select-2-input']")).sendKeys("testUser");
		
//		driver.findElement(By.xpath("//div[@id='react-select-2-option-0-0']")).click();
//		driver.findElement(By.xpath("(//div[@class=\" css-1hwfws3\"])[2]")).click();
//		driver.findElement(By.xpath("//div[@id='react-select-3-option-0-0']")).click();
//		driver.findElement(By.cssSelector("#login-btn")).click();
	
	}
}
   