package automatioTest;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import Pages.Test_DespegarHome;
import Pages.Test_DespegarHoteles;
import Pages.Test_DespegarResultado;
import org.testng.ITestContext;

public class TestDespegarHome extends Base {
	WebDriver driver = null ;
	Test_DespegarHome Home = null ;
	@BeforeMethod (alwaysRun = true)
	  public void iniciarDriver(ITestContext context) {
	  String navegadorSuite = context.getCurrentXmlTest().getParameter("Navegador");
	  String navegador = navegadorSuite != null ? navegadorSuite : "CHROME";
	  driver = Base.iniciarDriver(navegador);
	  Base.goToMainPage(driver);
	  Home = new Test_DespegarHome(this.driver);
}
	@DataProvider(name="providerLugares")
	public Object [][] providerLugares(){
		return new Object[][] {{"Ushuaia, Tierra del Fuego, Argentina"},{"Berlín, Berlín, Alemania"}, {"Sarasota, Florida, Estados Unidos"}};
	}
	
	@DataProvider(name="providerLugares2")
	public Object [][] providerLugares2(){
		return new Object[][] {{"Aruba, Aruba"},{"La Belgica, Santa Cruz, Bolivia"}, {"Toronto, Ontario, Canadá"}};
	}
	
  @Test( groups = {"grupo1"}, dataProvider = "providerLugares", description = "Validar que aparece el logo de despegar.com cuando reservas un hotel")
 public void ValidarlogoDespegar(String providerLugares) throws Exception {
	 Home.menuOpciones(1); 
	 //Home.clickAlojamiento();
	 Home.buscarDestino(providerLugares);
	 Home.buscarFechas();
	 Home.buscarHabitaciones();
	 Test_DespegarHoteles Hoteles = Home.clickBuscar ();
	 Test_DespegarResultado Resultado = Hoteles.clickHotel();
	 Assert.assertTrue(Resultado.LogoVisible(), "El Logo de Despegar.com no es visible");
  }
	 
	 @Test( groups = {"grupo2"}, dataProvider = "providerLugares2", description = "Validar que aparece el logo de despegar.com cuando reservas un hotel")
	 public void ValidarlogoDespegar2(String providerLugares2) throws Exception {
		 Home.menuOpciones(1); 
		 //Home.clickAlojamiento();
		 Home.buscarDestino(providerLugares2);
		 Home.buscarFechas();
		 Home.buscarHabitaciones();
		 Test_DespegarHoteles Hoteles = Home.clickBuscar ();
		 Test_DespegarResultado Resultado = Hoteles.clickHotel();
		 Assert.assertTrue(Resultado.LogoVisible() , "El Logo de Despegar.com no es visible"); 
}  
	 
  @AfterMethod (alwaysRun = true)
  public void cerrarDriver () {
	  if(driver != null) {
       driver.close ();
   }
  }
}