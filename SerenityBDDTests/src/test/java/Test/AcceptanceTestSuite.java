package Test;

import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.webdriver.Configuration;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.ThucydidesSystemProperty.WEBDRIVER_DRIVER;
import static net.thucydides.core.ThucydidesSystemProperty.WEBDRIVER_PROVIDED_TYPE;

public class AcceptanceTestSuite extends SerenityStories {
    @Managed
    WebDriver driver;
}
