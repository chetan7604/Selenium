package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_webelement_methods 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","G:\\java programme for testing\\New folder\\chromedriver.exe" );

	     WebDriver driver =new ChromeDriver();
	     
	     driver.get("https://www.facebook.com");
	     Thread.sleep(3000);
	     driver.manage().window().maximize();
	     
	     WebElement emailFeild = driver.findElement(By.xpath("//input[@id='email']"));
	     
	     System.out.println(emailFeild.isDisplayed());
	     
	     System.out.println(emailFeild.isEnabled());
	   
	     emailFeild.sendKeys("9767812005");
	     Thread.sleep(3000);
	     emailFeild.clear();
	     
	     WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
	     System.out.println( loginbutton.getText());
	     Thread.sleep(2000);
	     
	     driver.navigate().to("https://faculty.washington.edu/chudler/java/boxes.html");
	      Thread.sleep(2000);
	      driver.manage().window().maximize();
	      WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	      checkbox.click();
	      Thread.sleep(3000);
	     System.out.println( checkbox.isSelected());
	     driver.close();
	     
	}

}
