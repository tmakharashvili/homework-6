import StepObject.AuthorizationSteps;
import Utils.Runner;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.RegistrationData.EmailValue;
import static DataObject.RegistrationData.PasswordValue;

public class Login extends Runner {
    @Test(priority = 1)
    public void Authorization() {
        AuthorizationSteps steps = new AuthorizationSteps();
        steps
                .goToMyAccountPage()
                .goToAuthorizationPage()
                .fillLoginEmail(EmailValue)
                .fillLoginPassword(PasswordValue)
                .clickToRememberMe()
                .goToGettingAuthorizedPage();
    }
}

