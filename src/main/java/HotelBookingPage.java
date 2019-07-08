
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingPage {

	WebDriver driver;

	@FindBy(linkText = "Hotels")
	private WebElement hotelLink;

	@FindBy(id = "Tags")
	private WebElement localityTextBox;

	@FindBy(id = "SearchHotelsButton")
	private WebElement searchButton;

	@FindBy(id = "travellersOnhome")
	private WebElement travellerSelection;

	public HotelBookingPage(WebDriver driver) {

		this.driver = driver;

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
