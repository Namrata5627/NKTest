package com.avamo.testassignment.qa.Base;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.avamo.testassignment.qa.utilities.testUtil;


	public class BaseClass 
	{
		public static WebDriver driver;
		public static Properties prop;
		public  static EventFiringWebDriver e_driver;
		//public static WebEventListener eventListener;
		
		public BaseClass(){
			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/com.avamo.testassignment/src/main/java/com/"
						+ "+avamo/testassignment/qa/config/config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		public static void initialization(){
			String browserName = prop.getProperty("browser");
			
			if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "/Users/Namrata.Kashyap/eclipse-workspace/com.avamo.testassignment/chromedriver");	
				driver = new ChromeDriver(); 
			}
			else if(browserName.equals("FF")){
				System.setProperty("webdriver.gecko.driver", "/Users/Namrata.Kashyap/eclipse-workspace/com.avamo.testassignment/geckodriver");	
				driver = new FirefoxDriver(); 
			}

			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(testUtil.pageLoad_timeOut, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(testUtil.implicitWait, TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
			
		}
		
		
		
		
		
		
		
		

	}


