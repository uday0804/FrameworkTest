package com.FrameworkTest.testCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FrameworkTest.pageObjects.LoginPage;

public class TC_LoginTest001 extends BaseClass {
	
	@Test
	public void LoginTest() throws IOException
	{
		
		logger.info("Url is opened");
		LoginPage LP = new LoginPage(driver);
		LP.setUserName(userName);
		logger.info("UserName entered");
		LP.setPassword(pwd);
		logger.info("Password Entered");
		LP.ClickLogin();
		
		String title = driver.getTitle();
		logger.info("Title is " + title);
		
		if(title.equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed " + driver.getTitle());
		}
		else
		{
			captureScreenShot(driver,"LoginTest");
			Assert.assertTrue(false);
			logger.info("Login test Failed " + driver.getTitle());
		}
	}

}
