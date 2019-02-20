package com.discoveryeducation;

import Pages.CommonPage;
import Pages.Dashboard;
import Pages.ProfilePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class StepDef extends DriverManager {
    CommonPage cp = new CommonPage();
    ProfilePage pf = new ProfilePage();
    Dashboard dp = new Dashboard();

    Utils utils = new Utils();
    String newRandom;
    private static String tokenaccount;
    private static String folderaccount;

    public String randomMethod()
    {
        Random random = new Random();
        return random.nextInt()+"fdfdfdf";
    }

    @Given("^User is in workspace$")
    public void user_is_in_workspace() {
//        driver.navigate().to(url);
//        utils.waitForSomeTime();
        cp.workSpacePage();

    }

    @When("^User click the SKIP button to skip the profile$")
    public void user_click_the_SKIP_button_to_skip_the_profile() {
//        driver.findElement(By.xpath("//button[@class='skip-btn']")).click();
//        utils.waitForSomeTime();
//        driver.findElement(By.cssSelector("svg.wkspace-menu-icon")).click();
        pf.skipProfileEnterWorkspace();

    }

    @When("^User click the Explore our resources and Dashboard link$")
    public void user_click_the_Explore_our_resources_and_Dashboard_link() {

//        driver.findElement(By.xpath("/html[1]/body[1]/wkspace-root[1]/wkspace-top-nav[1]/wkspace-menu-body[1]/div[1]/tabs[1]/tab[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]")).click();
//        utils.waitForLongTime();
        dp.expLnkDashboard();
        utils.waitForLongTime();

    }

    @When("^User click the Token Login link$")
    public void user_click_the_Token_Login_link() {

//        driver.findElement(By.linkText("Token login")).click();
        dp.loginLnk();
    }

    @When("^User enter Token login id$")
    public void user_enter_Token_login_id() {
//        driver.findElement(By.name("token")).clear();
//        tokenaccount = random();
//        driver.findElement(By.name("token")).sendKeys("fKQnwnxDJa*RKa*");
//        driver.findElement(By.name("token")).sendKeys(tokenaccount);
//        newRandom = randomMethod();
//        driver.findElement(By.name("token")).sendKeys(newRandom);
        dp.enterTokenID();

    }

    @When("^User click the Submit button$")
    public void user_click_the_Submit_button() {

//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")).click();
//        utils.waitForSomeTime();
        dp.clickSubmit();
    }

    @Then("^User enter in to workspace with Log out button$")
    public void user_enter_in_to_workspace_with_Log_out_button() {

        Assert.assertTrue(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Logga ut'])[1]/following::button[1]")).isDisplayed());

    }

    @When("^User click the Search text box and enter search term with typo error$")
    public void user_click_the_Search_text_box_and_enter_search_term_with_typo_error() {

       // driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
//        utils.waitForSomeTime();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Start searching to find resources for your lessons'])[1]/following::input[1]")).clear();
        utils.waitForSomeTime();
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("addotion");

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

    @When("^User click the Explore our resources and Home link$")
    public void user_click_the_Explore_our_resources_and_Home_link() {

        driver.findElement(By.xpath("/html[1]/body[1]/wkspace-root[1]/wkspace-top-nav[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
        utils.waitForSomeTime();
        driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
        utils.waitForSomeTime();

    }

    @When("^User click the Search text box and enter search term 'Fractions'$")
    public void user_click_the_Search_text_box_and_enter_search_term_Fractions() {

        //driver.findElement(By.xpath("//div[@id='home']/wkspace-search/div/div/form/wkspace-comet-select/div/select")).click();
        //Select curr_obj = new Select(curriculum);
//        Curriculum = driver.findElement(By.xpath("/html[1]/body[1]/wkspace-root[1]/wkspace-content-container[1]/wkspace-results[1]/div[1]/wkspace-search[1]/div[1]/wkspace-search-filter[1]/div[1]/div[1]/div[1]/wkspace-select-input[1]/div[1]/select[1]"));
//        Select curr_obj = new Select(Curriculum);
//        curr_obj.selectByValue("curriculum");
//        utils.waitForLongTime();
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Fractions");


    }

    @When("^User select the Curriculum Objective in the drop down$")
    public void user_select_the_Curriculum_Objective_in_the_drop_down() {

        driver.findElement(By.cssSelector("#search-by-curriculum")).click();
        utils.waitForSomeTime();

    }

    @Then("^User can see the Curriculum search page$")
    public void user_can_see_the_Curriculum_search_page() {

        Assert.assertTrue(driver.findElement(By.cssSelector("wkspace-content-container.curriculum-search:nth-child(3) wkspace-curriculum-search:nth-child(2) div.curriculum-search-wrapper header:nth-child(1) > h2:nth-child(1)")).isDisplayed());

    }

    @When("^User click the Create a token account button and enter username and submit$")
    public void user_click_the_Create_a_token_account_button_and_enter_username_and_submit() {

        driver.findElement(By.xpath("/html[1]/body[1]/wkspace-root[1]/wkspace-content-container[1]/wkspace-dashboard[1]/div[1]/div[1]/div[1]/button[1]")).click();
        utils.waitForSomeTime();
        tokenaccount = random();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(tokenaccount);
        utils.waitForSomeTime();
        System.out.println("The token ID is :" +tokenaccount);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        utils.waitForSomeTime();

    }

    @Then("^User can see the Flash message shows account created$")
    public void user_can_see_the_Flash_message_shows_account_created() {

        Assert.assertTrue(driver.findElement(By.xpath("//i[text()='Your user token: ']")).isDisplayed());
        utils.waitForSomeTime();

    }

    @When("^User click the Workspace to create a Folder or LP$")
    public void user_click_the_Workspace_to_create_a_Folder_or_LP() {

        driver.findElement(By.xpath("/html[1]/body[1]/wkspace-root[1]/wkspace-top-nav[1]/div[1]/ul[1]/li[4]/a[1]/span[1]")).click();
        utils.waitForSomeTime();
        driver.findElement(By.xpath("//div[text()='+ Create new folder']")).click();
        utils.waitForSomeTime();

    }

    @Then("^User enter Folder name or LP name and click create button$")
    public void user_enter_Folder_name_or_LP_name_and_click_create_button() {

        folderaccount = randomOne();
        driver.findElement(By.xpath("//input[@id='folder-name']")).sendKeys(folderaccount);
        utils.waitForSomeTime();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        utils.waitForSomeTime();

    }

    @Then("^User can see the Flash message shows Folder or LP created$")
    public void user_can_see_the_Flash_message_shows_Folder_or_LP_created() {

        Assert.assertTrue(driver.findElement(By.xpath("//button[text()=' Folder (1) ']")).isDisplayed());

    }

    @Then("^User can see the Folder or LP in the Workspace$")
    public void user_can_see_the_Folder_or_LP_in_the_Workspace() {

        Assert.assertTrue(driver.findElement(By.xpath("//div[@ng-reflect-klass='card-wrapper']")).isDisplayed());

    }

}
