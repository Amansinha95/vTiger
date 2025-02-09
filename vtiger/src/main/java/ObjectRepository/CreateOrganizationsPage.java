package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationsPage {
@FindBy(name = "accountname")
private WebElement organizationsNameTextField;

@FindBy(name = "industry")
private WebElement industryDropDownList;

@FindBy(name = "accounttype")
private WebElement typeDropDownList;

@FindBy(xpath = "//input[@class='crmbutton small save']")
private WebElement saveButton;
@FindBy(id = "dtlview_Organization Name")
private WebElement organizationFieldName;

public CreateOrganizationsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getOrganizationsNameTextField() {
	return organizationsNameTextField;
}

public WebElement getIndustryDropDownList() {
	return industryDropDownList;
}

public WebElement getTypeDropDownList() {
	return typeDropDownList;
}

public WebElement getSaveButton() {
	return saveButton;
}

public WebElement getOrganizationFieldName() {
	return organizationFieldName;
}

}
