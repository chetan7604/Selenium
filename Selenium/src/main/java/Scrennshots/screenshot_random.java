package Scrennshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot_random
{
	public static void main(String[] args) throws IOException 
	{
         System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		String random1=RandomString.make(3);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		File scr1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest1=new File("G:\\java programme for testing\\Scrennshots\\amz"+random1+".jpg");
		
		FileHandler.copy(scr1, dest1);
		
		
		
		
		
	}

}
