import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.SetUp;

public class SignInTest extends SetUp {

	@BeforeTest
	public void setUp() throws IOException {

		//To Launch browser
		mysetUp();
		waitFor(2000);

	}

	@Test
	public void shouldThrowAnErrorIfSignInDetailsAreMissing() throws Exception {

		//creating object of SignInPage class
		SignInPage signInPage = new SignInPage(driver);

		//click on trips link
		signInPage.clickOnTripsLink();

		//click on signin link
		signInPage.clickOnSignInLink();

		//To switch to iFrame
		driver.switchTo().frame("modal_window");

		//Explicitly wait for element
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInButton")));

		//Click on Sign in Button
		signInPage.clickOnSignInButton();

		//Asserting error messages
		String errors1 = driver.findElement(signInPage.errorMsg).getText();
		Assert.assertTrue(errors1.contains("There were errors in your submission"));

	}

	@AfterTest
	public void teatDown() {

		// close the browser
		driver.quit();

	}

	private void waitFor(int durationInMilliSeconds) {
		try {
			Thread.sleep(durationInMilliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace(); // To change body of catch statement use File | Settings | File Templates.
		}
	}

}
