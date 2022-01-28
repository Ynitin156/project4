package demoall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example1 
{
  @Test(enabled=false)
  public void facebook()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitin.yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	
	  driver.manage().window().maximize();
	  
	  
  }
  
  @Test
  public void instagram()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitin.yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.instagram.com");
	  driver.manage().window().maximize();
	  
	  
  }
    
}
