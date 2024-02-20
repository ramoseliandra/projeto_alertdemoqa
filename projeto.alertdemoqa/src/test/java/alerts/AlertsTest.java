package alerts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import driver.DriverFactory;
import elementos.Elementos;
import metodos.Metodos;
import runner.Executa;

public class AlertsTest extends DriverFactory {

	Elementos el = new Elementos();

	@BeforeEach
	public void abrirNavegador() {
		Executa.abrirNavegador();
	}

	@Test
	public void validarAlertButton() throws InterruptedException {

		Metodos.scroll(250);
		Metodos.esperar();
		Metodos.clicar(el.alertButton);
		Metodos.validarMsgAlert("You clicked a button");
		Metodos.fecharAlerta();
		Metodos.fecharNavegador();

	}

	@Test
	public void validarConfirm() throws InterruptedException {
		Thread.sleep(2000);
		Metodos.scroll(250);
		Metodos.clicar(el.confirmButton);
		Metodos.validarMsgAlert("Do you confirm action?");
		Metodos.fecharAlerta();
		Metodos.fecharNavegador();

	}

	@Test
	public void validarPromtButton() throws InterruptedException {
		Thread.sleep(2000);
		Metodos.scroll(250);
		Metodos.clicar(el.promtButton);
		Metodos.validarMsgAlert("Please enter your name");
		Metodos.fecharAlerta();
		Metodos.fecharNavegador();

	}

	@Test
	public void validarTimerButton() throws InterruptedException {
		Thread.sleep(2000);
		Metodos.esperar();
		Metodos.scroll(250);
		Metodos.esperar();
		Metodos.clicar(el.timerButton);
		Metodos.validarMsgAlert("This alert appeared after 5 seconds");
		Metodos.fecharAlerta();
		Metodos.fecharNavegador();

	}
}