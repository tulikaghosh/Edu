package module11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class editPhoto {
	static WebDriver driver;
	
	@Test(priority=0)
	public void Login() throws InterruptedException {
		driver.findElement(By.linkText("Log In")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='si_popup_email']")).sendKeys("tulikagetsmails@gmail.com");
		driver.findElement(By.xpath("//input[@id='si_popup_passwd']")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")).click();
		//My profile
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@class='user_image']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Profile")).click();
		//edit button
		driver.findElement(By.xpath("(//i[@class='icon-pr-edit'])[1]")).click();
		//edit photo button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='icon-camera']")).click();
	}
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(35,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//navigate	  
		driver.navigate().to("https://www.edureka.co/");

		driver.manage().window().maximize() ;
	}
}
