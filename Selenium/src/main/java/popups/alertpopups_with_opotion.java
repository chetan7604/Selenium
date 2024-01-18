package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopups_with_opotion 
{
	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		String text = alt.getText();
		System.out.println(text);
		
		Thread.sleep(2000);
	//	alt.accept();     positive response
//		alt.dismiss();  //negative response
		
		
	}

}
