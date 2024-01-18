package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_isselected 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
		Thread.sleep(4000);
		WebElement button = driver.findElement(By.xpath("(//input[@name='software'])[4]"));
		
		boolean result = button.isSelected();
		boolean result1 = button.isDisplayed();
		System.out.println(result);
		System.out.println(result1);

	
	}

}
