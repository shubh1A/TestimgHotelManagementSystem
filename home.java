package hmstest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class home {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\selenium\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:9090/HMS/home.jsp");
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[1]/td[2]/input")).sendKeys("shubham");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[2]/td[2]/input")).sendKeys("shubh1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[3]/td/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/ul[1]/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/ul[1]/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[1]/td[2]/input")).sendKeys("001");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[2]/td[2]/input")).sendKeys("north");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[3]/td[2]/input")).sendKeys("chhole");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[4]/td[2]/input")).sendKeys("60");
		driver.findElement(By.xpath("/html/body/div/form/button")).click();
		driver.navigate().to("http://localhost:9090/HMS/home.jsp");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/ul[1]/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("foodid")).sendKeys("001");
		Thread.sleep(2000);
		driver.findElement(By.className("actionBtn")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td[5]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("price")).clear();
	Thread.sleep(2000);
	driver.findElement(By.name("price")).sendKeys("50");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div/form/button")).click();
	driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[6]/button")).click();
	
	
	
		

	}

}
