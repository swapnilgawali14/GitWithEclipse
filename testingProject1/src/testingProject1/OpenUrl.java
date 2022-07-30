package testingProject1;

public class OpenUrl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//setting property of chrome and passing the chrome driver path  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\chromedriver.exe");
		//Creating and launching instance of chrome driver 
		WebDriver driver = new ChromeDriver();
		
	}

}
