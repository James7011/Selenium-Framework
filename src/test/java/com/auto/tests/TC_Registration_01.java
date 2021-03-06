package com.auto.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.auto.baseClass.BaseTest;
import com.auto.pageObject.RegistrationPage;
import com.auto.utility.ReadPropertyConfig;
import com.auto.utility.ReportsClass;
import com.aventstack.extentreports.Status;

/**
 * 
 * * Author : Bhargav Sathwara ***
 * 
 */
public class TC_Registration_01 extends BaseTest {

	ReadPropertyConfig readProp = new ReadPropertyConfig();
	String url = readProp.getSiteURL();
	String email = readProp.getEmail();
	String password = readProp.getPassword();

	@BeforeMethod
	public void beforeMethod() {
		ReportsClass.startUp();
		ReportsClass.initialisation("TC_Registration_01");
		openBrowser(url);
	}

	@Test
	public void registrationShop() throws Exception {
		RegistrationPage pageReg = new RegistrationPage();
		pageReg.clickOnMyAccountMenu();
		pageReg.registerShop(email, password);
		ReportsClass.logStat(Status.PASS, "User registration successfully");
	}

	@AfterMethod
	public void afterMethod() {
		ReportsClass.endTest();
	}

}
