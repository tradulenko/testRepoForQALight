package mainPackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import libs.NoteUtilities;

public class Test1 {
	WebDriver driver;
	
	@Test
	public void test1() throws MalformedURLException{
//		File app = new File("D:\\workspace\\WhatsApp.apk"); 
//		File app = new File("D:\\workspace\\com.textpress.latestcalls.downloader.apk");
		/*
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Selendroid");
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(CapabilityType.BROWSER_NAME , "Browser");
		capabilities.setCapability("deviceName", "test");
		capabilities.setCapability("PlatformVersion", "6.0");
		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("app", app.getAbsolutePath());
		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities) 
		{
			
			@Override
			public MobileElement scrollToExact(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public MobileElement scrollTo(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		*/
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		try {
			
//			driver.findElement(By.name("Phone")).click();
			System.out.println("test started");
			driver.get("http://old.qalight.com/zapisatsya-na-kurs/");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//select")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[contains(text(),'Автоматизация Selenium')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@name='your-name']")).sendKeys("Taras");
			
			System.out.println("text was printed");
			Thread.sleep(3000);
			
			
//			driver.findElement(arg)
//			driver.findElement(By.name("dial pad")).click();
			
//			Thread.sleep(3000);
			
			
			
			
//			NoteUtilities.clickOnButtonContinue(driver);
//			Thread.sleep(3000);
//			NoteUtilities.createNote(driver, "My first text");
//			Thread.sleep(3000);
//			NoteUtilities.createNote(driver, "Second text");
//			Thread.sleep(3000);
//			NoteUtilities.clearNoteByText(driver, "My first text");
//			Thread.sleep(10000);
		} catch (Exception e) {
			 Assert.assertTrue("catch ",false);
		}
		
		
		
		
		
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
}
