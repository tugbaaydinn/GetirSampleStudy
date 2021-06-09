package com.tugbaaydin.Getir.tests;

import com.tugbaaydin.Getir.pageModel.android.BasketPage;
import com.tugbaaydin.Getir.pageModel.contracts.IBasketTestPage;
import com.tugbaaydin.Getir.util.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BasketTest extends Utility {
    public IBasketTestPage basketTest = new BasketPage();

    @And("Check added items on basket page")
    public void checkAddedItemsOnCartPage() { basketTest.checkCartItems(); }

    @Then("Remove added items on basket page")
    public void removeAddedItemsOnCartPage() {
        basketTest.removeCartItems();
    }

    @And("Check all items are removed from basket")
    public void checkAllItemsAreRemovedFromCart() {
        basketTest.checkAllItemsRemoved();
    }
}
