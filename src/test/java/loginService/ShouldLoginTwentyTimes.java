package loginService;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShouldLoginTwentyTimes {

	static WebDriver driver;
	
	@Test
	@Ignore
	public void shouldLoginTwentyTimes() throws InterruptedException {
		WebElement cheese;
		WebDriverManager.firefoxdriver().setup();;
		driver = new FirefoxDriver();
		driver.get("http://200.129.168.9:21016");

		for(int i = 0; i <20; i++) {
			cheese = driver.findElement(By.id("nome_user"));
			WebElement password = driver.findElement(By.id("outlined-pass"));
			password.sendKeys("teste");
			cheese.sendKeys("nucleo_dnaz");			
			password.sendKeys(Keys.ENTER);
			Thread.currentThread().sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"profile-icon\"]")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
			driver.close();
		}
	}
}
