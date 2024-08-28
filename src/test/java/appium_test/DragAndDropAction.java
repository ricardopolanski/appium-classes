package appium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.Immutable;

import io.appium.java_client.AppiumBy;

public class DragAndDropAction extends BaseTest{

    @Test
    public void DragAndDropGesture() throws InterruptedException
    {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
        
        WebElement dragImage = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
        
        driver.executeScript("mobile: dragGesture", ImmutableMap.of(
            "elementId", ((RemoteWebElement) dragImage).getId(),
            "endX", 829,
            "endY", 755
            ));
        String result = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
            
        Assert.assertEquals(result, "Dropped!");
        Thread.sleep(2000);
    }
}
