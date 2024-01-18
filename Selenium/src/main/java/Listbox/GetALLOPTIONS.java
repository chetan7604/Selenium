package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetALLOPTIONS 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement create_acct = driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]"));
		
		Thread.sleep(3000);
		create_acct.click();
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(2000);
		
		Select s=new Select(month);
		
		List<WebElement> all_options = s.getOptions();
		System.out.println(all_options.size());
		
		for(WebElement options:all_options)
		{
		System.out.print(options.getText()+" ");	
		}
		System.out.println();
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(5000);
		Select s1=new Select(day);
		List<WebElement> options = s1.getOptions();
		String expday="16";
		for(WebElement option:options)
		{
			System.out.println(option.getText());
			String Actday = option.getText();
			System.out.println(Actday);
			if(Actday.equals(expday))
			{
				option.click();
			}
			
			
			
			if(option.equals(expday))
			{
				day.click();
			}
		}
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
	}

}
