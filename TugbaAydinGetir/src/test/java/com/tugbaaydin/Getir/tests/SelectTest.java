package com.tugbaaydin.Getir.tests;

import com.tugbaaydin.Getir.pageModel.android.SelectPage;
import com.tugbaaydin.Getir.pageModel.contracts.ISelectTestPage;
import com.tugbaaydin.Getir.util.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SelectTest extends Utility {

    public ISelectTestPage selectPage = new SelectPage();

    @And("Click search button")
    public void clickSearchButton() {
        selectPage.clickSearchButton();
    }

    @And("Click back button on search")
    public void clickBackButton() {
        selectPage.clickBackButton();
    }

    @Then("Check that it go to home page")
    public void checkBackHomePage() {
        selectPage.checkBackHomePage();
    }


}
