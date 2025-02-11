package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage {
@FindBy(name = "salutationtype")
private WebElement namePrefixDropDown;

@FindBy(name = "firstname")
private WebElement firstNameTextField;

@FindBy(name = "lastname")
private WebElement lastNameTextField;

@FindBy(name = "leadsource")
private WebElement leadSourceDropDown;

@FindBy(name = "industry")
private WebElement industryTypeDropDown;
@FindBy(name = "company")
private WebElement coompanyNameTextField;

@FindBy(xpath = "//input[@type='submit']")
private WebElement saveButton;

public CreateLeadPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}



public WebElement getNamePrefixDropDown() {
	return namePrefixDropDown;
}



public WebElement getLastNameTextField() {
	return lastNameTextField;
}

public WebElement getLeadSourceDropDown() {
	return leadSourceDropDown;
}

public WebElement getIndustryTypeDropDown() {
	return industryTypeDropDown;
}

public WebElement getCoompanyNameTextField() {
	return coompanyNameTextField;
}

public WebElement getSaveButton() {
	return saveButton;
}

public WebElement getFirstNameTextField() {
	return firstNameTextField;
}

}
