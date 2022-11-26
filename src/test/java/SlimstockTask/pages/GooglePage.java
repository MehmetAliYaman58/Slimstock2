package SlimstockTask.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GooglePage {
    @FindBy(className = "gLFyf")
    public WebElement googleSearchBarID;

    @FindBy(className = "LC20lb")
    public WebElement mainPageID;


    public GooglePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void SearchOnGoogle() {
        googleSearchBarID.sendKeys("Slimstock");
        googleSearchBarID.sendKeys(Keys.ENTER);
        String mainPage = mainPageID.getText();
        Assert.assertTrue(mainPage.contains("Slimstock - Envanter Yönetimi Ve Stok Optimizasyonu Programı"));
    }

}




