package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class exam01_movetoelement
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	 WebElement close_button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	 close_button.click();
	
	WebElement button = driver.findElement(By.xpath("//a[text()='Login']"));
	Thread.sleep(2000);
	
	Actions act=new Actions(driver);
	//act.moveToElement(button).click().perform();
	act.moveToElement(button).perform();

	
}
}
