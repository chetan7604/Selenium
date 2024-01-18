package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\java programme for testing\\New folder\\chromedriver.exe" );

	     WebDriver driver =new ChromeDriver();
	     
	     driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
	     
	     Thread.sleep(5000);
	     
	     driver.manage().window().maximize();
	     
	    WebElement radiobutton = driver.findElement(By.xpath("(//input[@type='radio'])[4]"));
	    
	    WebElement Headline = driver.findElement(By.xpath("//h2[text()='Contact Form']"));
	    
	    boolean result = Headline.isDisplayed();
	     
	      boolean result1 = radiobutton.isDisplayed();
	      
	      System.out.println(result1);
	      System.out.println(result);
	      driver.quit();
	      
	     
	}

}
