package craftsoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mesfi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("http://shop.icraftsoft.net:8095/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[1]/form/div[1]/input")).sendKeys("2035");
		driver.findElement(By.xpath("/html/body/div/div/div[1]/form/div[2]/input")).click();
		Thread.sleep(2000);
	}
	
}