package cubm;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class product {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();	
		driver.get(" http://stage.cubmcpaws.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("my_girl")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[8]/div/div/div[4]/div[1]/ul/li[2]/div/div[1]/img"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@srcset,'red_printed_fashion_woven_top_for_girls_age_4_to_12')]"))).click();
		
		Set<String> winid= driver.getWindowHandles();
		Iterator<String> itr= winid.iterator();
		String firstwin= itr.next();
		driver.switchTo().window(firstwin);
        winid= driver.getWindowHandles();
           itr= winid.iterator();
            itr.next();//first win
		  String secwinid = itr.next();
		  driver.switchTo().window(secwinid);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"27\"]"))).click();
		
		
		
		
		
		
		
		
	}

}
