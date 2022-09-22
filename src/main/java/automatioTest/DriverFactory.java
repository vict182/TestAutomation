package automatioTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;


public class DriverFactory {
	
	private enum browsers{
		CHROME		
	}
	public static WebDriver IniciarBrowser(String browsersName, String url) {
		WebDriver driver = null;
		switch(browsers.valueOf(browsersName)) {
		case CHROME:{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\usuario\\Desktop\\TESTING AUTOMATI/chromedriver.exe");
			Reporter.log("Abrir el Navegador");
			driver = new ChromeDriver();
			break;
}
		default:
		{
			Reporter.log("No se seleciono un navegador correcto, se abre Chrome por defecto");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\usuario\\Desktop\\TESTING AUTOMATI/chromedriver.exe");
			Reporter.log("Abrir el Navegador");
			driver = new ChromeDriver();
			break;
		}
}
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
	}
	
	public static void CloseBrowser(WebDriver driver) { 
		driver.quit();
	}
	
}