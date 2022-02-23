package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RemoveProductsPage;

public class RemoveProductsStepDefs {

    RemoveProductsPage removeProductsPage=new RemoveProductsPage();
    @Then("user clicks x button corresponding to particular product")
    public void user_clicks_x_button_corresponding_to_particular_product() {
        removeProductsPage.deleteButton.click();

    }
    @Then("verify that product is removed from the cart")
    public void verify_that_product_is_removed_from_the_cart() {
        Assert.assertTrue(removeProductsPage.cartEmptyText.isDisplayed());

    }
}


