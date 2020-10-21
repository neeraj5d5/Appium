package Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	AppiumDriver<MobileElement> driver;
	//AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void setup() throws MalformedURLException {
		try {
		DesiredCapabilities caps=new DesiredCapabilities();
		
		caps.setCapability("platformName", "ANDROID");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		//caps.setCapability(MobileCapabilityType.DEVICE_NAME, "App");
		caps.setCapability(MobileCapabilityType.UDID, "49746197cf40");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "2000");
		//caps.setCapability("noReset", "true");
		caps.setCapability("autoGrantPermissions", "true");
		//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		caps.setCapability(MobileCapabilityType.APP, "C:\\Neeraj\\AffineLabs\\Appium\\app-debug (1).apk");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		driver=new AppiumDriver<MobileElement>(url ,caps);
		//driver=new AndroidDriver<AndroidElement>(url ,caps);
		 
		driver.wait(100);
		Thread.sleep(100);
		
		}catch (Exception e) {
		System.out.println("Cause is :"+e.getCause());
		System.out.println("Message  is :"+e.getMessage());
		e.printStackTrace();
		}
		
		
	}
	
	
	

}
