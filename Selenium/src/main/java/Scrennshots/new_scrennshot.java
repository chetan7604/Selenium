package Scrennshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class new_scrennshot
{

	public static void main(String[] args) throws IOException 
	{
		
		 System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.com");
			
			driver.manage().window().maximize();
			
			String RRR = RandomString.make(2);
			
			
			File Defalt = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File ReqLOC=new File("G:\\java programme for testing\\Chetan_may2022\\seienium\\screeenshots\\screen"+RRR+".jpg");
			
			FileHandler.copy(Defalt, ReqLOC);
			
			driver.quit();
			
	}
}
