package com.tugbaaydin.Getir.tests;

import com.tugbaaydin.Getir.pageModel.android.SplashPage;
import com.tugbaaydin.Getir.pageModel.contracts.ISplashPage;
import com.tugbaaydin.Getir.util.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class SplashTest extends Utility {

    public ISplashPage splashPage = new SplashPage();

    @Given("Check splash page elements")
    public void checkLoginPageElements() {
        splashPage.checkSplashPageElements();
    }

    @And("Click next on splash page")
    public void clickSplashNextButton() {
        splashPage.clickSplashNextButton();
    }
}
