package com.tugbaaydin.Getir.tests;

import com.tugbaaydin.Getir.pageModel.android.MyWishlistPage;
import com.tugbaaydin.Getir.pageModel.contracts.IMyWishlistPage;
import com.tugbaaydin.Getir.util.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MyWishlistTest extends Utility {

    public IMyWishlistPage myWishlistPage = new MyWishlistPage();

    @And("Click open wishlist")
    public void clickCategory()  { myWishlistPage.clickMyWishlist(); }

    @Then("Check My WishList page and items")
    public void checkMyWishlist()  { myWishlistPage.checkMyWishlistItems(); }

    @And("Click remove items")
    public void clickRemoveWishListItems()  { myWishlistPage.clickRemoveWishListItems(); }

    @And("Check all items are removed from wishlist")
    public void checkRemoveWishListItems()  { myWishlistPage.checkRemoveWishListItems(); }

    @And("Click wishlist button")
    public void clickWishListButton()  { myWishlistPage.clickWishListButton(); }

}
