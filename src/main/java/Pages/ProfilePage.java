package Pages;

import com.discoveryeducation.DriverManager;
import com.discoveryeducation.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends DriverManager {
    Utils utils = new Utils();

    public ProfilePage()
    {
        PageFactory.initElements(driver, this);
    }




    @FindBy(css = "svg.wkspace-menu-icon")
    private WebElement workspaceLnk;
    @FindBy(xpath = "//button[@class='skip-btn']")
    private WebElement skipBtn;







    public void skipProfileEnterWorkspace()
    {
        skipBtn.click();
        utils.waitForSomeTime();
        workspaceLnk.click();
    }
}
