package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\java programme for testing\\New folder\\chromedriver.exe" );

	     WebDriver driver =new ChromeDriver();
	     
	     driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
	     
	     Thread.sleep(5000);
	     
	     driver.manage().window().maximize();
	     
	    WebElement radiobutton = driver.findElement(By.xpath("(//input[@type='radio'])[4]"));
	    Thread.sleep(4000);
	    radiobutton.click();
	  
	      boolean result = radiobutton.isSelected();
	      boolean result1 = radiobutton.isDisplayed();
	      
	      System.out.println(result);
	      System.out.println(result1);
	      Thread.sleep(2000);
	     
	      driver.navigate().to("https://faculty.washington.edu/chudler/java/boxes.html");
	      Thread.sleep(2000);
	      driver.manage().window().maximize();
	      WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	      checkbox.click();
	      Thread.sleep(3000);
	     System.out.println( checkbox.isSelected());
	      
    
	}

}
