package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchPurplle_Test {

	@Test
	public void Purplle() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	//String Url=System.getProperty("url");
	driver.get("https://www.purplle.com/");
	driver.quit();
	}
}

//"https://www.purplle.com/"