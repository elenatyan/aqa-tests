package com.omnigon.qatests.pgat.steps;

import com.omnigon.qatests.pgat.pages.CorePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void check_social_icons_is_present() {
        corePage.getFacebookIcon();
        corePage.getTwitterIcon();
        corePage.getGooglePlusIcon();
        corePage.getTumblrIcon();
        corePage.getPinterestIcon();
    }
    @Step
    public void is_the_leaderboard_page() {
    }

    @Step
    public void starts_search() {
        corePage.lookup_terms();
    }

    @Step
    public void should_see_page(String definition) {
        assertThat(corePage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void looks_for(String title) {
        // enters(title);
        starts_search();
    }

}
        //String currentTitle = get.title();

            /*String emptyTitle = null;
            String currentTitle = "World Golf Championships-Bridgestone Invitational---";
            //String currentTitle = CorePage.getCurrentTitle();

            if (currentTitle != null && currentTitle.length() > 0) {
                emptyTitle  = "Tournament Title is empty";
            }

            assertEquals("Tournament Title is empty", emptyTitle);
        }


       // http://www.leveluplunch.com/java/examples/is-string-null-or-empty/

        //corePage.select();
        //get actual title
        //check title not empty
         /*

*/





