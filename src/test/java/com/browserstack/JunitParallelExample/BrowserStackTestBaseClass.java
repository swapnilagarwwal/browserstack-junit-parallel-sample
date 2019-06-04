package com.browserstack.JunitParallelExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.Before;


public class BrowserStackTestBaseClass {
	
	public WebDriver driver = null;
	
    @Before
    public void setUp() throws Exception{
    	String browserStackUsername = "BROWSERSTACK_USERNAME";
    	String browserStackAccessKey = "BROWSERSTACK_ACCESSKEY";
    	
    	DesiredCapabilities caps = new DesiredCapabilities();
    	caps.setCapability("os", "Windows");
    	caps.setCapability("os_version", "10");
    	caps.setCapability("browser", "Chrome");
    	caps.setCapability("browser_version", "74.0");
    	caps.setCapability("browserstack.local", "false");
    	caps.setCapability("browserstack.selenium_version", "3.5.2");
    	caps.setCapability("build", "something");
		try {
			driver = new RemoteWebDriver(new URL("https://"+browserStackUsername+":"+browserStackAccessKey+"@hub.browserstack.com/wd/hub"), caps);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @After
    public void tearDown() throws Exception {
    	System.out.println("in tear down");
        driver.quit();
    }
}