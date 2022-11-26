package SlimstockTask.tests;

import SlimstockTask.pages.BeforeAndAfter;
import SlimstockTask.pages.SlimstockPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SlimstockPageTest extends BeforeAndAfter {
    @Test
    public void ChangeLocation(){
        driver.get("https://www.slimstock.com");
        SlimstockPage deneme = new SlimstockPage(driver);

        deneme.ChangeLocation();

        String turkeyPage = driver.getCurrentUrl();
        Assert.assertEquals(turkeyPage, "https://www.slimstock.com/tr/");
    }
    @Test
    public void DropDown(){
        driver.get("https://www.slimstock.com/tr/");
        SlimstockPage deneme = new SlimstockPage(driver);
        deneme.DropDownMenu(driver);
    }
}
