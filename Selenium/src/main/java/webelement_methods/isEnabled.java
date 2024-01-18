package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\java programme for testing\\New folder\\chromedriver.exe" );
   
	    WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://www.facebook.com/");
	     
	     driver.manage().window().maximize();
	     
	     Thread.sleep(2000);
	     
	     WebElement login_button = driver.findElement(By.xpath("//button[@name='login']"));
	    
	     String text = login_button.getText();
	     
	     System.out.println(text);
	     
	     WebElement email_address_field = driver.findElement(By.xpath("//input[@id='email']"));
	     
	     boolean result = email_address_field.isEnabled();
	     
	     System.out.println(result);
	     
	    // driver.close();
	     
		
	}

}
