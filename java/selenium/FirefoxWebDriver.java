package selenium;

import java.sql.Driver;

public class FirefoxWebDriver {
    public static void main(String[] args) {

        System.setProperty("webdrier.gecko.driver","c:/software/Driver/geckodriver.exe");
        WebDriver driver = new FirefoxWebDriver();
        Driver.get ("http:/demo.nopcommerce.com/");



    }
}
