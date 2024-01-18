package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_all_methods 
{
	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        String Title = driver.getTitle();
        System.out.println(Title);
        Thread.sleep(2000);
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        Dimension dim=new Dimension(500, 600);
        driver.manage().window().setSize(dim);
        Thread.sleep(3000);
        Dimension sizeofbrowser = driver.manage().window().getSize();
        System.out.println("get size of browser");
        System.out.println(sizeofbrowser);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        Point p=new Point(30, 20);
        driver.manage().window().setPosition(p);
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Point p1 = driver.manage().window().getPosition();
        System.out.println("get position of browser");
        System.out.println(p1);
        Thread.sleep(3000);
        //driver.close();
        driver.quit();
    }

}
