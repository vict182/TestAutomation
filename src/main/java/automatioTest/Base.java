package automatioTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Base {
	
	public static void goToMainPage(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get("https://www.despegar.com.ar/");
	}
	public static WebDriver iniciarDriver(String browserName) {
		WebDriver driver = null;
		switch(browserName) { 
		case "CHROME":
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\usuario\\Desktop\\TESTING AUTOMATI/chromedriver.exe");
			Reporter.log("Abrir el Navegador Chrome");
			driver = new ChromeDriver();
			break;
     }
		case "FIREFOX":
		{
			System.setProperty("webdriver.firefox.driver", "C:\\Program Files (x86)\\Mozilla Firefox");
			Reporter.log("Abrir el Navegador Firefox");
			driver = new FirefoxDriver();
			break;
        }
		case "EDGE":
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\usuario\\Desktop\\TESTING AUTOMATI/msedgedriver.exe");
			Reporter.log("Abrir el Navegador EDGE");
			driver = new EdgeDriver();
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
		return driver;
	}
	public static void cerrarDriver (WebDriver driver) {
        driver.quit();
    }
}