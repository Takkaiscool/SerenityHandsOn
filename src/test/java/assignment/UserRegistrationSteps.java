package assignment;

import com.github.javafaker.Faker;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.CreateAccountSteps;

public class UserRegistrationSteps {
    Faker faker = new Faker();
    String password = faker.internet().password(8, 10);
    String fullName = faker.name().fullName();



    @Steps
    private CreateAccountSteps createAccountSteps;

    @When("^I click Other Sign in options$")
    public void iClickOtherSignInOptions() throws Throwable {
        createAccountSteps.clickOtherSignInOption();
    }

    @And("^I click Create a New Account$")
    public void iClickCreateANewAccout() throws Throwable {
        createAccountSteps.clickCreateNewAccountButton();
    }

    @And("^I enter name in First Name textbox$")
    public void iEnterNameInFirstNameTextbox() throws Throwable {
        createAccountSteps.enterUserName(fullName);
    }

    @And("^I enter email in Email textbox$")
    public void iEnterEmailInEmailTextbox() throws Throwable {
        createAccountSteps.enterEmailAddress(faker.internet().safeEmailAddress());
    }

    @And("^I enter Password in password textbox$")
    public void iEnterPasswordInPasswordTextbox() throws Throwable {
        System.out.printf("password is: " + password);
        createAccountSteps.enterPassword(password);
    }

    @And("^I enter password again in Re-enter password textbox$")
    public void iEnterPasswordAgainInReEnterPasswordTextbox() throws Throwable {
        createAccountSteps.reEnterPassword(password);
    }

    @And("^I click Create your IMDb account button$")
    public void iClickCreateYourIMDbAccountButton() throws Throwable {
        createAccountSteps.clickCreateYourAccountButton();
    }

    @Then("^I should get logged in to my account$")
    public void iShouldGetLoggedInToMyAccount() throws Throwable {
        createAccountSteps.verifyUserLoggedIn(fullName);
    }

    @And("^I log out of the application$")
    public void iLogOutOfTheApplication() throws Throwable {
        createAccountSteps.logOutOfApplication();
        System.out.println("Logged Out");
    }
}
