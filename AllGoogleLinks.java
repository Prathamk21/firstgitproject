package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AllGoogleLinks {
	WebDriver driver;
  @Test
  public void printAllGoogleLinks() {
	  driver.get("https://www.google.com");
	  List<WebElement> allGoogleLinks = driver.findElements(By.tagName("a"));
	  
	  for (WebElement element : allGoogleLinks) {
		  System.out.println(element.getText() + "-" + element.getAttribute("herf"));
	  }
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
