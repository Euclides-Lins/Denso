package loginService;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShouldCheckRequiredMatriculaField {


	static WebDriver driver;
	
	@Test
	@Ignore
	public void shouldCheckRequiredMatriculaField() {
		WebElement cheese;
		String text;
		WebDriverManager.firefoxdriver().setup();;
		driver = new FirefoxDriver();
		driver.get("http://200.129.168.9:21016");
		cheese = driver.findElement(By.id("nome_user"));
		WebElement password = driver.findElement(By.id("outlined-pass"));
		cheese.sendKeys("nucleo_dnaz");			
		password.sendKeys(Keys.ENTER);
		driver.close();
	}
}
