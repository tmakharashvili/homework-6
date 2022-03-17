package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.commands.SetValue;

import java.time.Duration;

public class RegistrationSteps extends RegistrationPage {
    public RegistrationSteps goToMyAccountPage() {
        MyAccountButton.click();
        return this;
    }

    public RegistrationSteps goToRegistrationPage() {
        RegistrationButton.click();
        UserIsOnRegistrationPage.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }

    public RegistrationSteps fillFirstName(String FirstNameValue) {
        FirstNameInput.setValue(FirstNameValue);
        return this;
    }

    public RegistrationSteps fillLastName(String LastNameValue) {
        LastNameInput.setValue(LastNameValue);
        return this;
    }

    public RegistrationSteps fillIdentity(String IdentityValue) {
        IdentityInput.setValue(IdentityValue);
        return this;
    }
    public RegistrationSteps fillPhone(String PhoneValue) {
        PhoneInput.setValue(PhoneValue);
        return this;
    }
    public RegistrationSteps fillEmail(String EmailValue) {
        EmailInput.setValue(EmailValue);
        return this;
    }
    public RegistrationSteps fillPassword(String PasswordValue) {
        PasswordInput.setValue(PasswordValue);
        return this;
    }
    public RegistrationSteps fillPasswordConfirmation(String PasswordValue) {
        PasswordConfirmationInput.setValue(PasswordValue);
        return this;
    }
    public RegistrationSteps gotoRegister() {
        RegisterButton.click();
        return this;
    }
}