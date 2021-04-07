package webmotors.page;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuscarPage {

	String url;
	WebDriver driver;
	WebDriverWait wait;

	public void acessaSistema() {
		 url = "https://www.webmotors.com.br/carros/estoque?tipoveiculo=carros&estadocidade=estoque";
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\franc\\webMotos\\webmotors\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 wait = new WebDriverWait(driver, 30);
		 driver.get(url);
	}

	public void aceitarCookin() {		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/button"))).click();	
	}
	
	public void selecionarMarca() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/div/div/a[4]/small"))).click();
	}

	public String verificarBuscaTitulo() {
		return driver.findElement(By.id("honda")).getText();	
	}

	public void selecionarModelo() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[2]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div/div[3]/div/div[5]/a[2]"))).click();
	}

	public String VerificarTituloMarca() {
		return driver.findElement(By.id("honda-city")).getText();	
	}

	public void selecionarVersao() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[3]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div/div[2]/div/div[4]/a[2]"))).click();
	}

	public String VerificarTituloVesao() {
		return driver.findElement(By.id("honda-city-1.5-dx-16v-flex-4p-manual")).getText();	
	}

}
