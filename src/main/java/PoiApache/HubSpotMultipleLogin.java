package PoiApache;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HubSpotMultipleLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\shahanur\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com");


		String sheet_path="C:\\Users\\shahanur\\eclipse-workspace\\NaveenSelenium\\src\\main\\java\\PoiApache\\Book.xlsx";

		String sheetName="login";
		xls_Reader reader=new xls_Reader(sheet_path);

		int rowCount=reader.getRowCount(sheetName);
		int colCount=reader.getColumnCount(sheetName);

		System.out.println("total row=" +rowCount);
		System.out.println("total col=" +colCount);
		System.out.println(reader.getCellData(sheetName, "username",4 ));



		reader.addColumn(sheetName, "status");
		for(int rowNum=2; rowNum<=rowCount; rowNum++) {
			String username=reader.getCellData(sheetName, "username", rowNum);
			String password=reader.getCellData(sheetName, "password", rowNum);


			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("username")).sendKeys(username);

			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(password);
			
			
			reader.setCellData(sheetName, "status", rowNum, "pass");



		}





	}

}
