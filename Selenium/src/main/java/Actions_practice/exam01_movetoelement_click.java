 package Actions_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class exam01_movetoelement_click 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");  
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("//a[text()='Paytm for Consumer']"));
		button.click();
		WebElement sbutton = driver.findElement(By.xpath("//span[text()='Sign In']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(sbutton).click().perform();
		
		
		
	}

}
