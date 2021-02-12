import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\ch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/form/div[2]/div[1]/div/div/input"))
			.sendKeys("E:\\rj\\selenium_upload_file.txt");
		Thread.sleep(5000);
		System.out.println("passed");
		driver.close();

	}

}
