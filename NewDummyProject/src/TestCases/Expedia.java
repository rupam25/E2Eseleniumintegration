package TestCases;

import Utility.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Expedia {
	WebDriver driver;
	private static String MENU_NAME="Hotels";
private static String DESTINATION_LABEL="destination";
private static String DESTINATION_NAME="Chicago";

@Test
public void hotelReservation( ) throws InterruptedException {
	Thread.sleep(2000);
	//driver.findElement(By.id("tab-hotel-tab-hp")).click();
	driver.findElement(By.xpath("//button[@class='on']")).click();
	//driver.findElement(By.xpath("//font[contains(text(),'"+MENU_NAME+"')]")).click();
	//Thread.sleep(3000);
	//driver.findElement(By.name("'"+DESTINATION_LABEL+"'")).sendKeys(DESTINATION_NAME);
	
	// 1.search
	
	//2. modify search result
	//3.analyze result and make selection
	//4.book reservation
	//5. fill out contact/billing
	//6.get confirmation
	System.out.println("LOGIN DONE");
}
@BeforeMethod
public void initiateDriverInstance() throws Exception {
	if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("chrome"))
	{System.setProperty("webdriver.chrome.driver","./Driver/chromeDriver.exe");
		driver =new ChromeDriver();
	}
	else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("firefox"))
		{System.setProperty("webdriver.gecko.driver","./Driver/geckoDriver.exe");

		driver =new FirefoxDriver();
	}
	else
	{	System.setProperty("webdriver.chrome.driver","./Driver/chromeDriver.exe");

		driver =new ChromeDriver();
	}
	driver.get(Utility.fetchPropertyValue("applicationURL").toString());
}
@AfterMethod
public void closeDriverInstance() {
	driver.quit();
}

}
