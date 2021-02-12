
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ACER\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAmazon() throws Exception {
    driver.get("https://www.amazon.com/");
    driver.findElement(By.id("twotabsearchtextbox")).click();
    driver.findElement(By.id("twotabsearchtextbox")).clear();
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11");
    driver.findElement(By.name("site-search")).submit();
    driver.findElement(By.xpath("//img[@alt='iPhone 11 Pro Max']")).click();
    driver.findElement(By.xpath("//img[@alt='iPhone 11']")).click();
    driver.findElement(By.xpath("//img[@alt='iPhone XS Max']")).click();
    driver.findElement(By.linkText("Gift Cards")).click();
    driver.findElement(By.xpath("//div[@id='nav-subnav']/a[6]/span")).click();
    driver.findElement(By.linkText("Customer Service")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
