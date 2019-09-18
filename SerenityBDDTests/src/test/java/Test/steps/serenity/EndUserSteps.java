package Test.steps.serenity;

import Test.pages.GoogleTranslatePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class EndUserSteps {

    GoogleTranslatePage googleTranslatePage;

    @Step
    public void isOnTheGoogleTranslatePage() {
        googleTranslatePage.open();
    }

    @Step
    public void selectLanguageForTranslation(String languageFrom, String languageTo) {
        googleTranslatePage.selectLanguages(languageFrom, languageTo);
    }

    @Step
    public void translateTheWord(String word) {
        googleTranslatePage.enterText(word);
    }

    @Step
    public void checkTheTranslationOfTheWord(String wordTranslated) {
        String actualTranslation = googleTranslatePage.getTranslation();
        Assert.assertEquals(wordTranslated, actualTranslation);
    }

    @Step
    public void checkNumberOfCharacters(int lengs) {
        int actualLengs = googleTranslatePage.getNumberOfSymbols();
        Assert.assertEquals(lengs, actualLengs);
    }

    @Step
    public void shouldSeeDefinition(String definition) {
        String actualDefinition = googleTranslatePage.getWordDefinition();
        Assert.assertEquals(definition, actualDefinition);
    }
}