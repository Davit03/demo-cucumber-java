package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.SignInPage;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();


    @Then("Input login")
    public void inputLogin() {
        signInPage.typeInEmailField(UserConfig.USER_LOGIN);
    }
    @Then("Input password")
    public void inputPassword() {
        signInPage.typeInPasswordField(UserConfig.USER_PASSWORD);
    }

    @Then("Click Sign in button two")
    public void clickSignInButtonTwo() {
        signInPage.clickOnSignInButton();

    }
}
