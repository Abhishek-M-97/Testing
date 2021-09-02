package genericLibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtil {
	/***
	 * Pass listbox  reference and data to be selected from dropdown as an argument
	 * @param listBox
	 * @param data
	 */
	
	 public static void dropDown(WebElement listBox,String data)
	 {
		 int count=1;
		 int i=1;
		 Select singleSelect= new Select(listBox);
		 while(i<4) {
			 try {
				 if(count==1) {
					 count++;
					 singleSelect.selectByValue(data);
					 break;
				 } else if(count==2) {
					 count++;
					 singleSelect.selectByVisibleText(data);
					 break;
				 } else if(count==3) {
					 count++;
					 singleSelect.selectByIndex(Integer.parseInt(data));
					 break;
				 }
			 	 }
			 catch(Exception e) {
				 i++;
			 }
		 }
	 }
}
