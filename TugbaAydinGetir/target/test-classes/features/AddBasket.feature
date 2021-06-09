@AddBasket
Feature: AddBasket Test

  Background:
    Given Check splash page elements
    And Click next on splash page
    And Click next on splash page
    And Click next on splash page
    And Click next on splash page
    Then Check home page elements

  Scenario: Add item to basket and control
    And The category is changed "BABY CARE"
    Then Click open a random product detail
    And Click add item
    And Click back button on category
    And The category is changed "SNACKS"
    Then Click open a random product detail
    And Click add item
    And Click back button on category
    Then Click basket button
    And Check added items on basket page
    Then Remove added items on basket page
    And Check all items are removed from basket

  Scenario: Select items and control My Wishlist
    Given Get the number of categories and write this number console
    Then Click open a random category
    And Click heart icon a random 3 items
    And Click open left menu
    And Click open wishlist
    Then Check My WishList page and items
    And Click remove items
    And Check all items are removed from wishlist




  Scenario: Select search button bug1
    And Click search button
    And Click back button on search
    Then Check that it go to home page

  Scenario: Open to details and click to mywislist
    And The category is changed "SNACKS"
    Then Click open a random product detail
    And Click wishlist button
    And Click open left menu
    And Click open wishlist
    Then Check My WishList page and items



