package metodos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import driver.DriverFactory;

public class Metodos extends DriverFactory {

	public static void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.out.println("Causa do erro" + e.getCause());
			System.out.println("Mensagem de erro" + e.getMessage());

		}

	}

	public static void fecharAlerta() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (Exception e) {
			System.out.println("Causa do erro" + e.getCause());
			System.out.println("Mensagem de erro" + e.getMessage());
		}

	}

	public static void esperar() {
		try {

			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		} catch (Exception e) {
			System.out.println("Causa do erro" + e.getCause());
			System.out.println("Mensagem de erro" + e.getMessage());

		}

	}

	public static void scroll(int tempo) {
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,250)", "");

		} catch (Exception e) {
			System.out.println("Causa do erro" + e.getCause());
			System.out.println("Mensagem de erro" + e.getMessage());

		}

	}

	public static void validarMsgAlert(String msgcapturada) {
		try {

			String alertText = driver.switchTo().alert().getText();
			assertTrue(alertText.contains(msgcapturada));
			System.out.println(alertText);

		} catch (Exception e) {
			System.out.println("Causa do erro" + e.getCause());
			System.out.println("Mensagem de erro" + e.getMessage());
		}
	}

	public static void fecharNavegador() {
		try {

			driver.quit();

		} catch (Exception e) {
			System.out.println("Causa do erro" + e.getCause());
			System.out.println("Mensagem de erro" + e.getMessage());
		}

	}

}
