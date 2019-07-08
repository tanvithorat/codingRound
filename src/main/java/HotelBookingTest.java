import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.SetUp;

public class HotelBookingTest extends SetUp {

	@BeforeTest
	public void setUp() throws IOException {

		//To Launch browser
		mysetUp();
		waitFor(2000);

	}

	@Test
	public void shouldBeAbleToSearchForHotels() throws IOException {

		//creating object of HotelBookingPage class
		HotelBookingPage obj = new HotelBookingPage(driver);

		//click on Hotels link
		obj.clickOnHotelsLink();

		//To select Locality
		obj.selectLocality();

		//to search
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
