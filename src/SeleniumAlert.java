
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class SeleniumAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\ACER\\\\Downloads\\\\ch\\\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"promptBox\"]")).click();
		Alert alert = driver.switchTo().alert();
		String msg= driver.switchTo().alert().getText();
		System.out.println("Alert message:"+ msg);
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Nothing");
		System.out.println("Alert msg handled");
		Thread.sleep(3000);
		driver.close();

	}

}
