package Test;

import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AcceptanceTestSuite extends SerenityStories {
    @Managed
    WebDriver driver;
}
