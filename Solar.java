package com.example.appiumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class Solar {
    AndroidDriver<WebElement> driver;

    @BeforeMethod
    public void bm() throws IOException{
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot+"/apps");
        File app = new File(appDir.getCanonicalPath(), "todolist.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("apps", app.getAbsolutePath());
        capabilities.setCapability("noReset", false);//保留历史数据

        capabilities.setCapability("appPackage", "com.example.lx.solarfragment");
        capabilities.setCapability("appActivity", ".LoginActivity");

        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test
    public void TestOne() {
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"用户名\")").sendKeys("123345");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"密码\")").sendKeys("22233333");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\" 登  录 \")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"ONE\")").click();
        driver.currentActivity();
        System.out.println(11);
    }
@Test
    public void TestTwo() {
    driver.findElementByAndroidUIAutomator
            ("new UiSelector().text(\"用户名\")").sendKeys("123345");
    driver.findElementByAndroidUIAutomator
            ("new UiSelector().text(\"密码\")").sendKeys("22233333");
    driver.findElementByAndroidUIAutomator
            ("new UiSelector().text(\" 登  录 \")").click();
    driver.findElementByAndroidUIAutomator
            ("new UiSelector().text(\"TWO\")").click();
    driver.currentActivity();
    System.out.println(11);
}
    @Test
    public void TestSix() {
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"用户名\")").sendKeys("123345");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"密码\")").sendKeys("22233333");

        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\" 登  录 \")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"SIX\")").click();
        driver.currentActivity();
        System.out.println(11);
    }
    @Test
    public void GiveUp() {
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"用户名\")").sendKeys("123345");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"密码\")").sendKeys("22233333");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\" 登  录 \")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"SIX\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"GIVE UP\")").click();
        driver.currentActivity();
        System.out.println(11);
    }
    @Test
    public void Creatwork() {
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"用户名\")").sendKeys("123345");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"密码\")").sendKeys("22233333");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\" 登  录 \")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"任务\")").click();
        driver.findElement(By.id("jiahao")).click();
        driver.findElementByAndroidUIAutomator
               ("new UiSelector().text(\"请添加任务名称\")").sendKeys("ceshi");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"请添加数字时长\")").sendKeys("15");
        driver.findElement(By.id("finish")).click();
        driver.currentActivity();
        System.out.println(11);
    }
    @Test
    public void data() {
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"用户名\")").sendKeys("123345");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"密码\")").sendKeys("22233333");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\" 登  录 \")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"数据\")").click();
        driver.currentActivity();
        System.out.println(11);
    }
    @Test
    public void starwork() {
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"用户名\")").sendKeys("123345");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"密码\")").sendKeys("22233333");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\" 登  录 \")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"任务\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"33\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"开始\")").click();

    }
    @Test
    public void editwork() {
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"用户名\")").sendKeys("123345");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"密码\")").sendKeys("22233333");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\" 登  录 \")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"任务\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"33\")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"编辑\")").click();

    }
    @Test
    public void setup() {
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"用户名\")").sendKeys("123345");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"密码\")").sendKeys("22233333");
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\" 登  录 \")").click();
        driver.findElementByAndroidUIAutomator
                ("new UiSelector().text(\"任务\")").click();
        driver.findElement(By.id("setup")).click();
    }
}