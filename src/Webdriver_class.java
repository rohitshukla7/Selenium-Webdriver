import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

 

public class Webdriver_class{

   public static void main(String[] args){

	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver(); 
       JavascriptExecutor js = (JavascriptExecutor) driver;
       
       
       driver.manage().window().maximize();
       driver.get("http://www.amazon.in");
              
       driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[2]")).click();
       driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("zrohit95@gmail.com");
       driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("bajrangi");
       driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
       
       driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone 6s",Keys.ENTER);
       driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div/div/div[2]/div[1]/div[1]/a/h2")).click();
       
       driver.findElement(By.xpath("//*[@id=\"buyBackAccordionRow\"]/div/div[1]/a/h5/div[1]/span/span")).sendKeys(Keys.PAGE_DOWN);
       //js.executeScript("window.scrollBy(0,250)", "");
       
       driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).click();
       
       
       driver.close();

   }

}
