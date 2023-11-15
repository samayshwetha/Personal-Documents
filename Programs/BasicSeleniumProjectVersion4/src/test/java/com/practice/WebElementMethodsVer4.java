package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebElementMethodsVer4 {

	public static void main(String[] args) {
		
		//getAriaRole(): fetch the type of the web element(ex: checkbox, textbox,radio)
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//textbox
		WebElement attriPath = driver.findElement(By.id("username"));
	    System.out.println(attriPath.getAriaRole());
	    System.out.println("DOM Attribute: "+attriPath.getDomAttribute("id"));
	    System.out.println("Accessible Name: "+attriPath.getAccessibleName());
	    
	    //Please identify yourself
	    WebElement attriPlease = driver.findElement(By.id("headerContainer"));
	    System.out.println("DOM Attribute: "+attriPlease.getDomAttribute("id"));
	    System.out.println("Accessible Name: "+attriPlease.getAccessibleName());
	    System.out.println("Property Name :"+attriPlease.getDomProperty("id"));
	    
	    /*//logo
	    WebElement pathLogo = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
	    System.out.println(pathLogo.getAriaRole());
	    System.out.println("Accessible Name: "+pathLogo.getAccessibleName());
	    
	    
	    //checkbox
	    WebElement pathCheck = driver.findElement(By.xpath("//input[@type='checkbox']"));
	    System.out.println(pathCheck.getAriaRole());
	    System.out.println("Accessible Nme: "+pathCheck.getAccessibleName());
	    
	  	    
	    //login link
	    WebElement pathLogin = driver.findElement(By.xpath("//div[text()='Login ']"));
	    System.out.println(pathLogin.getAriaRole());
	 	System.out.println("Accessible Name: "+pathLogin.getAccessibleName());*/
	    
	    //getDomProperty
	    
	}

}
