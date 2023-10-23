package com.takipsan.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TakipsanPage extends BasePage{

    @FindBy(xpath = "//h1[@class='wpb_heading wpb_singleimage_heading']")
    public WebElement headText;

    @FindBy(xpath = "//div[@class='wpb_text_column']//p")
    public WebElement kumasTakibiText;

    @FindBy(xpath = "//a[contains(text(),'Bize Ulaşın ')]")
    public WebElement bizeUlasin;
}
