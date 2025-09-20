package Testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Pagepackage.Quickcontact;
import Pagepackage.homepage;


public class Baseclass {
	public static 	WebDriver driver;
	public static homepage ob;
	public static Quickcontact qc;
	
	   @BeforeTest
	   public void SetUp()
	   {
		   driver=new ChromeDriver();
		   driver.get("https://keralaproperty.in");
		   driver.manage().window().maximize();
		   
	   }
	   @BeforeMethod
	   public void mtd() 
	   {
		    ob=new homepage(driver);
		 qc=new Quickcontact();
		   
	   }
	   

}
