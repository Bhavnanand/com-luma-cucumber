package com.luma.cucumber.steps;

import com.luma.cucumber.pages.WomenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class womenPageSteps {
    @Given("User is on homepage")
    public void userIsOnHomepage() {
    }

    @When("I Mouse Hover on Women Menu")
    public void iMouseHoverOnWomenMenu() {
        new WomenPage().hoverOnWomenMenuT();
    }
    @And("I Mouse Hover on Tops")
    public void iMouseHoverOnTops() {
        new WomenPage().mouseHovertoTop();
    }

    @And("IClick on Jackets")
    public void iclickOnJackets() {
        new WomenPage().mouseHovertotopandclickooonjacket();
    }

    @And("I Select Sort By filter “Product Name”")
    public void iSelectSortByFilterProductName() {
        new WomenPage().SelectbyFilterProductName();
    }
    @Then("IVerify the products name display in alphabetical order")
    public void iverifyTheProductsNameDisplayInAlphabeticalOrder() {
        new WomenPage().isProductdisplayInAlphabetic();
    }
    @And("I Click on Jackets")
    public void iClickOnJackets() {
        new WomenPage().mouseHovertotopandclickooonjacket();
    }
    @And("I Select Sort By filter “Price”")
    public void iSelectSortByFilterPrice() {
        new WomenPage().selectbyFilterPrice();
    }
    @Then("I Verify the products price display in Low to High")
    public void iVerifyTheProductsPriceDisplayInLowToHigh() {

    }
}
