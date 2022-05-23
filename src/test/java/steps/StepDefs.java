package steps;

import io.cucumber.java8.En;
import pages.Page;

public class StepDefs extends Page implements En {


    public StepDefs() {
        Given("I go to url (.*)$", (final String url) -> getUrl(url));

        When("I click on click on Sign in", () -> {clickSignIn();

        });

        When("sign in page is displayed", () -> {assertSignInPage();

        });

        When("I enter valid user Email or username as {string}", (String Email_username) -> {enterEmail_username(Email_username);

        });

        When("I enter valid password as {string}", (String Password) -> {enterPassword(Password);

        });

        When("I click on Sign in button", () -> {clickSignInButton();

        });

        When("I click on Weather link tab", () -> {clickWeatherLinkTab();

        });

        When("Weather Search page is displayed", () -> {assertWeatherHomePage();

        });

        When("I enter location as {string}", (String Location) -> {enterLocation(Location);

        });

        When("I click on the search button", () -> {clickSearchButton();

        });

        When("Search result is displayed", () -> {assertResultList();

        });

        When("I select the search result", () -> {clickResultOne();

        });

        When("^Weather details page for the searched \"([^\"]*)\" is displayed$", (String Location) -> {assertSearchedLocationWeatherPage(Location);
        });

        When("I click on Add to My Location button", () -> {updateMyLocation();

        });

        Then("Location is Added to my location", () -> {assertLocationIsAdded();

        });



    }
}
