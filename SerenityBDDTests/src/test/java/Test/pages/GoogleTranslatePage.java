package Test.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://translate.google.com/?hl=ru")
public class GoogleTranslatePage extends PageObject {
    @FindBy(xpath = "//*[@id=\"source\"]")
    private WebElementFacade textArea;

    @FindBy(xpath = "//span[contains(@class,'tlid-translation')]")
    private WebElementFacade resultTranslation;

    @FindBy(xpath = "(//div[@class='gt-def-row'])[2]")
    private WebElementFacade definition;

    @FindBy(xpath = "//div[@class='sl-more tlid-open-source-language-list']")
    private WebElementFacade languagesFromMenu;

    @FindBy(xpath = "//div[@class='tl-more tlid-open-target-language-list']")
    private WebElementFacade languagesToMenu;

    @FindBy(xpath = "//input[@id='sl_list-search-box']")
    private WebElementFacade searchLanguageFrom;

    @FindBy(xpath = "//input[@id='tl_list-search-box']")
    private WebElementFacade searchLanguageTo;

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
