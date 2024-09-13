package appium_test;

import io.appium.java_client.android.Activity;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.android.Activity;
// import io.appium.java_client.service.local.AppiumDriverLocalService;



// The below class must be initiated extending the BaseTest class if you wanna start the Appium Server and stop it every test running
// public class AppiumBasics extends BaseTest{
public class MiscellaniousAppiumAction {

    // To run automated test and use the Appium Selector at the same time, you must start 2 Appium Server instances
    // appium -p 4725

    @Test
    public void Miscellanious() throws MalformedURLException, URISyntaxException, InterruptedException
    {
        // The UiAutomator2Options and AndroidDriver must be declared in this class to use the existent Appium Server connection
        
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Polanski_Emulator");
        options.setApp("C:/Users/ercirci/Projects/Appium/appium/src/test/java/appium_test/resources/ApiDemos-debug.apk");
                
        AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), options);

        /*  get the current app page to test is directly without navigating step by step
         1- head to the page that will be tested
         2- Open the terminal and run 'adb shell dumpsys window | find "mCurrentFocus'"
            Return example:
            mCurrentFocus=Window{dcf0c4d u0 io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies}

            everything before the slash is the package name
            after the slash is the activity page
        */

        driver.executeScript("mobile: startActivity", ImmutableMap.of("intent","io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"));
        Thread.sleep(500);
       
    	driver.findElement(By.id("android:id/checkbox")).click();

        // Rotate device
        DeviceRotation landScape = new DeviceRotation(0, 0, 90);
        driver.rotate(landScape);
        Thread.sleep(500);
        
        driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[2])")).click(); 
        
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");

        // Copy and paste
        driver.setClipboardText("Ricardo Polanski");
        
        driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
   	    driver.findElement(By.id("android:id/button1")).click();

        // Interact with device buttons
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));
        

    }

    // public static void main(String[] args) {
        
    // }
}
