package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserPage {

    public void clickOnUserIcon() {
        $(By.cssSelector("body > div.position-relative.js-header-wrapper > header > div.Header-item.position-relative.mr-0.d-none.d-lg-flex")).click();
    }

    public String getUserName() {
       return  $(By.xpath("/html/body/div[1]/header/div[7]/details/details-menu/div[1]/a/strong")).getText();
    }

}
