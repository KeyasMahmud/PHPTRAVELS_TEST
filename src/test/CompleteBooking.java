package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteBooking {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium drivers\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	   
	    //visit phptravels in chrome
		   driver.get("https://www.phptravels.net");
		   driver.manage().window().maximize();  
		   
	    //select tours
		    driver.findElement(By.xpath("//*[@id=\"tours-tab\"]/span[2]")).click();
		    
	    //input destination
		    driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div/div[1]/form/div/div/div[1]/div/div/div/span/span[1]/span/span[1]")).click();	    
		    driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Johor Bahru");	    
		    WebElement textbox = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		    textbox.sendKeys(Keys.ENTER);
		    
	    //Select future date
		    driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div/div[3]/form/div/div/div[2]/div/div/div/input")).click();	    
		    driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/tbody/tr[4]/td[2]")).click();
		    
	    //make adult count 2 and search
		    driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div/div[3]/form/div/div/div[3]/div/div/div/a")).click();	    
		    driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div/div[3]/form/div/div/div[3]/div/div/div/div/div[1]/div/div/div[2]/i")).click(); 
		    driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div/div[3]/form/div/div/div[4]/div/button")).click();
		    
	    //scroll down to legoland and click details
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,1800)", "");
		   
		   driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/section/ul/li[6]/div/div[2]/div/div[2]/div/a")).click();
		
		//click book now
		   driver.findElement(By.xpath("/html/body/section[2]/div[2]/div/div/div[2]/div/div/div/form/div[3]/button")).click();
		   
		//complete the booking
		   //personal info
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[1]/div[2]/div/div/div[1]/div/div/input")).sendKeys("XXXX");
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/div/input")).sendKeys("YYYY");
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[1]/div[2]/div/div/div[3]/div/div/input")).sendKeys("xx123@xmail.com");
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[1]/div[2]/div/div/div[4]/div/div/input")).sendKeys("017xxxxxxxx");
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[1]/div[2]/div/div/div[5]/div/div/input")).sendKeys("Dhaka,Bangladesh");
			   
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[1]/div[2]/div/div/div[6]/div/div/div/span/span[1]/span/span[1]")).click();
			   driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Bangladesh");
			   
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[1]/div[2]/div/div/div[7]/div/div/div/span/span[1]/span/span[1]")).click();
			   driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Bangladesh");
			   
		  //travellers info
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div/div[2]/input")).sendKeys("XXXX");
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div/div[3]/input")).sendKeys("YYYY");
			   
			   JavascriptExecutor js1 = (JavascriptExecutor) driver;
			   js1.executeScript("window.scrollBy(0,2000)", "");
			   
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div[2]/input")).sendKeys("AAAA");
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div[3]/input")).sendKeys("BBBB");
			   
		  //payment method
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[3]/div[2]/div/ul/div[2]/div/div/input")).click();
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[4]/div/div/div/input")).click();
			   
		  //confirm booking
			   driver.findElement(By.xpath("/html/body/div[2]/form/section[1]/div/div/div[1]/div[5]/div/button")).click();
	    
	driver.quit();

	}

}
