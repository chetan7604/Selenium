package Listbox;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class example02
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4j')]")).click();
		
		Thread.sleep(3000);
		
		WebElement Day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		
		Thread.sleep(2000);
		
		Select s=new Select(Day);
		//s.selectByIndex(14);
		s.selectByValue("17");
		
		String random = RandomString.make(2);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("G:\\java programme for testing\\Chetan_may2022\\seienium\\screeenshots\\listbox"+random+".jpg");
		
		FileHandler.copy(src, dest);
		
	
		
	}

}
