package test;

import org.testng.annotations.Test;
import page.CatalogPage;
import page.MainPage;
import page.TelegramPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class OtherTests extends CommonConditions 
{                                                             ///Working
    /*@Test
    public void testOpenCatalog() throws InterruptedException {
        Thread.sleep(1000);
        String expectedPageTitle = "Техника для кухни купить в Минске в гипермаркете Mile";
        String expectedText = "Техника для кухни";

        CatalogPage catalogPage = new MainPage(driver)
                .openPage()
                .closeCityPopup()
                .showCatalogs()
                .goToCatalog()
                .waitForLoad();

        assertThat(catalogPage.getPageTitle(), is(equalTo(expectedPageTitle)));
        assertThat(catalogPage.getHeadingText(), is(equalTo(expectedText)));
        assertThat(catalogPage.getBreadcrumbText(), is(equalTo(expectedText)));
    }*/

   /*@Test
    public void testSelectCity() {                          ///Working
        String city = "Брест";


        MainPage mainPage = new MainPage(driver)
                .openPage()
                .selectCity(city)
                .waitForReload();

        assertThat(mainPage.getCityName(), is(equalTo(city)));
    }*/
}
