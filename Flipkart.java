package Arustu_Technology_Pvt_Ltd.RMS;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	void openWebPage(WebDriver driver)
	{
		String url = "https://www.flipkart.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	void search(WebDriver driver) throws InterruptedException
	{
		WebElement ss = driver.findElement(By.xpath("//*[@type=\"text\"]"));
		ss.sendKeys("HP 15s Intel Core i3 12th Gen 1215U");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		WebElement lapi = driver.findElement(By.xpath("//*[@data-id=\"COMGKW2NSU4SPZSG\"]"));
		lapi.click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String a:windowHandles)
		{
			if(driver.switchTo().window(a).getTitle()=="HP 15s Intel Core i3 12th Gen 1215U - (8 GB/512 GB SSD/Windows 11 Home) 15s-fq5007TU Thin and Light Laptop Rs.56260 Price in India - Buy HP 15s Intel Core i3 12th Gen 1215U - (8 GB/512 GB SSD/Windows 11 Home) 15s-fq5007TU Thin and Light Laptop Natural Silver Online - HP : Flipkart.com")
			{
				driver.switchTo().window(a);
			}
		}
		WebElement pincode = driver.findElement(By.xpath("//*[@class=\"_36yFo0\"]"));
		pincode.sendKeys("302018");
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		WebElement add = driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]"));
		add.click();
		Thread.sleep(2000);
		WebElement Place_Order = driver.findElement(By.xpath("//*[contains(text(),'Place Order')]"));
		Place_Order.click();
		WebElement mobile_NO = driver.findElement(By.xpath("//*[@class=\"_2IX_2- _17N0em\"]"));
		mobile_NO.sendKeys("9999999999");
		WebElement cont = driver.findElement(By.xpath("//*[contains(text(),'CONTINUE')]"));
		cont.click();
//		I cann't give the credentials 
		Thread.sleep(8000);
		WebElement log = driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _20xBvF _3AWRsL\"]"));
		log.click();
		
	}
	

	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64//chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
	     options.addArguments("--remote-allow-origins=*");
		 WebDriver driver =  new ChromeDriver();
		 Flipkart obj = new Flipkart();
		 obj.openWebPage(driver);
		 obj.search(driver);
		 
	}

}
