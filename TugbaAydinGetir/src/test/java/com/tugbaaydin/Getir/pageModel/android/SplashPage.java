package com.tugbaaydin.Getir.pageModel.android;

import com.tugbaaydin.Getir.pageModel.contracts.ISplashPage;
import com.tugbaaydin.Getir.util.Utility;
import org.openqa.selenium.By;

public class SplashPage extends Utility implements ISplashPage {

    protected final By btnNext = By.id("btn_next");


    @Override
    public void checkSplashPageElements() {
        forceWait(5);
        isElementDisplayed(btnNext);
    }
    @Override
    public void clickSplashNextButton() {
        clickElement(btnNext);
    }
}
