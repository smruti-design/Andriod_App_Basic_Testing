
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AndriodTest {

	@Test
	public void launchAndriodTest() throws MalformedURLException, InterruptedException {
		UiAutomator2Options option = new UiAutomator2Options();
		option.setApp("C:\\Users\\smruti\\eclipse-workspace\\Projects\\Appium_Project\\app\\Android-MyDemoAppRN.1.3.0.build-244.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), option);
		Thread.sleep(10000);
		
		driver.findElement(AppiumBy.accessibilityId("open-menu")).click();
		
		//Alternate ways
		//driver.findElement(By.xpath("")); 
		
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(e -> e.findElement(AppiumBy.accessibilityId("menu item log in")));
		
		driver.findElement(AppiumBy.accessibilityId("menu item log in")).click();;
		driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys("xyz123");
		
		
		
	}
	
	public void clickOnCentreOfElement() throws MalformedURLException, InterruptedException {
		
		UiAutomator2Options option = new UiAutomator2Options();
		option.setApp("C:\\Users\\smruti\\eclipse-workspace\\Projects\\Appium_Project\\app\\Android-MyDemoAppRN.1.3.0.build-244.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), option);
		Thread.sleep(10000);
		
		WebElement menu = driver.findElement(AppiumBy.accessibilityId("open-menu"));
		
		Point p = menu.getLocation();
		Dimension d = menu.getSize();
		
		Point centre = getCentre(p, d);	
		
		
	}
	
	public Point getCentre(Point p, Dimension d) {
		return new Point(p.getX() + d.getWidth()/2, p.getY() + d.getHeight()/2);
	}
}
