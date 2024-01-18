package dynamic_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example01 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		 WebElement close_button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		 close_button.click();
		 Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi note 11");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		WebElement Review = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[2]//span)[6]"));
		
		String ratings = Review.getText();
		
		System.out.println(ratings);
		String rating_review = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[2]//span)[2]")).getText();
		
		System.out.println(rating_review);
	}
	

}
