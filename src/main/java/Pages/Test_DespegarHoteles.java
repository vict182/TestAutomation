package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_DespegarHoteles {
	public WebDriver driver = null;
	
	@FindBy(xpath = "//*[@id=\"slider_id_1\"]/swiper/div/div[1]/media-picture/div/div/img") 
	WebElement clickHotel;

	public Test_DespegarHoteles(WebDriver driver) {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
	}
		 public Test_DespegarResultado clickHotel() throws InterruptedException{
			 this.clickHotel.click();
			 return new Test_DespegarResultado(this.driver);
	}
}