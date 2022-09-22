package automatioTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Test_Despegar {

	@Test(description = "Validar que aparece el logo de despegar.com cuando reservas un hotel")
	
	public void ValidarLogo() throws Exception {  System.setProperty("webdriver.chrome.driver", "C:\\Users\\usuario\\Desktop\\TESTING AUTOMATI/chromedriver.exe"); 
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.despegar.com.ar/vuelos/");
	WebElement clickAlojamiento = driver.findElement(By.xpath("//i[@class=\"shifu-icon-product shifu-3-icon-hotels\"]")); clickAlojamiento.click();  
	WebElement clickDestino = driver.findElement(By.xpath("//input[@placeholder=\"Ingresá una ciudad, alojamiento o punto de interés\"]")); clickDestino.click(); Thread.sleep(2000);
	WebElement buscarDestino = driver.findElement(By.xpath("//input[@placeholder=\"Ingresá una ciudad, alojamiento o punto de interés\"]"));  buscarDestino.sendKeys("Cordoba"); Thread.sleep(2000); buscarDestino.sendKeys(Keys.ENTER); Thread.sleep(2000);
	WebElement clickIda = driver.findElement(By.xpath("//input[@placeholder=\"Entrada\"]")); clickIda.click(); Thread.sleep(2000);
	WebElement clickIda1 = driver.findElement(By.xpath("//*[@id=\"component-modals\"]/div[4]/div[1]/div[2]/div[2]/div[3]/div[1]/div")); clickIda1.click(); Thread.sleep(2000);
	WebElement clickVuelta1 = driver.findElement(By.xpath("//input[@placeholder=\"Salida\"]")); clickVuelta1.click(); Thread.sleep(2000);
	WebElement clickVuelta2 = driver.findElement(By.xpath("//*[@id=\"component-modals\"]/div[4]/div[1]/div[2]/div[1]/div[3]/div[21]/div")); clickVuelta2.click();Thread.sleep(2000);
	WebElement clickAplicar1 = driver.findElement(By.xpath("//button[@class=\"sbox5-3-btn -primary -md\"]")); clickAplicar1.click(); Thread.sleep(2000);
	WebElement clickHabitaciones = driver.findElement(By.xpath("//div[@class=\"sbox5-distributionPassengers sbox5-box-distributionPassengers-ovr\"]")); clickHabitaciones.click(); Thread.sleep(2000);
	WebElement clickAdulto = driver.findElement(By.xpath("//*[@id=\"component-modals\"]/div[5]/div/div/div[1]/div[2]/div[1]/div[2]/div/button[2]")); clickAdulto.click();Thread.sleep(2000);
	WebElement clickNiño = driver.findElement(By.xpath("//*[@id=\"component-modals\"]/div[5]/div/div/div[1]/div[2]/div[2]/div[2]/div/button[2]")); clickNiño.click();Thread.sleep(2000);
	WebElement clickNiñoEdad = driver.findElement(By.xpath("//*[@id=\"component-modals\"]/div[5]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/select")); clickNiñoEdad.click();Thread.sleep(2000);
	WebElement clickNiñoEdad8 = driver.findElement(By.xpath("//*[@id=\"component-modals\"]/div[5]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/select/option[10]")); clickNiñoEdad8.click();Thread.sleep(2000);
	WebElement clickAplicar2 = driver.findElement(By.xpath("//*[@id=\"component-modals\"]/div[5]/div/div/div[2]/a[1]")); clickAplicar2.click();Thread.sleep(2000); Thread.sleep(2000);
	WebElement clickBuscar = driver.findElement(By.xpath("//button[@class=\"sbox5-box-button-ovr sbox5-3-btn sbox5-button -secondary -icon -lg\"]")); clickBuscar.click(); Thread.sleep(2000);
	WebElement clickHotel = driver.findElement(By.xpath("//*[@id=\"slider_id_1\"]/swiper/div/div[1]/media-picture/div/div/img")); clickHotel.click(); Thread.sleep(2000);
	WebElement LogodeDespegar = driver.findElement(By.xpath("//*[@id=\"logo-color\"]"));  Assert.assertTrue(LogodeDespegar.isDisplayed()); Thread.sleep(2000);
	driver.quit();
	}
}
