import StepObject.WishListSteps;
import Utils.Runner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class Favorites extends Runner {
    @Test
    public void myWishList (){
        WishListSteps steps = new WishListSteps();
        steps
                .goToSearch()
                .searching()
                .chooseOption()
                .addToWishList()
                .goToWishList()
                .removeFromWishList()
                .wishListBox();
    }
}
