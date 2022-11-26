package SlimstockTask.tests;

import SlimstockTask.pages.GooglePage;
import SlimstockTask.pages.BeforeAndAfter;
import org.testng.annotations.Test;

public class MainTest extends BeforeAndAfter {
        @Test
        public void startUp() {
                driver.get("https://www.google.com");
                GooglePage deneme = new GooglePage(driver);
                deneme.SearchOnGoogle();

        }
}