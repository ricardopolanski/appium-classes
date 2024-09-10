package appium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;

public class KnowledgeTest extends BaseTest{

    @Test
    public void KnowledgeClass() throws InterruptedException
    {
        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
        driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
        
        String headerTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(headerTitle, "Header title");

        

        driver.findElement(By.id("android:id/button1")).click();

        
        
        Thread.sleep(4000);
    }
}
