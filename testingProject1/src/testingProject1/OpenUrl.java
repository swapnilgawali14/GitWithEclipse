package testingProject1;

import org.openqa.selenium.WebDriver;

public class OpenUrl {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		//setting property of chrome and passing the chrome driver path  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\chromedriver.exe");
		//Creating and launching instance of chrome driver 
		WebDriver driver = new ChromeDriver();
		
	}

}
