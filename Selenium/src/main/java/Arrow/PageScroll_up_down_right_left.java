package Arrow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll_up_down_right_left 
{
	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver","G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		 Thread.sleep(5000);
		 driver.manage().window().maximize();
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//for page scrolling up & down
		 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,10000)");
		 Thread.sleep(3000);
		
		 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-5000)");
		 
		 Thread.sleep(3000);
		 //page scrolling right left
		((JavascriptExecutor)driver).executeScript("window.scrollBy(6000,0)");
		
		Thread.sleep(4000);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(-2000,0)");
		 Thread.sleep(3000);
		 
		 //page scrolling upto element
	     WebElement ele = driver.findElement(By.xpath("//a[text()='Maliketh']"));
	     Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",ele);		 
		

	}

}
