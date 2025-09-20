package Pagepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homepage {
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="/html/body/header/div[2]/div/div[1]/h2")WebElement title;
	@FindBy(xpath="/html/body/header/div[1]/div/div/ul/li[8]/a")WebElement district;
	public homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	public String verifytitle()
	{
		String acttitle=title.getText();
		return acttitle;
	}
	public void district(String dis)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		Actions act=new Actions(driver);
		act.moveToElement(district).perform();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/header/div[1]/div/div/a")))).click();	
	}
	public void viewdetails() {
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        try {
	            WebElement viewdetails = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("View Details")));
	            viewdetails.click();
	            System.out.println("clicked on 'View Details'");
	        } catch (Exception e) {
	            System.out.println(" Could not find or click " + e.getMessage());
	        }
	    }
		
	}
	public void presentlogo() {
		WebElement logo=driver.findElement(By.xpath("/html/body/header/div[2]/div/a[1]"));
		boolean status=logo.isDisplayed();
		if(status)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
		
	}
	public void details(String string, String string2, String string3, String string4) {
		// TODO Auto-generated method stub
		
	}

}
