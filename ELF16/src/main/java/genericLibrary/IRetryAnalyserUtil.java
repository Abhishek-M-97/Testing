package genericLibrary;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyserUtil implements IRetryAnalyzer {

	public boolean retry(ITestResult result) {
		int retryCount=0,maxRetryCount=3;
		if(retryCount < maxRetryCount) {
			retryCount++;
		}
		return false;
	}

}
