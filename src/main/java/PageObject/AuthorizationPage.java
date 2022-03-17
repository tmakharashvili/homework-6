package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage {
    public SelenideElement
    AccountButton = $("#sw_dropdown_268"),
    AuthorizationButton = $(byText("ავტორიზაცია")),
    RememberButton = $(byName("remember_me")),
    GetAuthorizedButton = $(byName("dispatch[auth.login]")),
    LoginEmailInput = $(byName("user_login")),
    LoginPasswordInput = $(byAttribute("name", "password"));
}
