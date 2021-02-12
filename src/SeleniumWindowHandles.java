
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class SeleniumWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ACER\\\\Downloads\\\\ch\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(3000);
		String mainHandle=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id=\"win1\"]")).click();
		Thread.sleep(2000);
		Set<String> winHandles = driver.getWindowHandles();
		for(String handle: winHandles) {
			if(!handle.equals(mainHandle)) {
				driver.switchTo().window(handle);
				System.out.println("This sis second window:"+handle);
				System.out.println("Title of second window:"+driver.getTitle());
				driver.close();
			}
			
		}
		Thread.sleep(5000);
		driver.switchTo().window(mainHandle);
		Thread.sleep(3000);
		System.out.println("This is main window"+mainHandle);
		System.out.println("The current URL is:"+driver.getCurrentUrl());
		driver.close();
		
	}

}
