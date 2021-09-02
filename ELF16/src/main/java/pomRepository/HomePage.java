package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Contacts") 
	private WebElement Contacts;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement Administrator;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement SignOut;
	
	public WebElement getContacts() {
		return Contacts;
	}
	
	public WebElement getAdministrator() {
		return Administrator;
	}
	
	public WebElement getSignOut() {
		return SignOut;
	}

}
