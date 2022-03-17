package StepObject;

import PageObject.WishListPage;
import com.codeborne.selenide.Condition;

import static DataObject.WishListData.Option;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.files.DownloadActions.click;

public class WishListSteps extends WishListPage {
    public WishListSteps goToSearch (){
        SearchInput.setValue(Option);
        return this;
    }
    public WishListSteps searching () {
        SearchButton.pressEnter();
        return this;
    }
    public WishListSteps chooseOption () {
        ChooseOptionButton.click();
        return this;
    }
    public WishListSteps addToWishList () {
        WishListButton.click();
        sleep(5000);
        return this;
    }
    public WishListSteps goToWishList () {
        GoToWishlistButton.click();
        return this;
    }
    public WishListSteps removeFromWishList () {
        RemoveFromWishListButton.click();
        return this;
    }
    public WishListSteps wishListBox () {
        WishlistBox.click();
        return this;
    }
}
