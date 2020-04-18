package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    public void typeInEmailField(String email) {
        $(By.cssSelector("#login_field")).setValue(email);
    }
    public void typeInPasswordField(String password) {
        $(By.cssSelector("#password")).setValue(password);
    }
    public void clickOnSignInButton() {
        $(By.cssSelector("#login > form > div.auth-form-body.mt-3 > input.btn.btn-primary.btn-block")).click();
    }

}
