package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

public class TakesScreenshotUtil implements IAutoConstants {
	static File tempfile;
	
	public static void toTakeFailedTestScreenshot(ITestResult result) throws IOException {
		LocalDateTime.now().toString().replace(":","-");
		TakesScreenshot ts= (TakesScreenshot)BaseClass.driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File(SCREENSHOT_PATH+result.getMethod().getMethodName()+".png");
		FileUtils.copyFile(tempfile, destfile);
				
	}
		
	public static void toTakeWebPageScreenshot(String url) throws IOException {
		//BaseClass.driver.get(url);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy hh-mm-ss-S aa");
		String formattedDate = dateFormat.format(new Date()).toString();
		//System.out.println(formattedDate);
		TakesScreenshot ts= (TakesScreenshot)BaseClass.driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File(SCREENSHOT_PATH+formattedDate+".png");
		FileUtils.copyFile(tempfile, destfile);
	}
	/***
	 * pass the identified webelement as an string to this method to take 
	 * webelement screenshot
	 * @param ele
	 * @throws IOException
	 */
	public static void toTakeWebElementScreenshot(String ele) throws IOException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy hh-mm-ss-S aa");
		String formattedDate = dateFormat.format(new Date()).toString();
		//System.out.println(formattedDate);
		int count=0,i=0;
		while(i<5) {
			try {
				if(count==0) {
					count++;
					tempfile = BaseClass.driver.findElement(By.id(ele)).getScreenshotAs(OutputType.FILE);
					break;
				}else if(count==1) {
					count++;
					tempfile = BaseClass.driver.findElement(By.name(ele)).getScreenshotAs(OutputType.FILE);
					break;
				}else if(count==2) {
					count++;
					tempfile = BaseClass.driver.findElement(By.className(ele)).getScreenshotAs(OutputType.FILE);	
					break;
				}else if(count==3) {
					count++;
					tempfile = BaseClass.driver.findElement(By.xpath(ele)).getScreenshotAs(OutputType.FILE);	
					break;
				}else if(count==4) {
					count++;
					tempfile = BaseClass.driver.findElement(By.linkText(ele)).getScreenshotAs(OutputType.FILE);
					break;
				}
			}
			catch(NoSuchElementException e){
				i++;
			}
		}

		File destfile = new File(SCREENSHOT_PATH+formattedDate+".png");
		FileUtils.copyFile(tempfile, destfile);
	}

}


