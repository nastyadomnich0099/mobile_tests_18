package drivers;



import com.codeborne.selenide.WebDriverProvider;
import config.CredConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackMobileDrivers implements WebDriverProvider{
    @Override
    public WebDriver createDriver(Capabilities capabilities) {

//        CredConfig config = ConfigFactory.create(CredConfig.class, System.getProperties());
//        String login = config.login();
//        String password = config.password();
//        String app = config.app();


        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);
        mutableCapabilities.setCapability("browserstack.user", "dopik_n0Isgm");
        mutableCapabilities.setCapability("browserstack.key", "ahiaWEYwHmYJWdAWFDBr");
        mutableCapabilities.setCapability("app","bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
        mutableCapabilities.setCapability("device", "Samsung Galaxy S22");
        mutableCapabilities.setCapability("os_version", "12.0");
        mutableCapabilities.setCapability("project", "First Java Project");
        mutableCapabilities.setCapability("build", "browserstack-build-1");
        mutableCapabilities.setCapability("name", "first_test");

        return new RemoteWebDriver(getBrowserstackUrl(), mutableCapabilities);


    }

    public static URL getBrowserstackUrl() {
        try {
            return new URL("http://hub.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
