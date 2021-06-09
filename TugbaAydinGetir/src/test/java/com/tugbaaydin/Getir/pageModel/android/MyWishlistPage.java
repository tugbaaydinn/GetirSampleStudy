package com.tugbaaydin.Getir.pageModel.android;

import com.tugbaaydin.Getir.pageModel.contracts.IMyWishlistPage;
import com.tugbaaydin.Getir.util.Utility;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyWishlistPage extends Utility implements IMyWishlistPage {
    protected final By btnRemove = By.id("ic_wishlist");
    protected final By rvItemCount = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]");
    protected final By btnHeart = By.id("layout_action3");

    @Override
    public void clickMyWishlist() {

        List<WebElement> wishlist = driver.findElements(By.id("design_menu_item_text"));
        wishlist.get(8).click();

    }
    @Override
    public void checkMyWishlistItems() {

        forceWait(3);
        isElementDisplayed(rvItemCount);

    }

    @Override
    public void clickRemoveWishListItems() {
        forceWait(2);
        for (int j = 3; j > 0; j--) {
            if (isElementVisible(btnRemove)) {
                clickElement(btnRemove);
            } else {
                break;
            }
        }

    }

    @Override
    public void checkRemoveWishListItems() {
        forceWait(3);
        Assert.assertEquals("Items are not removed!", false, isElementDisplayed(btnRemove));
    }

    @Override
    public void clickWishListButton() {
        clickElement(btnHeart);
    }
}
