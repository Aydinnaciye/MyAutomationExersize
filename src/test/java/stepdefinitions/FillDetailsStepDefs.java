package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.FillDetailsPage;
import utilities.Driver;

public class FillDetailsStepDefs {
    FillDetailsPage fillDetailsPage = new FillDetailsPage();

    @When("user fills details")
    public void user_fills_details() {
        fillDetailsPage.genderBox.click();
        fillDetailsPage.passwordBox.sendKeys("123456");
        fillDetailsPage.passwordBox.sendKeys("Naci1234");
        Driver.selectByIndex(fillDetailsPage.dayDropdown, 4);
        Driver.selectByIndex(fillDetailsPage.monthDropdown, 3);
        Driver.selectByIndex(fillDetailsPage.yearDropdown, 27);
    }

    @When("user selects checkbox signup for our newsletter")
    public void user_selects_checkbox_signup_for_our_newsletter() {
    }

    @When("user selects checkbox receive special offers")
    public void user_selects_checkbox_receive_special_offers() {

        fillDetailsPage.specialOfferBox.click();
    }

    @When("user fills details2")
    public void user_fills_details2() {
        fillDetailsPage.firstNameBox.sendKeys("Naciye");
        fillDetailsPage.lastNameBox.sendKeys(Faker.instance().name().lastName());
        fillDetailsPage.companyBox.sendKeys("techpro");
        fillDetailsPage.addressBox.sendKeys(Faker.instance().address().fullAddress());
        Driver.selectByIndex(fillDetailsPage.countryDropdown, 1);
        fillDetailsPage.stateBox.sendKeys(Faker.instance().address().city());
        fillDetailsPage.zipcodeBox.sendKeys(Faker.instance().address().zipCode());
        fillDetailsPage.mobileNumberBox.sendKeys(Faker.instance().phoneNumber().cellPhone());

    }

    @When("user clicks create account button")
    public void user_clicks_create_account_button() {
        fillDetailsPage.createAccountButton.click();
    }

    @Then("user verifies that account is created")
    public void user_verifies_that_account_is_created() {
        Assert.assertTrue(fillDetailsPage.accountCreatedText.isDisplayed());
    }

}