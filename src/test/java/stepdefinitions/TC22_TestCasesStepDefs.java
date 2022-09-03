package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TC22_TestCasesPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC22_TestCasesStepDefs {



    TC22_TestCasesPage tc22_testCasesPage = new TC22_TestCasesPage();

    @Given("user launches the browser for Test TwentyTwo")
    public void user_launches_the_browser_for_test_twenty_two() {
        Driver.getDriver();
    }
    @Then("user navigates to Test TwentyTwo URL")
    public void user_navigates_to_test_twenty_two_url() {
        Driver.getDriver().get(ConfigReader.getProperty("automation_exercise_url"));
        Driver.wait(2);
    }


    @Then("user scrolls to bottom of page")
    public void user_scrolls_to_bottom_of_page() {
        Driver.scrollDown();
        Driver.wait(2);
    }
    @Then("user verifies RECOMMENDED ITEMS are visible")
    public void user_verifies_recommended_items_are_visible() {
        Assert.assertTrue(tc22_testCasesPage.recommendedItems.isDisplayed());
        Assert.assertTrue(tc22_testCasesPage.recommendedItemsTitle.isDisplayed());

    }
    @Then("user clicks on Add To Cart on Recommended product")
    public void user_clicks_on_add_to_cart_on_recommended_product() {
       // ReusableMethods.clickElementByJS("arguments[0].click();", tc22_testCasesPage.recommendedItemAddToCartButton);
        tc22_testCasesPage.recommendedItemAddToCartButton.click();
    }
    @Then("user clicks on View Cart button")
    public void user_clicks_on_view_cart_button() {
        ReusableMethods.waitFor(3);
        ReusableMethods.waitForVisibility(tc22_testCasesPage.viewCart, 10);
        tc22_testCasesPage.viewCart.click();

    }
    @Then("user verifies that product is displayed in cart page")
    public void user_verifies_that_product_is_displayed_in_cart_page() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(tc22_testCasesPage.productName.isDisplayed());
    }

    @Then("user closes the Test TwentyTwo browser")
    public void userClosesTheTestTwentyTwoBrowser() {
        Driver.closeDriver();
    }
}