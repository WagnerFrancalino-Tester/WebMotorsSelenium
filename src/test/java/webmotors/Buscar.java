package webmotors;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import webmotors.page.BuscarPage;

public class Buscar {
	
	String url;
	WebDriver driver;
	WebDriverWait wait;
	
	BuscarPage buscarPage;
	
	@Before
	public void iniciar() {
		 buscarPage = new BuscarPage();
		// url = "https://www.webmotors.com.br/carros/estoque?tipoveiculo=carros&estadocidade=estoque";
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\franc\\webMotos\\webmotors\\drivers\\chromedriver.exe");
		// driver = new ChromeDriver();
		// driver.manage().window().maximize();
		// wait = new WebDriverWait(driver, 30);		
	}
	
	@After
	public void finilizar() {
	//	driver.quit();
	}

	// CENÁRIO 01
	@Dado("que eu esteja na pagina resultado de busca da Webmotors")
	public void que_eu_esteja_na_pagina_resultado_de_busca_da_webmotors() {
	  buscarPage.acessaSistema();
	}

	@Quando("seleciono uma marca")
	public void seleciono_uma_marca() {
		buscarPage.aceitarCookin();
		buscarPage.selecionarMarca();
	}						

	@Entao("o sistema lista os produtos relacionados")
	public void o_sistema_lista_os_produtos_relacionados() {
		 assertEquals(buscarPage.verificarBuscaTitulo(), "HONDA");
	}
	// CENÁRIO 02
	@Quando("seleciono uma marca e um modelo")
	public void seleciono_uma_marca_e_um_modelo() {	
		buscarPage.aceitarCookin();
		buscarPage.selecionarMarca();
		buscarPage.selecionarModelo();
	}

	@Entao("o sistema lista os produtos relacionados ao modelo")
	public void o_sistema_lista_os_produtos_relacionados_ao_modelo() {
		 assertEquals(buscarPage.VerificarTituloMarca(), "HONDA CITY");
	}
	// CENÁRIO 03
	@Quando("seleciono uma marca, modelo e versao")
	public void seleciono_uma_marca_modelo_e_versao() {
		buscarPage.aceitarCookin();
		buscarPage.selecionarMarca();
		buscarPage.selecionarModelo();
		buscarPage.selecionarVersao();	
	}

	@Entao("o sistema lista os produtos relacionados a versao")
	public void o_sistema_lista_os_produtos_relacionados_a_versao() {
		 assertEquals(buscarPage.VerificarTituloVesao(), "HONDA CITY 1.5 DX 16V FLEX 4P MANUAL");
	}
	
}
