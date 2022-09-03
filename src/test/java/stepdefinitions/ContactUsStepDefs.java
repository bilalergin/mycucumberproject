package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactUsPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class ContactUsStepDefs {

    ContactUsPage contactUsPage = new ContactUsPage();

    @When("user clicks on Contact Us button")
    public void user_clicks_on_contact_us_button() {
        contactUsPage.contactUsLink.click();
    }


    @When("user verifies Get In Touch is visible")
    public void user_verifies_get_in_touch_is_visible() {
        Assert.assertTrue(contactUsPage.getInTouch.isDisplayed());
    }


    @When("user enters name, email, subject and message")
    public void user_enters_name_email_subject_and_message() {
        Driver.waitAndSendText(contactUsPage.name,Faker.instance().name().name());
        Driver.waitAndSendText(contactUsPage.email,Faker.instance().internet().emailAddress());
        Driver.waitAndSendText(contactUsPage.subject,"Selenium and Cucumber");
        Driver.waitAndSendText(contactUsPage.message,"Selenium is about to finish, we can go to the market");

    }


    @When("user uploads file")
    public void user_uploads_file() {
        String path = "C:\\Users\\BİLGİSAYAR\\Desktop\\logo.jpeg";
        Driver.waitAndSendText(contactUsPage.uploadFile,path);
    }


    @When("user  clicks Submit button")
    public void user_clicks_submit_button() {
        Driver.waitAndClick(contactUsPage.submitButton);

    }


    @When("user clicks OK button")
    public void user_clicks_ok_button() {
        ReusableMethods.waitFor(3);
        Driver.getDriver().switchTo().alert().accept();

    }


    @Then("user verifies success message Success Your details have been submitted successfully is visible")
    public void user_verifies_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
        Assert.assertTrue(contactUsPage.successMessage.isDisplayed());

    }


    @Then("user clicks on home button and verifies that landed home page successfully")
    public void user_clicks_on_home_button_and_verifies_that_landed_home_page_successfully() {
        ReusableMethods.waitFor(2);
        Driver.waitAndClick(contactUsPage.homeButton);
        ReusableMethods.waitFor(2);
        String title = Driver.getDriver().getTitle();
        Assert.assertEquals("Automation Exercise",title);
    }


}