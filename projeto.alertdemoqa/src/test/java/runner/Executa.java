package runner;

import org.openqa.selenium.chrome.ChromeDriver;

import driver.DriverFactory;

public class Executa extends DriverFactory {

	public static void abrirNavegador() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

	}
}
