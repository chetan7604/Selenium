package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_01_Xpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		  
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement email_address_field = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		 String email = email_address_field.getTagName();
		 System.out.println(email);
		Thread.sleep(3000);
		
		email_address_field.sendKeys("9767812005");
		
		Thread.sleep(3000);
		
		WebElement password_field = driver.findElement(By.xpath("//input[@type='password']"));
		
		Thread.sleep(2000);
		
		password_field.sendKeys("Qwerty@321");
		
		Thread.sleep(3000);
		
		WebElement login_button_field = driver.findElement(By.xpath("//button[@name='login']"));
		
		String lf = login_button_field.getText();
		
		System.out.println(lf);
		login_button_field.click();
		
	    WebElement	UserLogo=driver.findElement(By.xpath("//*[@id=\"mount_0_0_Og\"]/div/div[1]/div/div[2]/div[5]/div[1]/span/div/div[1]/div/svg/g/image"));
		UserLogo.click();
		
		WebElement Logout=driver.findElement(By.xpath("//*[@id=\"mount_0_0_Og\"]/div/div[1]/div/div[2]/div[5]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span"));
		
		Logout.click();
	}

}
