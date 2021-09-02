package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="user_name")	
	private WebElement usernameTextField;
	@FindBy(name="user_password")
	private WebElement  pwdTextField;
	@FindBy(id="submitButton")	
	private WebElement loginbtn;
	

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}
	
	public WebElement getPwdTextField() {
		return pwdTextField;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}	
}
