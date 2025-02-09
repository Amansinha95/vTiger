package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
@FindBy(name = "lastname")
private WebElement lastNameTextField;

@FindBy(xpath = "//input[@class='crmbutton small save']")
private WebElement saveButton;
@FindBy(id = "dtlview_Last Name")
private WebElement lastNameField;
public CreateContactPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getLastNameTextField() {
	return lastNameTextField;
}

public WebElement getSaveButton() {
	return saveButton;
}

public WebElement getLastNameField() {
	return lastNameField;
}

}
