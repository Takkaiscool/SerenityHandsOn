package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://www.imdb.com")
public class ImdbHomePage extends PageObject {

    @FindBy(id = "quicksearch")
    WebElementFacade quickSearchDropDown;

    @FindBy(id = "navbar-query")
    WebElementFacade searchTextBox;

    @FindBy(id = "navbar-submit-button")
    WebElementFacade searchButton;

    @FindBy(id = "navTitleMenu")
    WebElementFacade moviesTVShowtimesMenu;

    @FindBy(id = "imdb-signin-link")
    WebElementFacade otherLoginOptions;

    //@FindBy(xpath="//*[@id='navUserMenu']/p/a")
    @FindBy(id="nbusername")
    WebElementFacade loggedInUserNameLabel;

    public void select_tv_episodes_option() {
        quickSearchDropDown.click();
        quickSearchDropDown.selectByIndex(2);
    }

    public void enter_search_keyword(String keyword) {
        searchTextBox.type(keyword);
    }

    public void click_search_button() {
        searchButton.click();
    }

    public void select_movies_tv_showtimes(String option) {

        withAction().moveToElement(moviesTVShowtimesMenu).perform();
        $("//a[contains(text(),'" + option + "')]").waitUntilVisible().click();
    }

    public void click_other_sign_in_options() {
        otherLoginOptions.click();
    }

    public String read_logged_in_user_name()
    {
        return loggedInUserNameLabel.getText();
    }

    public void log_out_of_application()
    {
        withAction().moveToElement(loggedInUserNameLabel).perform();
        $("//li/a[@id='nblogout']").waitUntilVisible().click();
    }

}
