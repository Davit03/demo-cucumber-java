package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

    public void clickOnSignInButton() {
        $(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]")).click();
    }

}
