package com.tugbaaydin.Getir.tests;

import com.tugbaaydin.Getir.logger.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private static AppiumDriver appiumDriver;
    private static final int DEFAULT_WAIT = 20;
    public static AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }
    public static int getDefaultWait() {
        return DEFAULT_WAIT;
    }

    @Before
    public void setUp(Scenario scenario) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        //caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5");
        caps.setCapability(MobileCapabilityType.VERSION, "8.0");
        caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.allandroidprojects.getirsample");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.allandroidprojects.getirsample.startup.SplashActivity");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 250);

        // Use this url for real device
        //URL url = new URL("http://localhost:4723/wd/hub");

        // Use this url for emulator
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        appiumDriver = new AndroidDriver(url, caps);
        appiumDriver.manage().timeouts().implicitlyWait(60l, TimeUnit.SECONDS);
        if (!scenario.isFailed()){
            System.out.println("Uygulama başlatıldı");
        } else{
            System.out.println("Uygulama başlatma başarısız !");
        }
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            File file = ((TakesScreenshot) appiumDriver).getScreenshotAs(OutputType.FILE);
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            File screenShotName = new File("src/test/resources/screenshots/screenshot" + "---" + scenario.getName() + "---" + timeStamp + ".png");
            try {
                FileUtils.copyFile(file, screenShotName);
            } catch (IOException e) {
                Log.info("Ekran görüntüsü alınamadı!");
            }
        }
        if (!scenario.isFailed()){
            System.out.println("Test Başarılı.");
        } else{
            System.out.println("Test Başarısız !");
        }
        appiumDriver.quit();
    }
}

