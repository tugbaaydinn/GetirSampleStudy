package com.tugbaaydin.Getir.pageModel.android;

import com.tugbaaydin.Getir.pageModel.contracts.IHomePage;
import com.tugbaaydin.Getir.util.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HomePage extends Utility implements IHomePage {

    protected final By btnCart = By.id("action_cart");
    protected final By btnLeftMenu = By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");

    private Random random = new Random();
    private Map<String, String> categoryName = new HashMap<>();

    public HomePage() {
        categoryName.put("SNACKS", "//android.support.v7.app.ActionBar.Tab[@content-desc=\"Snacks\"]");
        categoryName.put("ELECTRONICS", "//android.support.v7.app.ActionBar.Tab[@content-desc=\"Electronics\"]");
        categoryName.put("WATER", "//android.support.v7.app.ActionBar.Tab[@content-desc=\"Water\"]" );
        categoryName.put("HOME CARE", "//android.support.v7.app.ActionBar.Tab[@content-desc=\"Home Care\"]");
        categoryName.put("BABY CARE", "//android.support.v7.app.ActionBar.Tab[@content-desc=\"Baby Care\"]" );
        categoryName.put("FRUITS & VEG", "//android.support.v7.app.ActionBar.Tab[@content-desc=\"Fruits & Veg\"]");
    }


    @Override
    public void checkHomePageElements() {
        isElementDisplayed(btnCart);
    }

    @Override
    public void clickCategory(String name) throws Exception {

        String productIndex = categoryName.get(name);
        if (!productIndex.isEmpty()) {
            swipe(driver, Direction.LEFTTORIGHT, Duration.ofMillis(3000));
            forceWait(5);
            if(name.equals("BABY CARE") || name.equals("FRUITS & VEG")){
                swipe(driver, Direction.RIGHTTOLEFT, Duration.ofMillis(3000));
            }
            WebElement product = findElementByXpPath(productIndex);
            clickElement(product);
        } else {
            throw new Exception("Ürün bulunamadı");
        }

    }

    @Override
    public void clickRandomCategory() throws Exception {

        String[] categoryList = {"SNACKS","ELECTRONICS", "WATER", "HOME CARE", "BABY CARE", "FRUITS & VEG"};
        int randomElement = random.nextInt(categoryList.length);
        String category = categoryList[randomElement];
        clickCategory(category);
    }

    @Override
    public void clickLeftMenu() {

        clickElement(btnLeftMenu);
    }

    @Override
    public void GetCategorySize() {

        System.out.println("Kategori sayısı: " + categoryName.size());

    }

}

