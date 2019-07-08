import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.SetUp;

public class SignInTest extends SetUp {

	@Test
	public void shouldThrowAnErrorIfSignInDetailsAreMissing() throws Exception {

		mysetUp();

		waitFor(2000);

		driver.findElement(By.linkText("Your trips")).click();
		driver.findElement(By.id("SignIn")).click();

		waitFor(10000);

		// driver.switchTo().frame(0);

		driver.switchTo()
				.frame(driver.findElement(By.xpath("//iframe[contains(@src,'//ui.cltpstatic.com/javascripts/accountsV2/signin.v881043.js')]")));

		/*
		 * WebDriverWait wait=new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInButton"
		 * )));
		 */

		// waitFor(5000);
		driver.findElement(By.id("signInButton")).click();

		String errors1 = driver.findElement(By.id("errors1")).getText();
		Assert.assertTrue(errors1.contains("There were errors in your submission"));
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
