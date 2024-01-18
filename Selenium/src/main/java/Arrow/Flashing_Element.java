 package Arrow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flashing_Element
{
	public static void main (String []args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver","G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
//		
//		WebElement Login = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]"));
		WebElement Login = driver.findElement(By.className("help"));
		
	    
		//drawing border 
		javascriptUtil.drawBorder(Login, driver);
		//flashing element
	    javascriptUtil.flash(Login, driver);
	    Thread.sleep(4000);
	    
	   //For get title
	    String Title = javascriptUtil.getTitleByJS(driver);
	    System.out.println(Title);
	    
	    javascriptUtil.clickElementByJS(Login, driver);
	    
	    //click element using javascriptexecutor
	  WebElement Login1 = driver.findElement(By.xpath("//ul//a/span[@class='help']"));
//	  javascriptUtil.clickElementByJS(Login, driver);
	  
	  //create alert
//	  javascriptUtil.generateAlert(driver, "You clicked on login button...");
	  
	  //Refresh browser byj js
//	  javascriptUtil.refreshBrowserByJS(driver);
	  Thread.sleep(4000);
	  
	  //Scroll down page till we found element
	  WebElement img = driver.findElement(By.xpath("(//div[@class='img'])[2]"));
//	  javascriptUtil.scrollIntoView(img, driver);
	  
	  //Scroll down page till end
//	  javascriptUtil.scrollPageDown(driver);
	  
	  //get page inner text
	  String text = javascriptUtil.getPageInnerText(driver);
	  System.out.println(text);
	  
	  driver.close();
	  
	  
	    
	
		
	}

} 
