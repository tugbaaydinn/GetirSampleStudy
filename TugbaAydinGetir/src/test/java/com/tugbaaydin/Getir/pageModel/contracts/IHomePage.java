package com.tugbaaydin.Getir.pageModel.contracts;

import java.util.Random;

public interface IHomePage  {

    void checkHomePageElements();

    void clickCategory(String name) throws Exception;

    void clickRandomCategory() throws Exception;

    void clickLeftMenu();

    void GetCategorySize();


}
