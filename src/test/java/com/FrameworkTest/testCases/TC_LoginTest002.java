package com.FrameworkTest.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FrameworkTest.pageObjects.LoginPage;
import com.FrameworkTest.utilities.XUtils;

public class TC_LoginTest002 extends BaseClass {
	
	@Test(dataProvider="Logindata")
	public void loginDDT(String userName, String pwd)
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(userName);
		lp.setPassword(pwd);
		lp.ClickLogin();
	}
	
	
	
	@DataProvider(name="Logindata")
	String[][] getData() throws IOException
	{
		String path = "LoginData.xlsx";
		int rownum = XUtils.getRowCount(path, "Sheet1");
		int colCount = XUtils.getCellCount(path, "Sheet1", 1);
		
		String loginData[][] = new String [rownum][colCount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				loginData[i-1][j]= XUtils.getCellData(path, "Sheet1", i,j);
			}
		}
		return loginData;
	}
	

}
