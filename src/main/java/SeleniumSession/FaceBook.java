package SeleniumSession;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shahanur\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		String title=driver.getTitle();
		System.out.println("facebook title is:" +title);
		driver.findElement(By.id("email")).sendKeys("sabujeee@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sabuj0977");
		
		
		
		driver.findElement(By.id("loginbutton")).click();
		

	}

}
