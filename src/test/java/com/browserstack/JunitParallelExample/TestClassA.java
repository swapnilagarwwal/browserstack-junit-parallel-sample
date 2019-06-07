package com.browserstack.JunitParallelExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;

public class TestClassA extends BrowserStackTestBaseClass {
 
    @Test
    public void test_A1(){
    	System.out.println("Class A Test 1");
		
    	String searchString = "BrowserStack";
		System.out.println("Starting to run the test for: " + searchString);
		driver.get("https://www.google.co.in");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(searchString);
        element.submit();
        assertTrue(driver.getTitle().startsWith(searchString));
    }
     
    @Test
    public void test_A2(){
        System.out.println("Class A Test 2");
		
    	String searchString = "Selenium Testing";
		System.out.println("Starting to run the test for: " + searchString);
		driver.get("https://www.google.co.in");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(searchString);
        element.submit();
        assertTrue(driver.getTitle().startsWith(searchString));
    }
     
    @Test
    public void test_A3(){
        System.out.println("Class A Test 3");
		
    	String searchString = "Javascript Testing";
		System.out.println("Starting to run the test for: " + searchString);
		driver.get("https://www.google.co.in");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(searchString);
        element.submit();
        assertTrue(driver.getTitle().startsWith(searchString));
    }
     
    @Test
    public void test_A4(){
        System.out.println("Class A Test 4");
		
    	String searchString = "Functional Testing";
		System.out.println("Starting to run the test for: " + searchString);
		driver.get("https://www.google.co.in");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(searchString);
        element.submit();
        assertTrue(driver.getTitle().startsWith(searchString));
    }
}