package com.browserstack.JunitParallelExample;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestClassB extends BrowserStackTestBaseClass {
 
	@Test
    public void test_B1(){
    	System.out.println("Class B Test 1");
		
    	String searchString = "BrowserStack";
		System.out.println("Starting to run the test for: " + searchString);
		driver.get("https://www.google.co.in");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(searchString);
        element.submit();
        assertTrue(driver.getTitle().startsWith(searchString));
    }
     
    @Test
    public void test_B2(){
        System.out.println("Class B Test 2");
		
    	String searchString = "BrowserStack";
		System.out.println("Starting to run the test for: " + searchString);
		driver.get("https://www.google.co.in");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(searchString);
        element.submit();
        assertTrue(driver.getTitle().startsWith(searchString));
    }
     
    @Test
    public void test_B3(){
        System.out.println("Class B Test 3");
		
    	String searchString = "BrowserStack";
		System.out.println("Starting to run the test for: " + searchString);
		driver.get("https://www.google.co.in");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(searchString);
        element.submit();
        assertTrue(driver.getTitle().startsWith(searchString));
    }
     
    @Test
    public void test_B4(){
        System.out.println("Class B Test 4");
		
    	String searchString = "BrowserStack";
		System.out.println("Starting to run the test for: " + searchString);
		driver.get("https://www.google.co.in");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(searchString);
        element.submit();
        assertTrue(driver.getTitle().startsWith(searchString));
    }
}