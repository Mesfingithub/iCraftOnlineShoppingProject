package craftsoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopping {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mesfi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("http://shop.icraftsoft.net:8095/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[1]/form/div[1]/input")).sendKeys("2035");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[1]/form/div[2]/input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[1]/td[2]/div/div[4]/form/button[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[1]/td[1]/div/div[4]/form/button[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[2]/td[2]/div/div[4]/form/button[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[3]/td[2]/div/div[4]/form/button[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/nav/div/div[3]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div/div/form[2]/input[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[8]/td[1]/div/div[4]/form/button[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/nav/div/div[3]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"cart_table\"]/tbody[1]/tr[5]/td[6]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"btn2\"]")).click();
		
		
	}
	
}
