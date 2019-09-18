package Test.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://translate.google.com/?hl=ru")
public class GoogleTranslatePage extends PageObject {
    @FindBy(xpath = "//*[@id=\"sugg-item-en\"]")
    WebElementFacade englishButton;

    @FindBy(xpath = "//*[@id=\"source\"]")
    WebElementFacade textArea;

    @FindBy(className = "result-shield-container")
    WebElementFacade resultTranslation;

    @FindBy(xpath = "(//div[@class='gt-def-row'])[2]")
    WebElementFacade definition;

    @FindBy(xpath = "//div[@class='sl-more tlid-open-source-language-list']")
    WebElementFacade languagesFromMenu;

    @FindBy(xpath = "//div[@class='tl-more tlid-open-target-language-list']")
    WebElementFacade languagesToMenu;

    @FindBy(xpath = "//input[@id='sl_list-search-box']")
    WebElementFacade searchLanguageFrom;

    @FindBy(xpath = "//input[@id='tl_list-search-box']")
    WebElementFacade searchLanguageTo;

    public void selectLanguages(String languageFrom, String languageTo) {
        languagesFromMenu.click();
        searchLanguageFrom.sendKeys(languageFrom, Keys.ENTER);
        languagesToMenu.click();
        searchLanguageTo.sendKeys(languageTo, Keys.ENTER);
    }

    public void enterText(String text) {
        textArea.click();
        textArea.type(text);
    }

    public String getTranslation() {
        String actualTranslation = resultTranslation.getText();
        return actualTranslation;
    }

    public int getNumberOfSymbols() {
        int lengs = resultTranslation.getText().length();
        return lengs;
    }

    public String getWordDefinition() {
        String currentDefinition = definition.getText();
        return currentDefinition;
    }
}
