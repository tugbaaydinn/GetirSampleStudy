package com.tugbaaydin.Getir.tests;

import com.tugbaaydin.Getir.pageModel.android.HomePage;
import com.tugbaaydin.Getir.pageModel.contracts.IHomePage;
import com.tugbaaydin.Getir.util.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomeTest extends Utility {
    public IHomePage homePage = new HomePage();

    @Then("Check home page elements")
    public void checkHomePageElements() {
        homePage.checkHomePageElements();
    }

    @And("The category is changed {string}")
    public void clickCategory(String name) throws Exception {
        homePage.clickCategory(name); }

    @And("Click open left menu")
    public void clickLeftMenu() {
        homePage.clickLeftMenu(); }


    @Then("Click open a random category")
    public void clickAddOnRandomCategory() throws Exception {
        homePage.clickRandomCategory();
    }

    @Then("Get the number of categories and write this number console")
    public void GetCategorySize() {
        homePage.GetCategorySize();
    }



}
