package MeuPacote;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testandoGameOn {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador () {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testeangular() {
		driver.get("http://localhost:4200/");
		driver.findElement(By.id("login")).sendKeys(Keys.RETURN);
		driver.findElement(By.id("email")).sendKeys("joao@email.com");
		driver.findElement(By.id("senha")).sendKeys("senha123");
		driver.findElement(By.id("btn-enviar")).sendKeys(Keys.RETURN);
	}
	
}
