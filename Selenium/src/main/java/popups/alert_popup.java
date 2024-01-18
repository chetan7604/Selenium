package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_popup 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
	    // click on element to show alert pop up
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Thread.sleep(3000);
	    //switch selenium focus on alert pop up window from main page
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);
		 // handle alert pop up options

		String text = alt.getText();
		Thread.sleep(3000);
		System.out.println(text);
		
		driver.close();
	
	     // alt.accept();   // for positive feedback
		 //    alt.dismiss();   // for -ve feedback
		    
	}

}
