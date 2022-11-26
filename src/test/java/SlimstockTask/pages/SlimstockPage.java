package SlimstockTask.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SlimstockPage extends BeforeAndAfter {

    public SlimstockPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement allowCookies;

    @FindBy(xpath = "//*[@id=\"languageSelector\"]/div/div/form/select")
    public WebElement SelectMenuID2;

    @FindBy(xpath = "//*[@id=\"languageSelector\"]/div/div/form/button")
    public WebElement ClickID;

    @FindBy(className = "sub-menu")
    public WebElement popUpMenuClassID;


    public void ChangeLocation() {
        allowCookies.click();
        Select SelectMenuID = new Select(SelectMenuID2);
        SelectMenuID.selectByVisibleText("Turkey");
        ClickID.click();
    }
    public void DropDownMenu(WebDriver driver){
        allowCookies.click();

        WebElement solutions = driver.findElement(By.xpath("//*[@id=\"menu-item-154843\"]/a"));

        Actions hoverOnSolutions = new Actions(driver);
        hoverOnSolutions.moveToElement(solutions).perform();

        WebElement titleID = driver.findElement(By.id("menu-item-154890"));
        String title = titleID.getText();
        System.out.println(title);


        String popupMenuText = popUpMenuClassID.getText();
        Assert.assertTrue(popupMenuText.contains(title));
    }
}
