package test;

import model.Buyer;
import model.Item;
import org.hamcrest.core.Every;
import org.testng.annotations.Test;
import page.CatalogPage;
import page.ItemPage;
import service.BuyerCreator;
import service.ItemCreator;
import service.SearchQueryCreator;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ItemTests extends CommonConditions {
    @Test
    public void testSearchItems() {
        String query = SearchQueryCreator.fromProperty();

        List<String> results = new CatalogPage(driver)
                .openPage()
                .closeCityPopup()
                .searchItems(query)
                .getSearchResults();

        assertThat(results, Every.everyItem(containsStringIgnoringCase(query)));
    }
