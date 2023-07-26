package com.luma.cucumber.steps;

import com.luma.cucumber.pages.Homepage;
import com.luma.cucumber.pages.MenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class menPageSteps {
    @And("I  hover mouse on Gear Menur on Men Menu")
    public void iHoverMouseOnMenur() {
        new Homepage().mouseHoverOnMenMenu();
    }
    @And("I  hover mouse on  Bottoms")
    public void iHoverMouseOnBottoms() {
        new Homepage().mouseHoverOnBottom();
    }
    @And("I Click on Pants")
    public void iClickOnPants() {
        new Homepage().clickOnPant();
    }
    @And("I hover mouse on product name‘Cronus Yoga Pant’ and click on size{int}.")
    public void iHoverMouseOnProductNameCronusYogaPantAndClickOnSize(int arg0) {
        new MenPage().mouseHoverOnCronusYogaPantAndClickon32();
    }
    @And("I  Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.And I Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.")
    public void iMouseHoverOnHoverOnProductNameCronusYogaPantAndClickOnColourBlack() {
        new MenPage().mouseHoverOnCronusYogaPantClickOnBlackColour();
    }
    @And("IMouse Hover on product name‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.")
    public void imouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() {
        new MenPage().mouseHoverOnCPantAndClickAddToCart();
    }
    @And("I Verify the text‘You added Cronus Yoga Pant to your shopping cart.’")
    public void iVerifyTheTextYouAddedCronusYogaPantToYourShoppingCart() {
        new MenPage().verifyShoppingcartText();
    }
    @And("I Click on ‘shopping cart’ Link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
    }

    @Then("I Verify the text ‘Shopping Cart.’")
    public void iVerifyTheTextShoppingCart() {
    }
    @And("I Verify the product name ‘Cronus Yoga Pant’")
    public void iVerifyTheProductNameCronusYogaPant() {
        new MenPage().VerifyTheTextMessage();
    }

    @And("IVerify the product size ‘{int}’")
    public void iverifyTheProductSize(int arg0) {
    }

    @And("I Verify the product colour ‘Black’")
    public void iVerifyTheProductColourBlack() {
    }
}
