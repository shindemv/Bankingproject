package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	FileInputStream fileinputstream;
	public static WebDriver driver;
	
	public static String projectpath= System.getProperty("user.dir"); 
	
	 public void LaunchTheWeb() throws IOException
	 {
		 fileinputstream = new FileInputStream(projectpath+"\\src\\test\\resources\\Properties\\config.properties");
		 
		 driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 Properties prop= new Properties();
		 
		 prop.load(fileinputstream);
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 prop.getProperty("WebUrl");
		 
		 driver.get(prop.getProperty("WebUrl"));
		 
	 }
}
