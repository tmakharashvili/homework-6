package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement
        MyAccountButton = $("#sw_dropdown_268"),
        RegistrationButton = $(byText("რეგისტრაცია")),
        FirstNameInput = $("#elm_6"),
        LastNameInput = $("#elm_7"),
        IdentityInput = $("#elm_36"),
        PhoneInput = $("#elm_9"),
        EmailInput = $(byName("user_data[email]")),
        PasswordInput = $(byName("user_data[password1]")),
        PasswordConfirmationInput = $(byName("user_data[password2]")),
        RegisterButton = $(byName("dispatch[profiles.update]")),
        UserIsOnRegistrationPage = $(".ty-mainbox-title");

}
