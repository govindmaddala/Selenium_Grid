package Selenium.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Firefox_1 {
	
	@Test
	public void getFirefox() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WIN10);
		dc.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.181.1:4444"), dc);
		driver.get("https://www.selenium.dev/documentation/grid/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
