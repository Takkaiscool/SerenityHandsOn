package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class ProgramDetailsPage extends PageObject {
    @FindBy(xpath = "//div[@class='credit_summary_item']")
    WebElementFacade creatorElement;


    public String read_director_name() {
        System.out.println(creatorElement.getText());
        return creatorElement.getText();
    }

}
