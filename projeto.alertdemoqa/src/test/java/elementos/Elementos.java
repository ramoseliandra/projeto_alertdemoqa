package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By alertButton = By.id("alertButton");
	public By timerButton = By.id("timerAlertButton");
	public By confirmButton = By.id("confirmButton");
	public By promtButton = By.id("promtButton");

	public By msgAlert = By.xpath("//span[text()='Click Button to see alert ']");
	public By msgTimer = By.xpath("//span[text()='On button click, alert will appear after 5 seconds ']");
	public By msgConfirm = By.xpath("//span[text()='On button click, confirm box will appear']");
	public By msgPromt = By.xpath("//span[text()='On button click, prompt box will appear']");
}
