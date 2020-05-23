package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver","C:\\Users\\shahanur\\Documents\\geckodriver-v0.23.0-win64\\geckodriver.exe" );
     WebDriver driver=new FirefoxDriver();
     driver.get("http://www.google.com");
     System.out.println(driver.getTitle());
     driver.navigate().to("http://www.facebook.com");
     System.out.println(driver.getTitle());
     driver.navigate().back();
     System.out.println(driver.getTitle());

    // Thread.sleep(5000);
	}

}
