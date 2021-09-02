package genericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomRepository.HomePage;
import pomRepository.LoginPage;

public class BaseClass implements IAutoConstants {

	public static WebDriver driver;

	@BeforeClass
	public void preCondition() {
		System.setProperty(CHROME_KEY,CHROME_PATH);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void login() {
		driver.get(DEFAULT_URL);
		LoginPage loginPage= new LoginPage(driver);
		String expectedLoginTitle="vtiger CRM 5 - Commercial Open Source CRM";
		String loginTitle = driver.getTitle();
		Assert.assertEquals(loginTitle,expectedLoginTitle,"Login Page is not displayed");
		Reporter.log("Login Page is displayed",true);
		loginPage.getUsernameTextField().sendKeys(DEFAULT_USERNAME);
		loginPage.getPwdTextField().sendKeys(DEFAULT_PASSWORD);
		loginPage.getLoginbtn().click();

	}

	@AfterMethod
	public void logoutofApp() throws InterruptedException {
		
		Actions actions= new Actions(driver);
		HomePage homePage= new HomePage(driver);
		WebElement adminImg = homePage.getAdministrator();
		actions.click(adminImg).perform();
		Thread.sleep(2000);
		homePage.getSignOut().click();
		String expectedLogoutTitle="vtiger CRM 5 - Commercial Open Source CRM";
		String logoutTitle = driver.getTitle();
		Assert.assertEquals(logoutTitle,expectedLogoutTitle,"Logout Page is not displayed");
		Reporter.log("Logout Page is displayed",true);
		
		Reporter.log("Browser is closed",true);
		driver.quit();
	}

//	@AfterTest
//	public void close() {
//		Reporter.log("Browser is closed",true);
//		driver.quit();
//		//driver.close();
//	}


}
