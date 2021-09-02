import pomRepository.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericLibrary.*;

@Listeners(ITestListnerUtil.class)
public class TC_10Test extends BaseClass{
	
	@Test
	public void createContactTC_10() throws InterruptedException {
		HomePage homePage= new HomePage(driver);
		CreatingNewContact newContact= new  CreatingNewContact(driver);
		ContactsPage contacts= new ContactsPage(driver);

		String expectedHomePageTitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String homePageTitle = driver.getTitle();
		Assert.assertEquals(homePageTitle,expectedHomePageTitle,"Homepage is not displayed");
		Reporter.log("HomePage is displayed",true);

		//Step 3:Contact List page should be display
		homePage.getContacts().click();
		String expectedContactsPageTitle="Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM";
		String contactsPageTitle = driver.getTitle();
		Assert.assertEquals(contactsPageTitle,expectedContactsPageTitle,"Contacts is not displayed");
		Reporter.log("ContatctPage is displayed",true);

		//Step 4:Creating New Contact button should be display
		contacts.getCreatebtn().click();
		contacts.getCreatebtn().click();
		String expectedNewContactPageTitle="Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM";
		String newContactPageTitle=driver.getTitle();
		Assert.assertEquals(expectedNewContactPageTitle,newContactPageTitle,"Creating New Contact Page is not displayed");
		Reporter.log("Creating New Contact Page is displayed",true);

		//Step 5:Contact should be created with message Contact Information Updated today
		newContact.getLastName().sendKeys("demo");
		newContact.getGroupRadiobtn().click();
		WebElement groupListBox = newContact.getGroupListBox();
		Select select=new Select(groupListBox);
		Thread.sleep(2000);
		select.selectByVisibleText("Marketing Group");
		Thread.sleep(2000);
		newContact.getSave().click();
		String expectedContactInfoPageTitle="Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM";
		String contactInfoPageTitle=driver.getTitle();
		Assert.assertEquals(contactInfoPageTitle, expectedContactInfoPageTitle,"Contact Update Information Page is not displayed");
		Reporter.log("Contatct Information Updated Page is displayed",true);
	}
}
