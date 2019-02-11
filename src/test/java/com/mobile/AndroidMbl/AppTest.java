package com.mobile.AndroidMbl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppTest {

	
	public static AppiumDriver<MobileElement> driver;
	public static DesiredCapabilities cap;
	
	@Test
	public static void Android_LaunchAPp() throws MalformedURLException {
		
		cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus6T");
		cap.setCapability(MobileCapabilityType.UDID, "9feb187c");
		cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/App/OneplusMusic.apk");

		
		driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(600,TimeUnit.SECONDS);
		
		MobileElement NavigationDrawer = driver.findElement(ByAccessibilityId.id("Open navigation drawer"));
		NavigationDrawer.click();
	}
	
	@AfterClass
	public static void CloseApp() {
		driver.quit();
	}

}
