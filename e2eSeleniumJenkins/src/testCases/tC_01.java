package testCases;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class tC_01 {

@Test
public void testcase1()throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver", "E:\\PracticeWorkspace\\e2eSeleniumJenkins\\driver\\chromedriver.exe");

	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.faceook.com");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.id("email")).sendKeys("rupam_life@yahoo.co.in");
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("asl@1234");
	//Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	//Thread.sleep(2000);
}



}
