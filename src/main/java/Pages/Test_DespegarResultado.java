package Pages;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test_DespegarResultado {
	private WebDriverWait wait;
	public WebDriver driver = null;
	
	@FindBy(xpath = "/html/body/nav/div[1]/div/div/a")
	WebElement LogodeDespegar;
	
	public Test_DespegarResultado(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOf(LogodeDespegar));
   }
	public boolean LogoVisible() {
		 return this.LogodeDespegar.isDisplayed();
		 }
}