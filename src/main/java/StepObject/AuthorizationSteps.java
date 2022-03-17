package StepObject;

import PageObject.AuthorizationPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.w3c.dom.html.HTMLInputElement;

import java.time.Duration;

public class AuthorizationSteps extends AuthorizationPage {
    public AuthorizationSteps goToMyAccountPage() {
        AccountButton.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    public AuthorizationSteps goToAuthorizationPage() {
        AuthorizationButton.click();
        return this;
    }
    public AuthorizationSteps fillLoginEmail(String EmailValue){
        LoginEmailInput.setValue(EmailValue);
        return this;
    }
    public AuthorizationSteps fillLoginPassword(String PasswordValue){
        LoginPasswordInput.setValue(PasswordValue);
        return this;
    }
    public AuthorizationSteps clickToRememberMe (){
        RememberButton.click();
        return this;
    }
    public AuthorizationSteps goToGettingAuthorizedPage (){
        GetAuthorizedButton.click();
        return this;
    }
}
