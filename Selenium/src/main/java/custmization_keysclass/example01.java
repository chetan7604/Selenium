package custmization_keysclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example01 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","G:\\java programme for testing\\New folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	driver.manage().window().maximize();
	Thread.sleep(5000);
	// click on create account
	WebElement create_account = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	Thread.sleep(2000);
	create_account.click();
	Thread.sleep(6000);
	//find listbox
	WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
	Thread.sleep(3000);
	
	//create actions class object
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	act.click(day).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_UP).perform();
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_UP).perform();

	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).perform();
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	act.click(month).perform();
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(4000);
	driver.close();
}

}
