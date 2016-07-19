package com.omnigon.qatests.pgat.steps;

import com.omnigon.qatests.pgat.pages.CorePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class PgatSteps extends ScenarioSteps {

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
        assertTrue("Title is absent", header!=null);
        assertTrue("Title should not be empty", header.length()!=0);
    }

    @Step
    public void check_facebook_social_icons_is_present() {
        assertTrue("Facebook Icon is absent", corePage.isFacebookIconDisplayed());

    }
    @Step
    public void check_twitter_social_icon_is_present(){
        assertTrue("Twitter Icon is absent", corePage.isTwitterIconDisplayed());
    }

    @Step
    public void check_googlePlus_social_icon_is_present(){
        assertTrue("GooglePlus Icon is absent", corePage.isGooglePlusIconDisplayed());
    }
    @Step
    public void check_pinterestIcon_social_icon_is_present(){
        assertTrue("Pinterest Icon is absent", corePage.isPinterestIconDisplayed());
    }

    @Step
    public void check_tumblrIcon_social_icon_is_present(){
        assertTrue("Tumblr Icon is absent", corePage.isTumblrIconDisplayed());
    }
    //Try to use Soft Assert


    public class SoftAssert {
        @Test
        public void testSoftAssertion() {
            SoftAssert asert = new SoftAssert();
            asert.assertEquals()
        }
        System.out.println("Started test");
            String header = corePage.getHeader();
            softAssert.assertTrue("Title is absent", header != null);
            softAssert.assertTrue("Title should not be empty", header.length() != 0);
            softAssert.assertTrue("Facebook Icon is absent", corePage.isFacebookIconDisplayed());
            softAssert.assertTrue("Twitter Icon is absent", corePage.isTwitterIconDisplayed());
            softAssert.assertTrue("GooglePlus Icon is absent", corePage.isGooglePlusIconDisplayed());
            softAssert.assertTrue("Pinterest Icon is absent", corePage.isPinterestIconDisplayed());
            softAssert.assertTrue("Tumblr Icon is absent", corePage.isTumblrIconDisplayed());
            softAssert.assertAll();
        }
    }








