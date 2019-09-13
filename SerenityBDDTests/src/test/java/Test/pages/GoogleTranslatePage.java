package Test.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://translate.google.com/?hl=ru")
public class GoogleTranslatePage extends PageObject {
    @FindBy(xpath = "//*[@id=\"sugg-item-en\"]")
    WebElementFacade englishButton;

    @FindBy(xpath = "//*[@id=\"source\"]")
    WebElementFacade textArea;

    @FindBy(className = "result tlid-copy-target")
    WebElementFacade resultTranslation;

    @FindBy(className = "goog-inline-block jfk-button jfk-button-standard jfk-button-collapse-right jfk-button-checked jfk-button-clear-outline")
    WebElementFacade ukraineButoon;

    public void clickOnTheEnglishButton() {
        englishButton.click();
    }

    public void enterText(String text) {
        textArea.click();
        textArea.type(text);
    }

    public void checkTranslation(String text){
        resultTranslation.getText();
    }
}
