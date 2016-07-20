package com.omnigon.qatests.pgat.steps;

import com.omnigon.qatests.pgat.pages.CorePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.assertj.core.api.JUnitSoftAssertions;
import org.junit.Rule;

import static org.junit.Assert.assertTrue;


public class PgatSteps extends ScenarioSteps {
    @Rule
    public final JUnitSoftAssertions softAssert = new JUnitSoftAssertions();

    CorePage corePage;

    @Step
    public void open_home_page() {
        corePage.open();
    }

    @Step
    public void open_leaderboard_page() {
        corePage.clickLeaderboardMenuItem();
    }


    @Step
    public void check_title_not_empty() {
        String header = corePage.getHeader();
        assertTrue("Title is absent", header != null);
        assertTrue("Title should not be empty", header.length() != 0);
    }

    @Step
    public void check_facebook_social_icons_is_present() {
        assertTrue("Facebook Icon is absent", corePage.isFacebookIconDisplayed());

    }

    @Step
    public void check_twitter_social_icon_is_present() {
        assertTrue("Twitter Icon is absent", corePage.isTwitterIconDisplayed());
    }

    @Step
    public void check_googlePlus_social_icon_is_present() {
        assertTrue("GooglePlus Icon is absent", corePage.isGooglePlusIconDisplayed());
    }

    @Step
    public void check_pinterestIcon_social_icon_is_present() {
        assertTrue("Pinterest Icon is absent", corePage.isPinterestIconDisplayed());
    }

    @Step
    public void check_tumblrIcon_social_icon_is_present() {
        assertTrue("Tumblr Icon is absent", corePage.isTumblrIconDisplayed());
    }

    ///Try to implement via SoftAssert

        @Step
        public void fSoftAssertion() {

            System.out.println("Started test");
            String header = corePage.getHeader();
            softAssert.assertThat(corePage.getHeader()).as("Title is absent").isEmpty();
            softAssert.assertThat(corePage.getHeader().length()!= 0).as("Title should not be empty").isEmpty ();

             /*
            softAssert.assertThat(corePage.getHeader().length()!= 0)).as("Title should not be empty").isEqualTo(true);
            softAssert.assertThat(corePage.isFacebookIconDisplayed()).as("Facebook Icon is absent").isEqualTo(true);
            softAssert.assertThat(corePage.isTwitterIconDisplayed()).as("Twitter Icon is absent").isEqualTo(true);
            softAssert.assertThat(corePage.isGooglePlusIconDisplayed()).as("GooglePlus Icon is absent").isEqualTo(true);
            softAssert.assertThat(corePage.isPinterestIconDisplayed()).as("Pinterest Icon is absent").isEqualTo(true);
            softAssert.assertThat(corePage.isTumblrIconDisplayed()).as("Tumblr Icon is absent").isEqualTo(true);
            */
       }
}








