package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		List<WebElement> all_rows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		
		int index_of_row = all_rows.size();
		System.out.println(index_of_row);
		
		Thread.sleep(2000);
		
		List<WebElement> all_cells = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/td"));
		
		int index_of_cell = all_cells.size();
		System.out.println(index_of_cell);
		
		Thread.sleep(4000);
		
		for(int i=1; i<=index_of_row;i++)
		{
			for(int j=1;j<=index_of_cell;j++)
			{
				if(i==1)
				{
				System.out.print(driver.findElement(By.xpath("//table[@class='tsc_table_s13']/thead/tr["+i+"]/th["+j+"]")).getText()+" ");
				}
				else
				{
					System.out.print(driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td["+j+"]")).getText()+"  ");
				}
			}
			System.out.println();
		}
		
		
	}
	

}
