package com.omnigon.qatests.steps.serenity;

import com.omnigon.qatests.pages.DictionaryPage;
import com.omnigon.qatests.pgat.pages.CorePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

public class EndUserSteps extends ScenarioSteps {

    CorePage corePage;

    @Step
    public void enters(String keyword) { corePage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        corePage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(corePage.getDefinitions(), hasItem(containsString(definition)));
//        assertTrue("Leaderboard ", isLezderbosrdPresent());
//        assertEquals ("", true, true);
    }

    @Step
    public void open_home_page() {
        corePage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
    @Step
    public void should_see_page(String value) {

    }



}
