package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(linkText = "Contacts")
private WebElement contactLink;
@FindBy(xpath = "//img[contains(@src,'user')]")
private WebElement profileIcon;


@FindBy(linkText = "Sign Out")
private WebElement signoutLink;

@FindBy(linkText = "Organizations")
private WebElement organizationsLink;
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getContactLink() {
	return contactLink;
}

public WebElement getProfileIcon() {
	return profileIcon;
}

public WebElement getSignoutLink() {
	return signoutLink;
}

public WebElement getOrganizationsLink() {
	return organizationsLink;
}

}
