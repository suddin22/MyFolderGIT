package com.bit.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.db.ReadFile;

// open a browser
//open browser using properties file
//nevigate browser
//close a browser

public class BaseTest {
public WebDriver dr;
Properties prop;

	@before

// from properties file
	public void startBrowser() {
		prop=ReadFile.readprop("C:\\Users\\shiha\\eclipse-workspace\\ReviewMaven\\src\\main\\java");
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome")) {
			System.out.println("Opened chrome browser");
		}else if(browser.equals("safari")) {
			System.out.println("Opened safari browser");
		}else if(browser.equals("firefox")) {
			System.out.println("Opened firefox browser");
		}
		dr.get(prop.getProperty("url"));
	}
}

	


// from command line thru maven file
//String browser=prop.getProperty("browser");
//if(browser.equals("chrome")) {
//	System.out.println("Opened chrome browser");
//}else if(browser.equals("safari")) {
//	System.out.println("Opened safari browser");
//}else if(browser.equals("firefox")) {
//	System.out.println("Opened firefox browser");
//}
//}
//}
