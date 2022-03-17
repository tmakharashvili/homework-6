package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class WishListPage {
    public SelenideElement
            SearchInput = $(byName("hint_q")),
            ChooseOptionButton = $(".ty-grid-list__image"),
            SearchButton = $(".ty-search-magnifier"),
            WishListButton = $("#button_wishlist_60885"),
            GoToWishlistButton = $(".ty-wishlist__a"),
            RemoveFromWishListButton = $(".ty-twishlist-item__remove"),
            WishlistBox = $(byXpath("//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div/div/div/div/div[1]/div[1]/div"));
}
