package craftsoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shipment {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mesfi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("http://shop.icraftsoft.net:8095/shipment");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"shipment_table\"]/tbody/tr/td[4]/a")).click();

}
	
}
