package costCenter;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShouldInsertStringInNumberField {
	@Test
	public void shouldInsertStringInNumberField() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); 
		WebElement cost, name;
		driver.get("http://200.129.168.9:21016/");
		driver.findElement(By.id("nome_user")).sendKeys("nucleo_dnaz");
		driver.findElement(By.id("outlined-pass")).sendKeys("qualquersenha");
		driver.findElement(By.id("outlined-pass")).sendKeys(Keys.ENTER);
		Thread.currentThread();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[2]/div/div[1]/div/span/button")).click();
		Thread.currentThread();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div/div/div/main/div/div/div/div/div/a[3]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div/div/main/div/div/div/div/div/div/div[1]/button")).click();		
		cost = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/div/div/div[1]/div/input"));
		cost.sendKeys("STRING TESTE");
		name = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/div/div/div[2]/div/input"));
		name.sendKeys("NOVO TESTE 01");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[3]/button[2]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[3]/button[1]")).click();
		Thread.currentThread();
		Thread.sleep(1000);
		driver.close();
	}
}
