package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//........> This is for Google Page
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shahanur\\Desktop\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println("Google page title is: "+ title);
		if(title.equals("Google")) {
			System.out.println("correct title");
		}else {
			System.out.println("in correct title");
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.quit();
		
	
		}

}
