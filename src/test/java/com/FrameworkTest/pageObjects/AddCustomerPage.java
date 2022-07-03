package com.FrameworkTest.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[2]/a")
	WebElement AddNewCustomerLink;
	
	@FindBy(how = How.NAME, using = "name")
	WebElement txtName;
	
	@FindBy(how = How.NAME, using = "rad1")
	WebElement txtGender;
	
	@FindBy(how = How.NAME, using = "dob")
	WebElement txtDOB;
	
	@FindBy(how = How.NAME, using = "addr")
	WebElement txtAddress;
	
	@FindBy(how = How.NAME, using = "city")
	WebElement txtCity;
	
	@FindBy(how = How.NAME, using = "state")
	WebElement txtState;
	
	@FindBy(how = How.NAME, using = "pinno")
	WebElement txtPin;
	
	@FindBy(how = How.NAME, using = "telephoneno")
	WebElement txtPhone;
	
	@FindBy(how = How.NAME, using = "emailid")
	WebElement txtEmail;
	
	@FindBy(how = How.NAME, using = "password")
	WebElement txtPasswrd;
	
	@FindBy(how = How.NAME, using = "sub")
	WebElement txtSubmit;
	
	public void ClickCustomerLink() {
		AddNewCustomerLink.click();
	}
	
	public void CustName(String CName) {
		txtName.sendKeys(CName);
	}
	
	public void CustGender(String CGender) {
		txtGender.click();
	}
	
	public void CustDOB(String mm,String dd, String yy) {
		txtDOB.sendKeys(mm);
		txtDOB.sendKeys(dd);
		txtDOB.sendKeys(yy);
	}
	
	public void CustAddress(String Address)
	{
		txtAddress.sendKeys(Address);
	}
	
	public void custCity(String City)
	{
		txtCity.sendKeys(City);
	}
	
	public void custState(String State)
	{
		txtState.sendKeys(State);
	}
	
	public void custPin(String Pin)
	{
		txtPin.sendKeys(Pin);
	}
	
	public void CustPhone(String Phone) {
		txtPhone.sendKeys(Phone);
	}
	
	public void CustEmail(String Email) {
		txtEmail.sendKeys(Email);
	}
	

	public void CustPwd(String password) {
		txtPasswrd.sendKeys(password);
	}
	
	public void CustSubmit()
	{
		txtSubmit.click();
	}
	

}
