package com.FrameworkTest.testCases;

import org.testng.annotations.Test;

import com.FrameworkTest.pageObjects.AddCustomerPage;
import com.FrameworkTest.pageObjects.LoginPage;

public class TC_LoginTest003 extends BaseClass {
	
	
	@Test 
	public void AddNewCustomer() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(userName);
		lp.setPassword(pwd);
		lp.ClickLogin();
		Thread.sleep(3000);
		
		AddCustomerPage acp = new AddCustomerPage(driver);
		acp.ClickCustomerLink();
		acp.CustName("Uday");
		acp.CustGender("male");
		acp.CustDOB("09", "08", "91");
		Thread.sleep(3000);
		acp.CustAddress("123 Main st");
		acp.custCity("Marlton");
		acp.custState("NJ");
		acp.custPin("08053");
		acp.CustPhone("9844957864");
		acp.CustEmail("newmail@gmail.com");
		acp.CustPwd("addbghd");
		acp.CustSubmit();
		
		
		
	}

}
