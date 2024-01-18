package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class exam03_double_click
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Thread.sleep(3000);

		Actions act=new Actions(driver);
		//Aprroach01
		//act.doubleClick(button).perform();
		//Approach02
		
		//act.moveToElement(button).doubleClick().perform();
		act.moveToElement(button).perform();
		act.doubleClick().perform();
	}
}
