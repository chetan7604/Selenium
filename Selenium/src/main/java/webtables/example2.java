package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 
{
	public static void main(String[]args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> all_rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowno = all_rows.size();
		System.out.println(rowno);
		Thread.sleep(2000);
		List<WebElement> cells = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		int cellno = cells.size();
		System.out.println(cellno);
		Thread.sleep(2000);
		 //WebElement first_Header=
		System.out.println( driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th[1]")).getText());
		    // System.out.println(first_Header.getText());
		     Thread.sleep(2000);
		  WebElement data=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[1]"));
		 System.out.println( data.getText());
		 Thread.sleep(2000);
		//WebElement for_header = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[i]/th[j]"));
		//WebElement for_data=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[i]/td[j]")); 
		 
		 
	  for(int i=1;i<=rowno;i++) 
	  {  
			  
		 for(int j=1;j<=cellno;j++) 
		  {
			 if(i==1) 
			 { 
			  System.out.print( driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/th["+j+"]")).getText()+"  ");
			 }
			 else
			{
			 System.out.print(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText()+"  ");
			}
		 }
			  System.out.println();
	 }
		
     driver.close();
		}
}
