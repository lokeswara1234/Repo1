package com.Facebook.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public TestBase() throws IOException
	{
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\lokes\\eclipse-workspace\\FacebookTest\\src\\main\\java\\com\\Facebook\\qa\\Config\\Congig.properties");
		    prop.load(ip);
		    }
		 catch(FileNotFoundException e)
		 {
			e.printStackTrace(); 
		 }
		 catch(IOException e)
		 {
			e.printStackTrace(); 
		 }
		
	}
	public static void Initialization()
	{
		String browserName= prop.getProperty("browser");
		if(browserName.contentEquals("chrome"))
		{
			System.setProperty("WebDriver.chrome.driver", "C:\\Users\\lokes\\Downloads\\Compressed\\chromedriver_win32");
			driver=new ChromeDriver();
		}
		else if(browserName.contentEquals("Firefox"))
		{
			
			System.setProperty("WebDriver.gecko.driver", "C:\\Users\\lokes\\Downloads\\Compressed\\geckodriver-v0.24.0-win32");
		    driver= new FirefoxDriver();
		    driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(prop.getProperty("url"));
		    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);  
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

