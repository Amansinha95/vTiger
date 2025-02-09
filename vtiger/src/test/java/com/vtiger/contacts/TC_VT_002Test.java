package com.vtiger.contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import ObjectRepository.ContactPage;
import ObjectRepository.CreateContactPage;
import ObjectRepository.HomePage;
import vtiger.Generic_utility.BaseClass;
import vtiger.Generic_utility.ListernerUtility;
@Listeners(ListernerUtility.class)
public class TC_VT_002Test extends BaseClass{
	@Test
	public void createContact() throws EncryptedDocumentException, IOException {
		hp=new HomePage(driver);
		hp.getContactLink().click();
		ContactPage cp=new ContactPage(driver);
		cp.getCreateContactButton().click();
		
		CreateContactPage ccp=new CreateContactPage(driver);
		ccp.getLastNameTextField().sendKeys(eutil.getStringDataFromExcel("contact", 1, 0));
		ccp.getSaveButton().click();
		
		String actText = ccp.getLastNameField().getText();
		String expText = eutil.getStringDataFromExcel("contact", 1, 0);
		Assert.assertEquals(actText, expText,"last name not added");
		test.log(Status.PASS, "last name added");
		
	}

}
