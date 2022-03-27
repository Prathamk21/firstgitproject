package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Wikipedia {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.wikipedia.org/");
	  driver.findElement(By.cssSelector("#js-link-box-en > strong")).click();
	  driver.findElement(By.name("search")).sendKeys("Selenium");
	  driver.findElement(By.name("go")).click();
	  
	  String expectedTitle = "Selenium - Wikipedia";
	     // Thread.sleep(1000);
	      String actualTitle = driver.getTitle();
	      
	      assertEquals(actualTitle, expectedTitle);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
      driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
