package sgnupts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SignUpTests {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new InternetExplorerDriver();

		driver.get("file:///C:/automation/signUp/index.html");

		driver.findElement(By.id("FNTB")).sendKeys("a");

		driver.findElement(By.id("LNTB")).sendKeys("b");

		driver.findElement(By.id("EmailTB")).sendKeys("a@b");

		driver.findElement(By.id("PassTB")).sendKeys("1");

		driver.findElement(By.id("BGetS")).click();
		
		
		
		
//		driver.get("file:///C:/automation/signUp/index.html");
		
		
	}

}
