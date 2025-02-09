package com.vtiger.organization;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.HomePage;
import ObjectRepository.OrganizationPage;
import vtiger.Generic_utility.BaseClass;
import vtiger.Generic_utility.ListernerUtility;
@Listeners(ListernerUtility.class)
public class TC_VT_001Test extends BaseClass{

@Test
public void clickOnOrganization() {
	hp=new HomePage(driver);
	hp.getOrganizationsLink().click();
	op=new OrganizationPage(driver);
	op.getCreateOrganizationsIcon().click();
}
}
