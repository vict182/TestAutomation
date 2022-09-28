package Pages;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class Test_DespegarHome {
    private WebDriverWait wait;
	public WebDriver driver = null;
	
    
    @FindBy (css="i.shifu-icon-product.shifu-3-icon-hotels")
	WebElement clickAlojamiento;
	@FindBy(xpath = "//*[@class='sbox-places-destination--1xd0k']//input[@class='input-tag']")
	WebElement clickDestino;
	@FindBy(xpath = "//*[@class='sbox-places-destination--1xd0k']//input[@class='input-tag']")
    WebElement buscarDestino;
	@FindBy(xpath = "//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div/div/div[3]/div[2]/div/div[1]/div/div/div/div")
    WebElement clickIda;
	@FindBy(xpath = "//*[@id=\"component-modals\"]/div[4]/div[1]/div[2]/div[2]/div[3]/div[10]/div")
	WebElement clickIda1;
	@FindBy(xpath = "//*[@id=\"component-modals\"]/div[4]/div[1]/div[2]/div[1]/div[3]/div[30]/div") 
    WebElement clickVuelta1;
	@FindBy(xpath = "//*[@id=\"component-modals\"]/div[4]/div[2]/div[1]/button")
	WebElement clickAplicar1;
	@FindBy(xpath = "//*[@class='sbox5-3-double-input']//input[@class='sbox5-3-second-input']")
	WebElement clickHabitaciones;
	@FindBy(xpath = "//*[@id=\"component-modals\"]/div[5]/div/div/div[1]/div[2]/div[1]/div[2]/div/button[2]")
	WebElement clickAdulto;
	@FindBy(xpath = "//*[@id=\"component-modals\"]/div[5]/div/div/div[1]/div[2]/div[2]/div[2]/div/button[2]")
	WebElement clickNiño;
	@FindBy(css = "select[class='select']")
    WebElement edad;
	@FindBy(xpath = "//*[@id=\"component-modals\"]/div[5]/div/div/div[1]/div[2]/div[3]/div[2]/div")
	WebElement clickNiñoEdad;
	@FindBy(xpath = "//*[@id=\"component-modals\"]/div[5]/div/div/div[2]/a[1]")
	WebElement clickAplicar2;
	@FindBy(css = "*.sbox5-box-container button")
	WebElement clickBuscar;
	
	public Test_DespegarHome(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		PageFactory.initElements(driver, this);
		
   }
	 public void clickAlojamiento(){
      this.clickAlojamiento.click();
   }
	 public void menuOpciones(int number) {
	        List<WebElement> listaElemento = driver.findElements(By.xpath("//ul[@class='header-list-products']//li/a"));
	        for (int i = 0; i < listaElemento.size(); i++) {
	            WebElement icono;
	            switch (number){
	                case 1:
	                    icono = driver.findElement(By.xpath("//ul[@class='header-list-products']//li/a[1]"));
	                    icono.click();
	                    break;
	                case 2:
	                    icono = driver.findElement(By.xpath("//ul[@class='header-list-products']//li[2]"));
	                    icono.click();
	                    break;
	                default:
	                    System.out.println("ingrese un valor correcto");
	            }
	        }
	    }
	 public void buscarDestino(String providerLugares) throws InterruptedException {
	 wait.until(ExpectedConditions.visibilityOf(buscarDestino));
	 this.clickDestino.click();
	 Thread.sleep(2000); 
	 this.buscarDestino.sendKeys(providerLugares);
	 Thread.sleep(2000); 
	 this.buscarDestino.sendKeys(Keys.ENTER); 
	 }
	 
	 public void buscarDestino2(String providerLugares2) throws InterruptedException {
		 wait.until(ExpectedConditions.visibilityOf(buscarDestino));
		 this.clickDestino.click();
		 Thread.sleep(2000); 
		 this.buscarDestino.sendKeys(providerLugares2);
		 Thread.sleep(2000); 
		 this.buscarDestino.sendKeys(Keys.ENTER); 
		 }
	 
	 public void buscarFechas() throws InterruptedException{
	 this.clickIda.click();
	 Thread.sleep(2000);
	 this.clickIda1.click();
	 Thread.sleep(2000);
	 this.clickVuelta1.click();
	 Thread.sleep(2000);
	 this.clickAplicar1.click();
     } 
	 
	 public void buscarHabitaciones() throws InterruptedException{
		 int numero = 8;
		 Thread.sleep(2000);
		 this.clickHabitaciones.click();
		 Thread.sleep(2000);
		 this.clickAdulto.click();
		 Thread.sleep(2000);
		 this.clickNiño.click();
		 Thread.sleep(2000);
		 this.clickNiñoEdad.click();
		 Thread.sleep(2000);
	     Select edad = new Select(this.edad);
	     edad.selectByIndex(numero);
		 Thread.sleep(2000);
		 this.clickAplicar2.click();
		 Thread.sleep(2000);
     } 

	 public Test_DespegarHoteles clickBuscar() throws InterruptedException{
		 this.clickBuscar.click();
		 return new Test_DespegarHoteles(this.driver);
     } 
}