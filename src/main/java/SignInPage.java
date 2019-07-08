
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.SetUp;

public class SignInPage extends SetUp {

	By tripsLink = By.linkText("Your trips");
	By signInLink = By.id("SignIn");
	By signInButton = By.id("signInButton");
	By errorMsg = By.id("errors1");

	WebDriver driver = null;
	WebDriverWait wait;

	public SignInPage(WebDriver driver) {

		this.driver = driver;
		wait = new WebDriverWait(driver, 8);
	}

	public void clickOnTripsLink() {
		driver.findElement(tripsLink).click();
	}

	public void clickOnSignInLink() {
		driver.findElement(signInLink).click();
	}

	public void clickOnSignInButton() {
		driver.findElement(signInButton).click();
	}

}
