package genericLibrary;

public interface IAutoConstants {
	
	String CHROME_KEY = "webdriver.chrome.driver";
	String CHROME_PATH= "./src/main/resources/drivers/chromedriver.exe";
	
	String FIREFOX_KEY = "webdriver.gecko.driver";
	String FIREFOX_PATH= "./src/main/resources/drivers/geckodriver.exe";
	
	String EXCEL_PATH = "./src/test/resources/demo.xlsx";
	String PROPERTIES_PATH = "./src/test/resources/demo.properties";
	
	String SCREENSHOT_PATH = "./errorshots/";
	
	String DEFAULT_URL= "http://localhost:8888/index.php?action=Login&module=Users";
	String DEFAULT_USERNAME = "admin";
	String DEFAULT_PASSWORD = "root";
	
}
