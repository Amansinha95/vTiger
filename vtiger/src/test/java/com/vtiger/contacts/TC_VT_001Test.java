package com.vtiger.contacts;

import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.aventstack.extentreports.Status;

import ObjectRepository.HomePage;
import vtiger.Generic_utility.BaseClass;
import vtiger.Generic_utility.ListernerUtility;
@Listeners(ListernerUtility.class)
public class TC_VT_001Test extends BaseClass{
@Test
public void clickOnContacts() throws EncryptedDocumentException, IOException {
	hp=new HomePage(driver);
	hp.getContactLink().click();
	String actTitle = driver.getTitle();
	String expTitle = eutil.getStringDataFromExcel("contact", 1, 1);
	Assert.assertEquals(actTitle, expTitle,"contacts page is not displayed");
	test.log(Status.PASS, "contact page is displayed");
}
}
