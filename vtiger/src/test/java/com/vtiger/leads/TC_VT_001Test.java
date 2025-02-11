package com.vtiger.leads;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.CreateLeadPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadsPage;
import vtiger.Generic_utility.BaseClass;
import vtiger.Generic_utility.ListernerUtility;
@Listeners(ListernerUtility.class)
public class TC_VT_001Test extends BaseClass{
@Test
public void createLeads() throws EncryptedDocumentException, IOException {
	hp=new HomePage(driver);
	hp.getLeadsLink().click();
	lsp=new LeadsPage(driver);
	lsp.getCreateLeadIcon().click();
	clp=new CreateLeadPage(driver);
	int random = jutil.getRandomNumber();
	WebElement prefix = clp.getNamePrefixDropDown();
	wutil.selectByindex(prefix, 1);
	clp.getFirstNameTextField().sendKeys(eutil.getStringDataFromExcel("leads", 1, 0)+random);
	clp.getLastNameTextField().sendKeys(eutil.getStringDataFromExcel("leads", 1, 1));
	clp.getCoompanyNameTextField().sendKeys(eutil.getStringDataFromExcel("leads", 1, 2)+random);
	WebElement leadSource = clp.getLeadSourceDropDown();
	wutil.selectByindex(leadSource, 3);
	WebElement compnay = clp.getIndustryTypeDropDown();
	wutil.selectByindex(compnay, 2);
	
	clp.getSaveButton().click();
	
}
}
