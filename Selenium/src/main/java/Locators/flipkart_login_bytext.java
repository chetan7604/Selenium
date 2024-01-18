package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_login_bytext
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com");
		
        driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		Thread.sleep(3000);

		email.sendKeys("9767812005");
		Thread.sleep(3000);
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		Thread.sleep(2000);

		pwd.sendKeys("Qwerty@321");
	
		Thread.sleep(3000);
		WebElement lg_button = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		lg_button.click();
		
		
  
	}
}
