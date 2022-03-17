import StepObject.RegistrationSteps;
import Utils.Runner;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.RegistrationData.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class MainPage extends Runner {
    @Test (priority = 0)
    public void Registration() {
        RegistrationSteps steps = new RegistrationSteps();
        SoftAssert softAssert = new SoftAssert();
        steps
                .goToMyAccountPage()
                .goToRegistrationPage();
        softAssert.assertTrue(steps.UserIsOnRegistrationPage.isDisplayed());
        softAssert.assertAll();
        steps
                .fillFirstName(FirstNameValue)
                .fillLastName(LastNameValue)
                .fillIdentity(IdentityValue)
                .fillPhone(PhoneValue)
                .fillEmail(EmailValue)
                .fillPassword(PasswordValue)
                .fillPasswordConfirmation(ConfirmationPasswordValue);
        Assert.assertEquals(steps.FirstNameInput.getValue(), FirstNameValue);
        Assert.assertEquals(steps.IdentityInput.getValue(), IdentityValue);
        Assert.assertEquals(steps.PhoneInput.getValue(), PhoneValue);
        Assert.assertEquals(steps.EmailInput.getValue(), EmailValue);
        Assert.assertEquals(steps.PasswordInput.getValue(), PasswordValue);
        Assert.assertEquals(steps.PasswordConfirmationInput.getValue(), ConfirmationPasswordValue);
        steps.gotoRegister();
        sleep(5000);
    }
}
