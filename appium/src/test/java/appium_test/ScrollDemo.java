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

public class ScrollDemo extends BaseTest{

    @Test
    public void ScrollDemoTest() throws InterruptedException
    {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        // use that when you know which element you wanna scroll up to
        // driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));

        // use that when you do not know the element. usually used to scroll and check if the element exist.
        boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
            "left", 100, "top", 100, "width", 200, "height", 200,
            "direction", "down",
            "percent", 3.0
            ));

        Thread.sleep(2000);
    }

    // public static void main(String[] args) {
        
    // }
}
