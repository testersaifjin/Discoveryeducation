package Pages;

import com.discoveryeducation.DriverManager;
import com.discoveryeducation.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends DriverManager {
    Utils utils = new Utils();

    public Dashboard()
    {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")
    private WebElement submitBtn;
    @FindBy (name = "token")
    private WebElement tokenInput;
    @FindBy(linkText = "Token login")
    private WebElement dbLoginLnk;
    @FindBy(xpath = "/html[1]/body[1]/wkspace-root[1]/wkspace-top-nav[1]/wkspace-menu-body[1]/div[1]/tabs[1]/tab[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]")
    private WebElement dashboardLnk;

    public void expLnkDashboard()
    {
        dashboardLnk.click();

    }

    public void loginLnk()
    {
        dbLoginLnk.click();
    }

    public void enterTokenID()
    {
        tokenInput.sendKeys("fKQnwnxDJa*RKa*");

    }

    public void clickSubmit()
    {
        submitBtn.click();
        utils.waitForSomeTime();

    }
}
