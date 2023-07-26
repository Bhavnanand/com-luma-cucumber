package com.luma.cucumber.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import com.luma.cucumber.utility.Utility;

import java.util.ArrayList;
import java.util.List;

public class WomenPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Women')]")
    WebElement Womenmenu;
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement TopMenu;
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement clickOnJacket;
    @CacheLookup
    @FindBy(xpath ="(//select[@id='sorter'])[1])")
    WebElement filterProductName;
    @CacheLookup
    @FindBy(xpath ="//span[@class='price-wrapper ']//span")
    WebElement productNames;
//By Womenmenu =By.xpath("//span[contains(text(),'Women')]");
//By TopMenu= By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
//By clickOnJacket= By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
//By filterProductName =By.xpath("(//select[@id='sorter'])[1])");
//By filterPrice = By.xpath("//span[@class='price-wrapper ']//span");
//By productNames= By.xpath("//span[@class='price-wrapper ']//span");



public void hoverOnWomenMenuT() {
    mouseHoverToElement(Womenmenu);
}
public void mouseHovertoTop(){
    mouseHoverToElement(TopMenu);
}
public void mouseHovertotopandclickooonjacket(){
mouseHoverToElementAndClick(clickOnJacket);
}
public void  SelectbyFilterProductName(){
    selectByVisibleTextFromDropDown(filterProductName,"Jacket");
}

    public void selectbyFilterPrice () {
        selectByVisibleTextFromDropDown(filterProductName, "Price");
    }
    public  void isProductdisplayInAlphabetic(){}



       public void isProductPriceDispalyLowToHigh(){
        List<WebElement> jacketsPrice  = driver.findElements(By.xpath("/span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPrice) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "£")));

        }
    }
}




