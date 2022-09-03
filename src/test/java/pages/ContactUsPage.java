package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage {

    public ContactUsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (linkText = "Contact us")
    public WebElement contactUsLink;

    @FindBy(xpath = "//h2[text()='Get In Touch']")
    public WebElement getInTouch;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement name;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subject;

    @FindBy(id="message")
    public WebElement message;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadFile;

    @FindBy(xpath = "//input[@name='submit']" )
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement successMessage;


    @FindBy(xpath = "//i[@class='fa fa-home']")
    public WebElement homeButton;

}