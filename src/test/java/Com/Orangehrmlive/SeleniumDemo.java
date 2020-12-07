package Com.Orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	WebDriver driver=null;
	
	void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\E\\SoftwareEnggProject1\\chromedriver.exe");
		
			 driver=new ChromeDriver();
	}
	
	void enterUrl()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	void login()
	{
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//load driver
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\E\\SoftwareEnggProject1\\chromedriver.exe");
	//	open chrom 
		WebDriver driver=new ChromeDriver();//chrom does not give direct access to any software only gives for user
		//pass url
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
	}

}
