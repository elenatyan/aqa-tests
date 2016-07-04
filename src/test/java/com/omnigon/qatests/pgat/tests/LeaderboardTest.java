package com.omnigon.qatests.pgat.tests;

import com.omnigon.qatests.pgat.steps.PgatSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LeaderboardTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public PgatSteps pgatSteps;

    @BeforeClass
    public static void startDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
    }

    @Test
    public void click_by_menu_leaderboard_should_display_the_corresponding_page() {
        pgatSteps.open_home_page();
        pgatSteps.open_leaderboard_page();

    }

    @Test
    public void observe_title() {
        pgatSteps.check_title_not_empty();

    }
    @Test
    public void check_social_icons() {
        pgatSteps.check_social_icons_is_present();
    }



}
   /*
Test Case:
        Steps:
        1. Navigate to http://www.pgatour.com/
        2. Select Leaderboard  in Global Navigation
        3. Check that title is displayed on a Leaderboard page(check that Title is not empty and existed, for example check that it`s has type String)
        4. Check that Social icons are  displayed
        Expected results:
        1. Page is displayed
        2. Leaderboard page is displayed\
        3. Title is displayed
        4. Social icons are displayed
        */