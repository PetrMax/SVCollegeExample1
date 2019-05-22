package sgnupts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

class SignUPTest 
{
	
	public static WebDriver driver;

	@Test
	void sanity() 
	{

	    String fistName = "a", lastName = "b", email = "a@b", pass = "1";
		
	    WebDriver driver = signUpTest(fistName, lastName, email, pass);
		
		assertEquals(true, driver.getPageSource().contains("Index of"));
		
	
	}
	
	
	
	private WebDriver signUpTest(String fistName, String lastName, String email, String pass) {
		
		//ChromeDriver()
		//FirefoxDriver()
		//InternetExplorerDriver()
		driver = new ChromeDriver();

		driver.get("file:///C:/automation/signUp/index.html");

		driver.findElement(By.id("FNTB")).sendKeys(fistName);

		driver.findElement(By.id("LNTB")).sendKeys(lastName);

		driver.findElement(By.id("EmailTB")).sendKeys(email);

		driver.findElement(By.id("PassTB")).sendKeys(pass);

		driver.findElement(By.id("BGetS")).click();
		
		return driver;
	}
	
	private WebDriver loginTest(String email, String pass) {
		
		//ChromeDriver()
		//FirefoxDriver()
		//InternetExplorerDriver()
		driver = new ChromeDriver();

		driver.get("file:///C:/automation/signUp/index.html");
		
		driver.findElement(By.id("LoginB")).click();

		driver.findElement(By.id("ReEmailTB")).sendKeys(email);

		driver.findElement(By.id("RePassTB")).sendKeys(pass);

		driver.findElement(By.id("ReBGetS")).click();

		return driver;
	}



	@Test
	void functionalityLogin(){ 
		String email = "a@b", pass = "1";
		
	    WebDriver driver = loginTest(email, pass);

		assertEquals(true, driver.getPageSource().contains("Index of"));
	
		
	}
	
	


	
	@Test
	void functionality(){ 
	    String fistName = "Max", lastName = "Petrov", email = "petr@gmail.com", pass = "123qwerty";
		
	    WebDriver driver = signUpTest(fistName, lastName, email, pass);
		
		assertEquals(true, driver.getPageSource().contains("Index of"));
	}
	
	@Test
	void errorHandlingSignUPWithoutFirstName(){ 
	    String fistName = "", lastName = "Petrov", email = "petr@gmail.com", pass = "123qwerty";
		
	    WebDriver driver = signUpTest(fistName, lastName, email, pass);
		
		assertEquals(false, driver.getPageSource().contains("Index of"));
	}
	
	@Test
	void errorHandlingSignUPWithoutLastName(){ 
	    String fistName = "Kuku", lastName = "", email = "petr@gmail.com", pass = "123qwerty";
		
	    WebDriver driver = signUpTest(fistName, lastName, email, pass);
		
		assertEquals(false, driver.getPageSource().contains("Index of"));
	}
	
	@Test
	void errorHandlingSignUPWithoutEmail(){ 
	    String fistName = "Max", lastName = "Petrov", email = "", pass = "123qwerty";
		
	    WebDriver driver = signUpTest(fistName, lastName, email, pass);
		
		assertEquals(false, driver.getPageSource().contains("Index of"));
		driver.close();
	}
	
	@Test
	void errorHandlingSignUPWithoutPassword(){ 
	    String fistName = "Max", lastName = "Petrov", email = "petr@gmail.com", pass = "";
		
	    WebDriver driver = signUpTest(fistName, lastName, email, pass);
		
		assertEquals(false, driver.getPageSource().contains("Index of"));
		driver.close();
	}
	
	@Test
	void errorHandlingSignUPWithWrongEmail(){ 
	    String fistName = "Max", lastName = "Petrov", email = "a", pass = "123qwerty";
		
	    WebDriver driver = signUpTest(fistName, lastName, email, pass);
		
		assertEquals(false, driver.getPageSource().contains("Index of"));
	}
	
	@Test
	void errorHandlingLoginWithWrongEmail(){ 
		String email = "a", pass = "1";
		
	    WebDriver driver = loginTest(email, pass);

		assertEquals(false, driver.getPageSource().contains("Index of"));
	}
	
	@Test
	void errorHandlingLoginWithoutEmail(){ 
		String email = "", pass = "123456";
		
	    WebDriver driver = loginTest(email, pass);

		assertEquals(false, driver.getPageSource().contains("Index of"));
		
	}
	
	@Test
	void errorHandlingLoginWithoutPassword(){ 
		String email = "petr@gmail.com", pass = "";
		
	    WebDriver driver = loginTest(email, pass);

		assertEquals(false, driver.getPageSource().contains("Index of"));
	}

}
