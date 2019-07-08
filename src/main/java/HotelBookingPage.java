
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingPage {

	WebDriver driver;

	@FindBy(xpath = "//a[contains(@title,\"Find hotels in destinations around the world\")]")
	private WebElement hotelLink;

	@FindBy(id = "Tags")
	private WebElement localityTextBox;

	@FindBy(id = "SearchHotelsButton")
	private WebElement searchButton;

	@FindBy(id = "travellersOnhome")
	private WebElement travellerSelection;

	public HotelBookingPage(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}

	public void clickOnHotelsLink() {

		hotelLink.click();
	}

	public void selectLocality() {
		localityTextBox.sendKeys("Indiranagar, Bangalore");

	}

	public void clickOnSearch() {
		new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
		searchButton.click();

	}

}
