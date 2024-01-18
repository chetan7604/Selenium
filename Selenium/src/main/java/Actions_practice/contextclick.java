package Actions_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclick 
{
	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.decathlon.com");  
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//a[text()='Enter India Site']"));
		
		button.click();
		
		WebElement login_button = driver.findElement(By.xpath("//button[text()='LOGIN']"));
		
		Actions a1=new Actions(driver);
		Thread.sleep(3000);
		a1.contextClick(login_button).build().perform();
//		a1.moveToElement(login_button).contextClick().build().perform();
//		a1.moveToElement(login_button).perform();
//		Thread.sleep(3000);
//		a1.contextClick().perform();
		
		
	}

}
