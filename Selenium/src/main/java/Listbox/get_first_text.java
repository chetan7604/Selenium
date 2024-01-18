package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class get_first_text 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement create_acct = driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]"));
		
		Thread.sleep(3000);
		create_acct.click();
		Thread.sleep(2000);
	    // step 1: identify listbox
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s=new Select(day);
		Thread.sleep(3000);
		
		//WebElement firstopt = s.getFirstSelectedOption();
		
		//String option_Text = firstopt.getText();
		
		//System.out.println(option_Text);
		System.out.println(s.getFirstSelectedOption().getText());
		driver.close();
		
		
	}
}
