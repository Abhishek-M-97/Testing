package genericLibrary;

import java.util.Set;

import org.openqa.selenium.Alert;

public class WebDriverUtil {
		
	public static void switchControl() {
		Set<String> allWinIds = BaseClass.driver.getWindowHandles();
		for(String WinIds: allWinIds) {
			BaseClass.driver.switchTo().window(WinIds);
		}		
	}
	/**
	 * Press 1--> accept alert, 2-->dismiss alert,3-->to get alert text
	 * 4->to send data to authentication pop up
	 * @param value
	 * @param data
	 */
	public static void switchToAlert(int value,String data) {

		Alert alert=BaseClass.driver.switchTo().alert();
		if(value==1) {
			alert.accept();
		}else if(value==2) {
			alert.dismiss();
		}else if(value==3) {
			System.out.println(alert.getText());
		}else if(value==4) {
			alert.sendKeys(data);
		}
	}
}
