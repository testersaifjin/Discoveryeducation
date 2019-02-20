package Pages;

import com.discoveryeducation.DriverManager;
import com.discoveryeducation.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage extends DriverManager {

    Utils utils = new Utils();

    public CommonPage()
    {
        PageFactory.initElements(driver, this);
    }










    public void workSpacePage()
    {
        driver.navigate().to(url);
        utils.waitForSomeTime();

    }
}




