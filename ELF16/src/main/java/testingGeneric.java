import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import genericLibrary.ExcelUtil;
import genericLibrary.IAutoConstants;
import genericLibrary.IRetryAnalyserUtil;
import genericLibrary.ITestListnerUtil;
import genericLibrary.JavascriptExecutorUtil;
import genericLibrary.PropertyFileUtil;
import genericLibrary.TakesScreenshotUtil;

@Listeners(ITestListnerUtil.class)

public class testingGeneric extends BaseClass implements IAutoConstants {
//	
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		String data = ExcelUtil.toReadDataFromExcel("Sheet1",2,5,4);
//		System.out.println(data);
//
//		String data1 = PropertyFileUtil.PropertyFile("password");
//		System.out.println(data1);
		@Test(retryAnalyzer = IRetryAnalyserUtil.class)
		public void test() throws IOException, InterruptedException {
		//TakesScreenshotUtil.toTakeWebPageScreenshot(null);
//		String webElement = "//img[@alt='logo']";
//		TakesScreenshotUtil.toTakeWebElementScreenshot(webElement);
		//Thread.sleep(3000);
		//JavascriptExecutorUtil.toRefresh();
		//WebElement usr = BaseClass.driver.findElement(By.name("user_name"));
		int a=100/0;
//		JavascriptExecutorUtil.toEnterTextField(usr,"hiiii");
//		JavascriptExecutorUtil.toGetTitle();
//		JavascriptExecutorUtil.toGetURL();
//		JavascriptExecutorUtil.toClearTextField(usr);
		}

	}


