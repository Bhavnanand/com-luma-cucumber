package com.luma.cucumber.steps;

import com.luma.cucumber.pages.GearPage;
import com.luma.cucumber.pages.Homepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class gearPageSteps {
    @Given("I am  on homepage")
    public void iAmOnHomepage() {
    }
    @And("I  hover mouse on Gear Menu")
    public void iHoverMouseOnGearMenu() {
        new Homepage().mouseHoverOnGearMenu();
    }
    @And("I click on Bags")
    public void iClickOnBags() {
        new Homepage().ClickOnBags();
    }
    @And("I click on Product Name ‘Overnight Duffle")
    public void iClickOnProductNameOvernightDuffle() {
        new GearPage().clickonDuffle();
    }
    @And("I verify the text ‘Overnight Duffle’")
    public void iVerifyTheTextOvernightDuffle() {
        new GearPage().VerifyDuffle();
    }
    @And("I change Qty {int}")
    public void iChangeQty(int number) {
        new GearPage().changeQuantity("3");
    }
    @And("I click on ‘Add to Cart’ Button.")
    public void iClickOnAddToCartButton() {
        new GearPage().addToCart();
    }
    @And("I verify the text‘You added Overnight Duffle to your shopping cart.’")
    public void iVerifyTheTextYouAddedOvernightDuffleToYourShoppingCart() {
        new GearPage().verifyShopingcartLink();
    }
    @And("I click on ‘shopping cart’ Link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
    }
    @Then("I verify the product name ‘Cronus Yoga Pant’")
    public void iVerifyTheProductNameCronusYogaPant() {

    }
}
