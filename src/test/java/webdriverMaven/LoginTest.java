package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	@Test
	public void dologin() {
		
		driver.get("https://my.lookout.com/user/login");
		driver.findElement(By.id("user_email")).sendKeys("moathmabosull@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("grrnhnhy");
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div/div[1]/form/div[3]/a")).click();		
	/*
	 * 
	 * added new comments
	 * 
	 */
	
	
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
