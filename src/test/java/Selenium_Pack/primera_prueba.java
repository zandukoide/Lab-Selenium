package Selenium_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class primera_prueba {
	public static void main (String[] args)throws InterruptedException {
		
	System.setProperty("webdriver.edge.driver","C:\\Users\\rober\\OneDrive\\Escritorio\\Mantenimiento\\Lab_Prueba_Selenium\\src\\test\\resources\\Edge\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.com/");
	//inserta tu código aquí
	Thread.sleep(5000);
	 driver.quit();
	}
}