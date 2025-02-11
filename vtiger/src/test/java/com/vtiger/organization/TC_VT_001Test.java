package com.vtiger.organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import ObjectRepository.CreateOrganizationsPage;
import ObjectRepository.HomePage;
import ObjectRepository.OrganizationPage;
import vtiger.Generic_utility.BaseClass;
import vtiger.Generic_utility.ListernerUtility;

@Listeners(ListernerUtility.class)
public class TC_VT_001Test extends BaseClass {

	@Test
	public void createOrganization() throws EncryptedDocumentException, IOException {
		hp = new HomePage(driver);
		hp.getOrganizationsLink().click();
		op = new OrganizationPage(driver);
		op.getCreateOrganizationsIcon().click();
		cop = new CreateOrganizationsPage(driver);
		int randomNumbr = jutil.getRandomNumber();
		cop.getOrganizationsNameTextField().sendKeys(eutil.getStringDataFromExcel("organization", 1, 0)+randomNumbr);

		WebElement industry = cop.getIndustryDropDownList();
		wutil.selectByValue(industry, "Technology");
		WebElement type = cop.getTypeDropDownList();
		wutil.selectByValue(type, "Analyst");
		cop.getSaveButton().click();

		String actTest = cop.getOrganizationFieldName().getText();
		String expTest = eutil.getStringDataFromExcel("organization", 1, 0)+randomNumbr;
		Assert.assertEquals(actTest, expTest, "organization name not added");
		test.log(Status.PASS, "organization name added");

	}
}
