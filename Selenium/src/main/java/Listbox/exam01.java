package Listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class exam01 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement create_acct = driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]"));
		
		Thread.sleep(3000);
		create_acct.click();
		Thread.sleep(5000);
	    // step 1: identify listbox
		
		WebElement day = driver.findElement(By.id("day"));//driver.findElement(By.xpath("//select[@id='day']"));

		// step 2:Create object of select class and PASS identified webelement
		Select s1=new Select(day);
		
		//pass the value by select methods to listbox
		s1.selectByIndex(16);
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(2000);
 		
		 // step 2:	Create object of select class and PASS identified webelement
		
		Select s=new Select(month);
		//s.selectByIndex(2);
		//s.selectByValue("11");
		s.selectByVisibleText("Jan");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Thread.sleep(2000);
		Select s2=new Select(year);
		s2.selectByValue("1994");
		
		Thread.sleep(2000);
	
		boolean result = s2.isMultiple();
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("textbox is multiple");
		}
		else
		{
			System.out.println("textbox is single");
		}    
		

        driver.close();
		
        
	}

}
