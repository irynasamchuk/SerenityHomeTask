package Test.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import Test.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the google translate page")
    public void theUserIsOnTheGoogleTranslatePage() {
        endUser.isOnTheGoogleTranslatePage();
    }

    @Given("selected languages from '$languageFrom' to '$languageTo'")
    public void selectedLanguagesToTranslate(String languageFrom, String languageTo) {
        endUser.selectLanguageForTranslation(languageFrom, languageTo);
    }

    @When("the user looks up the translation of the word '$word'")
    public void theUserLooksTheTranslationOfTheWord(String word) {
        endUser.translateTheWord(word);
    }

    @Then("they should see the translation '$wordTranslated'")
    public void theyShouldSeeTheTranslation(String wordTranslated) {
        endUser.checkTheTranslationOfTheWord(wordTranslated);
    }

    @Then("number of characters must be '$number'")
    public void numberOfCharactersMustBe(int number) {
        endUser.checkNumberOfCharacters(number);
    }

    @Then("they should see the definition2 '$definition'")
    public void theyShouldSeeTheDefinition(String definition) {
        endUser.shouldSeeDefinition(definition);
    }
}
