package pages.AdditionPage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestingApp {

    public AppiumDriver driver;
//    public TestingApp testingApp;





    By get_start = By.xpath("//android.widget.Button[@content-desc=\"Get Started\"]/android.view.ViewGroup\n");

    By home_button = By.xpath("//android.view.ViewGroup[@content-desc=\"active\"]/android.widget.TextView\n");
    By play_button = By.xpath("//android.view.ViewGroup[@content-desc=\"inactive\"])[1]/android.widget.TextView");
    By manu_button = By.xpath("//android.view.ViewGroup[@content-desc=\"inactive\"])[2]/android.widget.TextView");
    By Search_Bar = By.id("searchBtn");
    By settingsBtn = By.id("settingsBtn");
    By feedbackBtn = By.id("feedbackBtn");


    By text_box = By.id("603260030");
    By done_button = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button\n");
    By VIDEO_tap = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View\n");
    By notifi_button = By.xpath("//android.view.ViewGroup[@content-desc=\"English\"]/android.widget.TextView\n");

    By share = By.xpath("//android.widget.Button[@content-desc=\"شارك\"]/android.view.ViewGroup/android.widget.TextView[1]\n");
    By post_c = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView\n");
   By post = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView\n");
    public TestingApp(AppiumDriver driver) {
        this.driver = driver;
    }




    public WebElement get_start() {

        return driver.findElement(get_start);


    }

    public WebElement home_button_f() {

        return driver.findElement(home_button);


    }

    public WebElement play_button() {

        return driver.findElement(play_button);


    }

    public WebElement manu_button() {

        return driver.findElement(manu_button);


    }

    public WebElement Search_Bar() {

        return driver.findElement(Search_Bar);


    }

    public WebElement settingsBtn() {

        return driver.findElement(settingsBtn);


    }

    public WebElement feedbackBtn() {

        return driver.findElement(feedbackBtn);


    }

    public WebElement text_box() {

        return driver.findElement(text_box);


    }
    public WebElement done_button() {

        return driver.findElement(done_button);


    }
    public WebElement VIDEO_tap() {

        return driver.findElement(VIDEO_tap);


    }
    public WebElement notifi_button() {

        return driver.findElement(notifi_button);


    }
    public WebElement post() {

        return driver.findElement(post);


    }

    public WebElement share() {

        return driver.findElement(share);


    }
}
