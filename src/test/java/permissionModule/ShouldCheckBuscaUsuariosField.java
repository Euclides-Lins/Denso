package permissionModule;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShouldCheckBuscaUsuariosField {
	@Test
	//Teste 3
	public void shouldCheckBuscaUsuariosField() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();    //instancia o driver
		driver.manage().window().setSize(new Dimension(700, 1000));
		
		//Abre a aplicação e entra no módulo de permissões
		driver.get("http://200.129.168.9:21016/");
		driver.findElement(By.id("nome_user")).sendKeys("nucleo_dnaz");
		driver.findElement(By.id("outlined-pass")).sendKeys("qualquersenha");
		driver.findElement(By.id("outlined-pass")).sendKeys(Keys.ENTER);
		Thread.currentThread();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[2]/div/div[1]/div/span/button")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div/div/div/div[2]/div/div/ul/div[3]")).click();
		
		//Parte 1: usuário existente
		Thread.currentThread();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div/div/div/main/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/input")).sendKeys("nucleo_dnaz");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div/div/div/main/div/div/div/div/div/div/div[1]/div/div/div/div[2]/button")).click();
		Thread.currentThread();
		Thread.sleep(1000);
		String texto1 = driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div/div/div/main/div/div/div/div/div/div/div[1]/div[2]/span[1]")).getText();
		String texto2 = driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div/div/div/main/div/div/div/div/div/div/div[1]/div[2]/span[3]")).getText();
		assertEquals("Funcionário:", texto1);
		assertEquals("Cod. Usuário:", texto2);
		
		//Parte 2: Usuário Não Existente
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div/div/div/main/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/input")).clear();
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div/div/div/main/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/input")).sendKeys("usuario nao existente");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div/div/div/main/div/div/div/div/div/div/div[1]/div/div/div/div[2]/button")).click();
		Thread.currentThread();
		Thread.sleep(1000);
		assertEquals("Usuário não encontrado", driver.findElement(By.id("client-snackbar")).getText());
	}
}
