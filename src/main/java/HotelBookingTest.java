import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.SetUp;

public class HotelBookingTest extends SetUp {

	@BeforeTest
	public void setUp() throws IOException {

		mysetUp();

		waitFor(2000);

	}

	@Test
	public void shouldBeAbleToSearchForHotels() throws IOException {

		HotelBookingPage obj = new HotelBookingPage(driver);

		obj.clickOnHotelsLink();

		obj.selectLocality();

		obj.clickOnSearch();

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
