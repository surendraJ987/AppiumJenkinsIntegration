package scripts;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Example1 {

	public static void main(String[] args) throws Exception {
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, System.getProperty("PlatformVersion"));
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, System.getProperty("PlatformName"));
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\Surendra\\Desktop\\APk Files\\ApiDemos.apk");
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, caps);
		Thread.sleep(5000l);
		
		
		driver.closeApp();
		driver.quit();
		
	
	}
	
}
