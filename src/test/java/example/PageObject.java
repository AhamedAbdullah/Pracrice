package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    WebDriver driver;
    @FindBy(id="twotabsearchtextbox")
    WebElement searchBox;

    @FindBy(id="nav-flyout-searchAjax")
    WebElement searchTip;

    @FindBy(id="nav-search-submit-button")
    WebElement searchButton;

    public PageObject(WebDriver driver){
        PageFactory.initElements(driver,this);
    }



}
