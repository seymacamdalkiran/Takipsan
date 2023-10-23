package com.takipsan.stepDefs;

import com.takipsan.pages.TakipsanPage;
import com.takipsan.utilities.ConfigurationReader;
import com.takipsan.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Takipsan {
    TakipsanPage takipsanPage=new TakipsanPage();
    String head;
    @Given("The user should be on the home page")
    public void the_user_should_be_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @Given("The user should be on the {string} module")
    public void the_user_should_be_on_the_module(String module) {
        takipsanPage.navigateToModule(module);
    }
    @When("The user should be on the {string} tab")
    public void the_user_should_be_on_the_tab(String tab) {
        takipsanPage.navigateToTab(tab);
        head=tab;
    }
    @Then("The user should verify page")
    public void the_user_should_verify_page() {
        Assert.assertTrue(head.contains(takipsanPage.headText.getText()));
    }
    @Then("The user should be able to read the explanations")
    public void the_user_should_be_able_to_read_the_explanations() {
        System.out.println(takipsanPage.kumasTakibiText.getText());
    }
    @Then("The user should click {string} button")
    public void the_user_should_click_button(String bizeUlasin) {
        takipsanPage.bizeUlasin.click();
    }
}
