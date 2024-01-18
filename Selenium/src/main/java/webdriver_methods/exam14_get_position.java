  package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam14_get_position 
{
public static void main(String[] args) 
{
	
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	
    Point p=driver.manage().window().getPosition();
    
    System.out.println(p);
    
	
}
}
