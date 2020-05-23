package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shahanur\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.bestbuy.com");
		String title=driver.getTitle();
		System.out.println("Best buy title page is:" +title);
		if(title.equals("Best Buy | Official Online Store | Shop Now & Save")) {
			System.out.println("correct");
			
			
		}else {
			System.out.println("in-correct");
		}
		

	}

}
