package com.omnigon.qatests.pgat.tests;

import com.omnigon.qatests.steps.serenity.EndUserSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
//@Ignore
public class LeaderboardTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps elena;

    @Test
    public void searching_by_keyword_leaderboard_should_display_the_corresponding_page() {
        elena.is_the_home_page();
        elena.looks_for("//*[@class='nav-container']//*[contains(@href,'leaderboard')]");
        elena.looks_for("//*[@class='popover-content']//*[@class='link-box']//*[@class='facebook']");
        elena.should_see_page("leaderboard");

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