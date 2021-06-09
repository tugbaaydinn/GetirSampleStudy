package com.tugbaaydin.Getir.pageModel.android;

import com.tugbaaydin.Getir.pageModel.contracts.IBasketTestPage;
import com.tugbaaydin.Getir.util.Utility;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BasketPage extends Utility implements IBasketTestPage {

    protected final By rvItemCount = By.id("recyclerview");
    protected final By btnRemove = By.id("text_action1");
    protected final By txtAmount = By.id("text_action_bottom1");
    CategoryDetailPage categoriyDetailPage = new CategoryDetailPage();

    @Override
    public void checkCartItems() {

        forceWait(3);
        Assert.assertEquals("Added item is not in cart !", true, isElementDisplayed(rvItemCount));
    }


    @Override
    public void removeCartItems() {
        forceWait(2);
        for (int j = 2; j > 0; j--) {
            if (isElementVisible(btnRemove)) {
                clickElement(btnRemove);
            } else {
                break;
            }
        }
    }

    @Override
    public void checkAllItemsRemoved() {
        forceWait(3);
        Assert.assertEquals("Items are not removed!", false, isElementDisplayed(btnRemove));
        categoriyDetailPage.clickBack();


    }

}
