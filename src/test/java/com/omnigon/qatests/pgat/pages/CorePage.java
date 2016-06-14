package com.omnigon.qatests.pgat.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://www.pgatour.com/")
public class CorePage extends PageObject {

    @FindBy(name="search")
    private WebElementFacade searchTerms;

    @FindBy(name="go")
    private WebElementFacade lookupButton;

    @FindBy(xpath="//*[@class='nav-container']//*[contains(@href,'leaderboard')]")
    private WebElementFacade leaderboardMenuItem;

    @FindBy(xpath="//*[@class='name']//*[contains(@href,'tournaments')]")
    private WebElementFacade checkTitle;

    @FindBy(xpath="//*[@class='share-popup']//*[@class='facebook']")
    private WebElementFacade checkFacebookIcon;

    @FindBy(xpath="//*[@class='share-popup']//*[@class='twitter']")
    private WebElementFacade checkTwitterIcon;

    @FindBy(xpath="//*[@class='share-popup']//*[@class='google-plus']")
    private WebElementFacade checkGooglePlusIcon;

    @FindBy(xpath="//*[@class='share-popup']//*[@class='pinterest']")
    private WebElementFacade checkPinterestIcon;

    @FindBy(xpath="//*[@class='share-popup']//*[@class='tumblr']")
    private WebElementFacade checkTumblrIcon;

    @FindBy(xpath="//*[@class='share-popup']//*[@class='mailto'] ")
    private WebElementFacade checkTumblrIcon;



    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }

    public void lookup_terms() {
        lookupButton.click();
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        List<WebElement> results = definitionList.findElements(By.tagName("li"));
        return convert(results, toStrings());
    }

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }


    public void clickLeaderboardMenuItem() {
        leaderboardMenuItem.click();
    }

    public void checkTournamentTitle() {
        checkTitle.select();
    }

    public void select() {

    }
}