package org.practise.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Sample {
	@Test()
	private void passstrng() {
		System.setProperty("webdriver.chrome.driver","C:\\Pyro\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
		
	
	
	}}
