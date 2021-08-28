package loginService;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class OpenNavigator {

	static WebDriver driver;
	
	@Test
	@Ignore
	public void shouldLoginPressingEnter() {
		WebElement cheese;
		WebDriverManager.firefoxdriver().setup();;
		driver = new FirefoxDriver();
		driver.get("http://200.129.168.9:21016");
		cheese = driver.findElement(By.id("nome_user"));
		WebElement password = driver.findElement(By.id("outlined-pass"));
		password.sendKeys("teste");
		cheese.sendKeys("nucleo_dnaz");			
		password.sendKeys(Keys.ENTER);	
		
	}
	
	@Test
	@Ignore
	public void shouldLoginClickingLoginButton() {
		WebElement cheese, button;
		WebDriverManager.firefoxdriver().setup();;
		driver = new FirefoxDriver();
		driver.get("http://200.129.168.9:21016");
		cheese = driver.findElement(By.id("nome_user"));
		WebElement password = driver.findElement(By.id("outlined-pass"));
		password.sendKeys("teste");
		cheese.sendKeys("nucleo_dnaz");			
		button = driver.findElement(By.xpath("//*[@id=\"App\"]/div/div[2]/div/form/div[2]/button"));
		button.click();
	}
	
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
		}
	}
	
	@Test
	@Ignore
	public void shouldLogout() throws InterruptedException {
		WebElement cheese, imageButton, logoutButton;
		WebDriverManager.firefoxdriver().setup();;
		driver = new FirefoxDriver();
		driver.get("http://200.129.168.9:21016");
		cheese = driver.findElement(By.id("nome_user"));
		WebElement password = driver.findElement(By.id("outlined-pass"));
		password.sendKeys("teste");
		cheese.sendKeys("nucleo_dnaz");			
		password.sendKeys(Keys.ENTER);
		Thread.currentThread().sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"profile-icon\"]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();	
	}
	
//	text = driver.findElement(By.xpath("//*[@id=\"App\"]/div/div[2]/div/form/div[1]/span")).getText();
	
	
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
	}
	
	@Test
	public void shouldCheckRequiredPasswordField() {
		WebElement cheese;
		String text;
		WebDriverManager.firefoxdriver().setup();;
		driver = new FirefoxDriver();
		driver.get("http://200.129.168.9:21016");
		cheese = driver.findElement(By.id("nome_user"));
		WebElement password = driver.findElement(By.id("outlined-pass"));
		password.sendKeys("teste");		
		password.sendKeys(Keys.ENTER);	
	}

	
	
	
}
