package Listbox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example03
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.anhtester.com/basic-select-dropdown-demo.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement listbox = driver.findElement(By.xpath("//select[@class='form-control']"));
		
		Select s1=new Select(listbox);
		WebElement firstopt = s1.getFirstSelectedOption();
		String opt = firstopt.getText();
		System.out.println(opt);
		s1.selectByIndex(7);
		Thread.sleep(3000);
		//s1.selectByValue("Sunday");
		//s1.selectByVisibleText("Friday");
		List<WebElement> alloptions = s1.getOptions();
//		Iterator<WebElement> l1 = alloptions.iterator();
//		while(l1.hasNext())
//		{
//			System.out.println(l1.next());
//		}
//		
		for(WebElement option:alloptions)
		{
			String opt1 = option.getText();
			System.out.println(opt1);
			
		}
		
		
		
		
		
		
	}

}
