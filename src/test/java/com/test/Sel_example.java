package com.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_example {
  
	@SuppressWarnings("deprecation")
	public static void main( String args[]) 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://www.google.com");
	driver.manage().window().maximize();
	
	String Actualtitle=driver.getTitle();
	String Expectedtitle="Google";
  /* if(title.equalsIgnoreCase("google"))
       System.out.println(title+" title matches");
   else
	   System.out.println("no macth");*/
   Assert.assertEquals(Actualtitle,Expectedtitle);
   
   driver.findElement(By.name("q")).sendKeys("nothing phone 1");
	 driver.findElement(By.name("btnK")).submit();
	 
	 driver.close();
	 driver.quit();
	
	}
	 
}


