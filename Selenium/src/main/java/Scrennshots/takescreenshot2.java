package Scrennshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class takescreenshot2
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String rn = RandomString.make(3);
		
		File dest=new File("G:\\java programme for testing\\Chetan_may2022\\seienium\\scr1"+rn+".jpg");
		
		FileHandler.copy(src, dest);
		
		
	}
}
