import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String URL = "http://output.jsbin.com/osebed/2";
		
		driver.get(URL);
		
		Select  fruits = new Select(driver.findElement(By.xpath("//*[@id=\"fruits\"]")));
		fruits.selectByVisibleText("Grape");
		fruits.selectByIndex(1);
		fruits.selectByValue("banana");
		Thread.sleep(5000);
		fruits.deselectAll();
		
////		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"vfb-7-1\"]"));
////		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"vfb-6-0\"]"));	
//		radio1.click();
//		checkbox1.click();
	
		Thread.sleep(5000);
		driver.close();
		//driver.quit();

	}

}
