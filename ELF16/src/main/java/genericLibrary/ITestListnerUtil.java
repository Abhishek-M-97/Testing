package genericLibrary;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListnerUtil implements ITestListener {

	public void onTestFailure(ITestResult result) {
		
		try {
			TakesScreenshotUtil.toTakeFailedTestScreenshot(result);
		} catch (IOException e) {
			e.printStackTrace();
		}

//		try {
//			TakesScreenshotUtil.toTakeWebPageScreenshot(null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}	


