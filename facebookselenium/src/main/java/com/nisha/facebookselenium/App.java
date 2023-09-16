package com.nisha.facebookselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class App 
{
    public static void main( String[] args )
    {

		System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
		WebDriver driver=new ChromeDriver();
         driver.get("https://www.facebook.com/");
         driver.findElement(By.id("email")).sendKeys("alferniya.nisha@gmail.com");
         driver.findElement(By.id("pass")).sendKeys("D3v0ps@123");
         driver.findElement(By.name("login")).click();
         
         
    }
}
