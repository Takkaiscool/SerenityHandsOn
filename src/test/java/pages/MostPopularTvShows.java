package pages;

import net.thucydides.core.pages.PageObject;

public class MostPopularTvShows extends PageObject {

    public void click_tv_show(String showName) {
        String[] a = showName.split("\\(");
        $("//td/span[contains(text(), '(" + a[1].trim() + "')]/../a[contains(text(), '" + a[0].trim() + "')]").waitUntilVisible().click();
    }

}
