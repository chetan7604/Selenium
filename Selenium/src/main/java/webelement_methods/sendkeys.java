package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);;
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		email.sendKeys("prasadng10@gmail.com");
		Thread.sleep(3000);
		email.clear();
		System.out.println(email.isEnabled());
		System.out.println(email.isDisplayed());
		Thread.sleep(4000);
		driver.navigate().to("https://faculty.washington.edu/chudler/java/boxes.html");
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
		checkbox.click();
		Thread.sleep(3000);
		System.out.println(checkbox.isSelected());
		driver.close();
		
		
		
		
		
		
	}
}
