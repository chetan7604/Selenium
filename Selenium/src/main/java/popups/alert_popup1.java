package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_popup1
{

	public static void main(String[] args) throws InterruptedException
	{
       
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		//click on element to show alert popup
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		
		Thread.sleep(2000);
		
		
		Alert alt = driver.switchTo().alert();
		
		String text = alt.getText();
		
		System.out.println(text);
		
		alt.accept();
		
	}
}
