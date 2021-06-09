package com.tugbaaydin.Getir.tests;

import com.tugbaaydin.Getir.pageModel.android.CategoryDetailPage;
import com.tugbaaydin.Getir.pageModel.contracts.ICategoryDetailPage;
import com.tugbaaydin.Getir.util.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CategoryDetailTest extends Utility {
    public ICategoryDetailPage categoryDetailPage = new CategoryDetailPage();

    @Then("Click open a random product detail")
    public void clickAddOnRandomItem() {
        categoryDetailPage.clickRandomProduct();
    }
    @And("Click heart icon a random 3 items")
    public void clickHeart() {
        categoryDetailPage.clickHeart(); }

    @Then("Click add item")
    public void clickCartButton() {
        categoryDetailPage.clickAdd();
    }


    @And("Click back button on category")
    public void clickBackButtonOnCategory() {
        categoryDetailPage.clickBack();
    }

    @Then("Click basket button")
    public void clickBasketButton() {
        categoryDetailPage.clickBasketButton();
    }

}