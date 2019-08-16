package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends PageObject {
    @FindBy(xpath="//div/a[@class='list-group-item create-account ']")
    WebElementFacade createNewAccountButton;

    public void click_create_new_account()
    {
        createNewAccountButton.click();
    }
}
