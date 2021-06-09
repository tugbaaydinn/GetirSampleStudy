package com.tugbaaydin.Getir.pageModel.android;

import com.tugbaaydin.Getir.pageModel.contracts.ISelectTestPage;
import com.tugbaaydin.Getir.util.Utility;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SelectPage extends Utility implements ISelectTestPage {

    protected final By btnSearch = By.id("action_search");
    protected final By btnBack = By.xpath("//android.widget.ImageButton[@content-desc=\"Collapse\"]");
    protected final By btnCheckHomePage = By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");

    @Override
    public void clickSearchButton() {
        clickElement(btnSearch);
    }

    @Override
    public void clickBackButton() {
        clickElement(btnBack);
    }
    @Override
    public void checkBackHomePage() {
        forceWait(3);
        Assert.assertEquals("This is not Home Page !", false, isElementDisplayed(btnCheckHomePage));
    }


}
