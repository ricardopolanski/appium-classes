package appium_test;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class AppiumBasics {

    @Test
    public void AppiumTest() throws MalformedURLException, URISyntaxException
    {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Polanski_Emulator");
        options.setApp("C:/Users/ercirci/Projects/Appium/appium/src/test/java/appium_test/resources/ApiDemos-debug.apk");
        
        
        AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), options);

    }

    public static void main(String[] args) {
        
    }
}
