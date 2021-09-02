package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContact {
	
	public CreatingNewContact(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="lastname")
	private WebElement lastName;

	@FindBy(name="leadsource") 
	private WebElement listBox;
	
	@FindBy(name="button")
	private WebElement save;
	
	@FindBy(xpath="//input[@value='U']") 
	private WebElement userRadiobtn;
	
	@FindBy(name="assigned_user_id") 
	private WebElement userListBox;
	
	@FindBy(name="assigned_group_id") 
	private WebElement groupListBox;
	
	@FindBy(xpath="//input[@value='T']") 
	private WebElement groupRadiobtn;
	
	public WebElement getGroupRadiobtn() {
		return groupRadiobtn;
	}

	public void setGroupRadiobtn(WebElement groupRadiobtn) {
		this.groupRadiobtn = groupRadiobtn;
	}

	public WebElement getUserRadiobtn() {
		return userRadiobtn;
	}
	
	public WebElement getUserListBox() {
		return userListBox;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getListBox() {
		return listBox;
	}
	
	public WebElement getGroupListBox() {
		return groupListBox;
	}

	public WebElement getSave() {
		return save;
	}
	
	
}


