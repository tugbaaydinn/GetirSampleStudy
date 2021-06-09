package com.tugbaaydin.Getir.pageModel.android;

import com.tugbaaydin.Getir.pageModel.contracts.ICategoryDetailPage;
import com.tugbaaydin.Getir.util.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class CategoryDetailPage extends Utility implements ICategoryDetailPage {
    protected final By cvProduct = By.id("cardview");
   protected final By btnHeart = By.id("ic_wishlist");
    protected final By btnAdd = By.id("text_action_bottom1");
    protected final By btnBasket = By.id("action_cart");
    private static Random random = new Random();

    @Override
    public void clickRandomProduct() {
        waitElementVisibility(cvProduct);
        List<WebElement> cvProductList = findElements(cvProduct);
        int randomProductNumber = random.nextInt(cvProductList.size());
        clickElement(cvProductList.get(randomProductNumber));
    }

    @Override
    public void clickHeart() {
        waitElementVisibility(btnHeart);
        List<WebElement> cvHeartList = findElements(btnHeart);
        for(int i=0; i<3; i++){
            int randomHeartNumber= random.nextInt(cvHeartList.size());
            if(!cvHeartList.get(randomHeartNumber).isDisplayed()){
                swipe(driver, Direction.BOTTOMTOP, Duration.ofMillis(3000));
                forceWait(5);
            }
            clickElement(cvHeartList.get(randomHeartNumber));
        }
    }


    @Override
    public void clickAdd() {
        clickElement(btnAdd);
    }

    @Override
    public void clickBasketButton() {
        clickElement(btnBasket);
    }

    @Override
    public void clickBack() {
        driver.navigate().back();
        forceWait(3);
    }
}
