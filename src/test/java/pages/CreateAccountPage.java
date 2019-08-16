package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends PageObject {
    @FindBy(id = "ap_customer_name")
    WebElementFacade yourNameTextBox;

    @FindBy(id = "ap_email")
    WebElementFacade emailTextBox;

    @FindBy(id = "ap_password")
    WebElementFacade passwordTextBox;

    @FindBy(id = "ap_password_check")
    WebElementFacade reEnterPasswordTextBox;

    @FindBy(id = "continue")
    WebElementFacade createAccountButton;

    public void enter_user_name(String userName) {
        yourNameTextBox.type(userName);
    }

    public void enter_email_address(String emailAddress) {
        emailTextBox.type(emailAddress);
    }

    public void enter_password(String password) {
        passwordTextBox.type(password);
    }

    public void re_enter_password(String password) {
        reEnterPasswordTextBox.type(password);
    }

    public void click_create_imdb_account_button() {
        createAccountButton.click();

    }
}
