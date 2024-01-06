

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AndriodTest {

	@Test
	public void launchAndriodTest() throws MalformedURLException, InterruptedException {
		UiAutomator2Options option = new UiAutomator2Options();
		option.setApp("C:\\Users\\smruti\\eclipse-workspace\\Projects\\Appium_Project\\app\\Android-MyDemoAppRN.1.3.0.build-244.apk");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), option);
		Thread.sleep(10000);
	}
}
