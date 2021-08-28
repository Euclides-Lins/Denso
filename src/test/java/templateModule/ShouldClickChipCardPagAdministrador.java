package templateModule;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShouldClickChipCardPagAdministrador {
	@Test
	public void shouldClickChipCardPagAdministrador() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); //FIREFOX
		driver.get("http://200.129.168.9:21016/"); 
		
		//login
		driver.findElement(By.id("nome_user")).sendKeys("nucleo_dnaz");
		driver.findElement(By.id("outlined-pass")).sendKeys("senha", Keys.ENTER);
		
		Thread.currentThread();
		Thread.sleep(1000);
		
		//escolhe modulo
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[2]/div/div[2]/div/span/button")).click();
		
		Thread.currentThread();
		Thread.sleep(1000);
		
		//abre pagina de adminstrador
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[2]/div/div/ul/div[3]/div/span")).click();
		
		Thread.currentThread();
		Thread.sleep(1000);
		
		//abre chip card
		driver.findElement(By.xpath("//*[@id=\"help-icon\"]")).click();
				
		Thread.currentThread();
		Thread.sleep(3000);
				
		//fecha chipcard
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[1]/button[2]/span[1]")).click();
						
		driver.quit();
		
	}
}
