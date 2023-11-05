package pages.AdditionPage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestingApp {

    public AppiumDriver driver;
//    public TestingApp testingApp;





    By without_subscribtion = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.widget.ScrollView/android.view.View[3]/android.widget.Button\n");
    By google_cencel = By.id("com.google.android.gms:id/cancel");
    By not_now = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.widget.Button\n");
    By continue_button = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button\n");
    By today_button = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View\n");
    By play_button = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View\n");
    By section_button = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[4]/android.view.View\n");
    By for_you_button = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View\n");
    By search = By.id("Search");
    By profile = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.Button\n");
    By popup_cont=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.Button\n");

    By accout_page = By.id("com.nytimes.android:id/toolbar");


   public TestingApp(AppiumDriver driver) {
        this.driver = driver;
    }




    public WebElement without_subscribtion() {

        return driver.findElement(without_subscribtion);


    }

    public WebElement google_cencel() {

        return driver.findElement(google_cencel);


    }

    public WebElement play_button() {

        return driver.findElement(play_button);


    }

    public WebElement not_now() {

        return driver.findElement(not_now);


    }

    public WebElement continue_button() {

        return driver.findElement(continue_button);


    }

    public WebElement search() {

        return driver.findElement(search);


    }

    public WebElement today_button() {

        return driver.findElement(today_button);


    }

    public WebElement section_button() {

        return driver.findElement(section_button);


    }
    public WebElement for_you_button() {

        return driver.findElement(for_you_button);


    }
    public WebElement profile() {

        return driver.findElement(profile);


    }
    public WebElement accout_page() {

        return driver.findElement(accout_page);


    }
    public WebElement popup_cont() {

        return driver.findElement(popup_cont);


    }
}
