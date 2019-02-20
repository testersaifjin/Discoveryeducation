package Pages;

import com.discoveryeducation.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends DriverManager {

    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }


    @FindBy()
    private WebElement welcomePage;

    public void homePage()
    {

    }
}
