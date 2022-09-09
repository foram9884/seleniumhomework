package selenium;

public class EdgeWebDriver {

        public static void main(String[] args){
                System.setProperty("webdriver.edge.driver","C:/Software/Driver/msedgedriver.exe");
                WebDriver driver = new EdgeDriver();

                driver.get("https://demo.nopcommerce.com/");

}



}






