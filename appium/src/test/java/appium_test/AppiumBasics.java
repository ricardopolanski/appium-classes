package appium_test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AppiumBasics extends BaseTest{

    @Test
    public void AppiumTest()
    {
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
    	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\'3. Preference dependencies\']")).click(); 
    	driver.findElement(By.id("android:id/checkbox")).click();
   	    driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[2])")).click(); 
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");


        driver.findElement(By.id("android:id/edit")).sendKeys("Testing Testing");
   	    driver.findElement(By.id("android:id/button1")).click();
        // Getting the above element using className instead
        // driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
        

    }

    public static void main(String[] args) {
        
    }
}
