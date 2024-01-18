package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");

    WebDriver driver =new ChromeDriver();
    
    driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
    Thread.sleep(7000);
    
    driver.manage().window().maximize();
    List<WebElement> all_rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
    Thread.sleep(3000);
    
    int last_index_row = all_rows.size()-1;
    
    System.out.println(last_index_row);
    Thread.sleep(2000);
    List<WebElement> all_cell = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
   
    int last_cell_index = all_cell.size()-1;
    
    System.out.println(last_cell_index);
    
    for(int i=0;i<=last_index_row;i++)
    {
    	
    	for(int j=0; j<=0;j++)
    	{
    		String value = all_rows.get(i).getText();
    		
    		System.out.print(value+"   ");
    		
    	}
    	System.out.println();
    }
    
    driver.close();
    
}
}
