package test;

import model.Buyer;
import model.Item;
import org.hamcrest.core.Every;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
    /*@Test
    public void testAddToCart() {
        Item item = ItemCreator.forAddition();

        Item cartItem = new CatalogPage(driver)
                .openPage()
                .closeCityPopup()
                .addToCart(item)
                .goToCart()
                .waitForLoad()
                .getFirstItem();

        assertThat(cartItem, is(equalTo(item)));
    }*/

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

    /*@Test
    public void testBuyQuickly() {
        WebDriverWait waitForOne = new WebDriverWait(driver, 10);
        waitForOne.until(ExpectedConditions.presenceOfElementLocated(By.xpath("some_xpath")));
        Buyer buyer = BuyerCreator.forPurchase();
        String expectedMessage = "Ваш заказ отправлен. Спасибо.";

        ItemPage itemPage = new ItemPage(driver);
        itemPage.openPage();
        itemPage.closeCityPopup();
        itemPage.showQuickPurchaseForm();
        itemPage.buyQuickly(buyer);
        String result = itemPage
                .getBuyQuicklyResult();

        assertThat(result, is(equalTo(expectedMessage)));
    }*/
}
