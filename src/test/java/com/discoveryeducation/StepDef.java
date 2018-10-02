package com.discoveryeducation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepDef extends DriverManager {
    Utils utils = new Utils();

    @Given("^User is in workspace$")
    public void user_is_in_workspace() {
        driver.navigate().to(url);
        utils.waitForSomeTime();

    }

    @When("^User click the SKIP button to skip the profile$")
    public void user_click_the_SKIP_button_to_skip_the_profile() {
        driver.findElement(By.xpath("//button[@class='skip-btn']")).click();
        utils.waitForSomeTime();
        driver.findElement(By.cssSelector("svg.wkspace-menu-icon")).click();

    }

    @When("^User click the Explore our resources and Dashboard link$")
    public void user_click_the_Explore_our_resources_and_Dashboard_link() {

        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='My content'])[1]/following::h5[1]")).click();

    }

    @When("^User click the Token Login link$")
    public void user_click_the_Token_Login_link() {

        driver.findElement(By.linkText("Token login")).click();

    }

    @When("^User enter Token login id$")
    public void user_enter_Token_login_id() {
        driver.findElement(By.name("token")).clear();
        driver.findElement(By.name("token")).sendKeys("fKQnwnxDJa*RKa*");

    }

    @When("^User click the Submit button$")
    public void user_click_the_Submit_button() {

        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")).click();
        utils.waitForSomeTime();
    }

    @Then("^User enter in to workspace with Log out button$")
    public void user_enter_in_to_workspace_with_Log_out_button() {

        Assert.assertTrue(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Logga ut'])[1]/following::button[1]")).isDisplayed());

    }

    @When("^User click the Search text box and enter search term with typo error$")
    public void user_click_the_Search_text_box_and_enter_search_term_with_typo_error() {

        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Welcome'])[1]/following::input[1]")).click();
        utils.waitForSomeTime();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Start searching to find resources for your lessons'])[1]/following::input[1]")).clear();
        utils.waitForSomeTime();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Start searching to find resources for your lessons'])[1]/following::input[1]")).sendKeys("addotion");

    }

    @When("^User click the Search button$")
    public void user_click_the_Search_button() {

        driver.findElement(By.cssSelector("button > svg")).click();
        utils.waitForSomeTime();

    }

    @Then("^User should get the warning message says 'did you mean'$")
    public void user_should_get_the_warning_message_says_did_you_mean() {

        Assert.assertTrue(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('Sorry, I couldn', \"'\", 't find anything for you 😞')])[1]/following::h4[1]")).isDisplayed());

    }
}
