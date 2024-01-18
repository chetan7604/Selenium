package multiple_web_ele_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_elements
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	List<WebElement> links = driver.findElements(By.xpath("//div"));
	
	System.out.println(links.size());
	
	driver.close();
	

}
}
