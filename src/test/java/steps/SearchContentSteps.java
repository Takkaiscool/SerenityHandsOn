package steps;

import net.thucydides.core.annotations.Step;
import pages.ImdbHomePage;
import pages.MostPopularTvShows;
import pages.ProgramDetailsPage;
import pages.SearchResultsPage;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchContentSteps {
    private ImdbHomePage imdbHomePage;
    private SearchResultsPage searchResultsPage;
    private MostPopularTvShows mostPopularTvShows;
    private ProgramDetailsPage programDetailsPage;

    @Step
    public void isOnTheHomePage() {
        imdbHomePage.open();
    }

    @Step
    public void selectQuickSearchOption() {
        imdbHomePage.select_tv_episodes_option();
    }

    @Step
    public void enterSearchkeyword(String keyWord) {
        imdbHomePage.enter_search_keyword(keyWord);
    }

    @Step
    public void clickSearchButton() {
        imdbHomePage.click_search_button();
    }

    @Step
    public void verifyResultDisplayed(String result) {
        assertThat(searchResultsPage.read_result_table_data()).contains(result);
    }

    @Step
    public void selectOptionFromFirstDropdown(String option) {
        imdbHomePage.select_movies_tv_showtimes(option);
    }

    @Step
    public void selectTvShowOnMostPopularTvShowsPage(String tvShow) {
        mostPopularTvShows.click_tv_show(tvShow);
    }

    @Step
    public void verifyDirectorName(String name)
    {
        assertThat(programDetailsPage.read_director_name()).isEqualToIgnoringCase(name);
    }
}


