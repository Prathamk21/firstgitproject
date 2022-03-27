package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class YahooAssignmentWithComposeFunctionality {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://login.yahoo.com/");
      driver.manage().window().maximize();
      WebElement user = driver.findElement(By.name("username"));
      user.sendKeys("prathameshjavaselenium212");
      driver.findElement(By.name("signin")).click();
      Thread.sleep(4000);
     WebElement password = driver.findElement(By.name("password"));
      password.sendKeys("JavaSelenium@21");
      driver.findElement(By.name("verifyPassword")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("//*[@class='icon mail']")).click();
      Thread.sleep(6000);
      driver.findElement(By.xpath("//a[@href='/d/compose/']")).click();
      driver.findElement(By.cssSelector("#message-to-field")).sendKeys("ketan@paratussystems.com");
      driver.findElement(By.cssSelector("#mail-app-component > div > div > div.compose-header.en_0 > div:nth-child(3) > div > div > input")).sendKeys("Hi Ketan, I am Prathamesh.");
      driver.findElement(By.cssSelector("#editor-container > div.rte.em_N.ir_0.iy_A.iz_h.N_6Fd5 > div")).sendKeys("I have done my assignment.");
      Thread.sleep(4000);
      driver.findElement(By.cssSelector("#mail-app-component > div > div > div.em_N.D_F.ek_BB.p_R.o_h > div:nth-child(2) > div > button")).click();
      
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
