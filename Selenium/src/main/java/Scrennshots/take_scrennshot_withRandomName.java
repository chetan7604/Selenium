package Scrennshots;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class take_scrennshot_withRandomName 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String random=RandomString.make(2);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("G:\\java programme for testing\\Scrennshots\\scr"+random+".jpg");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
	  
		
		
	}

}
