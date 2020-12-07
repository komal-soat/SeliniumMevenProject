package Com.Orangehrmlive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
     WebDriver driver;
	
     @BeforeClass
	public void openBrowser()
	{
		System.out.println("Opening the browser");
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\E\\SoftwareEnggProject1\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}
     
// 	@Test(priority=1)
     @BeforeMethod
     
     public void login()
	{
		System.out.println("Login to System");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
	}
   
     @Test
     public void adminTest()
     {
    	 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    	 driver.findElement(By.linkText("Admin")).click();
     }
     
     @Test
     public void leaveTest()
     {
    	 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    	 driver.findElement(By.linkText("PIM")).click();
     }
     @Test
     public void PimTest()
     {
    	 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    	 driver.findElement(By.linkText("Leave")).click();
     }
     
     
     
     

//	@Test(priority=2)
     
     @AfterMethod
	public void logout()
	{
		System.out.println("logout");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
	}

	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
}
