package com.takipsan.pages;

import com.takipsan.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void navigateToModule(String module){
        Driver.get().findElement(By.xpath("//a[contains(text(),'"+module+"')]")).click();
    }
    public void navigateToTab(String tab){
        Driver.get().findElement(By.xpath("//a[contains(text(),'"+tab+"')]")).click();
    }

}
