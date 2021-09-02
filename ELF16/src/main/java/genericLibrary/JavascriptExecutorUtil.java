package genericLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavascriptExecutorUtil {
	
	static JavascriptExecutor js= (JavascriptExecutor) BaseClass.driver;

	public static void toRefresh() {
		js.executeScript("window.history.go(0)");
	}
	
	public static void toBackward() {
		js.executeScript("window.history.back(0)");
	}
	
	public static void toForward() {
		js.executeScript("window.history.forward(0)");
	}
	
	public static void toEnterTextField(WebElement ele,String data) {
		js.executeScript("arguments[0].value=\""+data+"\";", ele );
	}
	
	public static void toClick(WebElement ele) {
		js.executeScript("arguments[0].click()", ele);
	}
	
	public static void toClearTextField(WebElement ele) {
		js.executeScript("arguments[0].value=''",ele);
	}
	
	public static void scrollIntoView(WebElement ele,boolean data) {
		js.executeScript("arguments[0].scrollIntoView(\""+data+"\")",ele);
	}
	
	public static void scrollBy(int x,int y) {
		js.executeScript("window.scrollBy(\""+x+"\",\""+y+"\"");
	}
	
	public static void scrollTo(int x,int y) {
		js.executeScript("window.scrollTo(\""+x+"\",\""+y+"\"");
	}
	
	public static void toGetTitle() {
		String title = js.executeScript("return document.title;").toString();
		System.out.println("Title: "+title);
	}
	
	public static void toGetURL() {
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("URL: "+url);
	}
	

}
