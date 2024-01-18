package Autosuggestions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class autoS_ss_childB_dyna
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		  String ran = RandomString.make(2);
		  
		driver.manage().window().maximize();
		//find google search box and send input
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("iphone 13");
		
		Thread.sleep(3000); 
		// convert multi matching to single matching
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));	
		
		String expected_result = "iphone 13 pro";
		
	    Thread.sleep(3000);
		for(WebElement opt:options)
		{
			//compare two strings exp & act
			String actual_result = opt.getText();
			System.out.println(actual_result);
			
			if(expected_result.equals(actual_result))
			{
				opt.click();
				break;
			}
			
		}
		
		//take screen shot for 1st open  page
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("G:\\java programme for testing\\Chetan_may2022\\seienium\\screeenshots\\Redmi"+ran+".jpg");
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
		  Thread.sleep(3000);
		    driver.findElement(By.xpath("(//span[@class='pymv4e'])[3]")).click();
		    
		    Set<String> page_ids = driver.getWindowHandles();
		    
		    ArrayList<String> a1=new ArrayList<>(page_ids);
		    
		    Thread.sleep(5000);
		    driver.switchTo().window(a1.get(0));
		    
		    Thread.sleep(3000);
		    driver.switchTo().window(a1.get(1));
		    
		    Thread.sleep(4000);
		    // take screenshot of 2nd open page
		 File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     File dest2=new File("G:\\java programme for testing\\Chetan_may2022\\seienium\\screeenshots\\amazon"+ran+".jpg");
		 org.openqa.selenium.io.FileHandler.copy(src1, dest2);
		    
		    Thread.sleep(3000);
		    // find dynamic element & handle (get text)
		    WebElement RATINGS = driver.findElement(By.xpath("(//div[@id='centerCol']/div//A)[3]"));
		    
		    Thread.sleep(3000);
		    String rate = RATINGS.getText();
		    
		    System.out.println(rate);
		    
		    driver.close();
		    
		   	
	}


}
