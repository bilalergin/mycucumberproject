package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC22_TestCasesPage {
    public TC22_TestCasesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='recommended_items']//h2")
    public WebElement recommendedItemsTitle;

    @FindBy(xpath = "//div[@class='recommended_items']")
    public WebElement recommendedItems;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[72]")
    public WebElement recommendedItemAddToCartButton;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCart;
    @FindBy(xpath = "//h4//a[@href='/product_details/4']")
    public WebElement productName;
}