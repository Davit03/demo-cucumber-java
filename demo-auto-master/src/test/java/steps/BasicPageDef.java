package steps;

import io.cucumber.java.en.Then;
import pages.BasicPage;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    @Then("Click Sign in button")
    public void clickSignInButton() {basicPage.clickOnSignInButton();
    }
}
