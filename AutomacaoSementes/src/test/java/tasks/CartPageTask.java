package tasks;

import pages.CartPage;
import pages.ProductPage;
import utils.Tools;

public class CartPageTask {

    public CartPage cartPage;

    public CartPageTask(Tools driver) {
        cartPage = new CartPage(driver);
    }

    public void confirmoAInclusao() {
        cartPage.waitForProductTitle();
        cartPage.countQuantityOfProducts();
        cartPage.verifyTotal();
    }

    public void clicoEmPlaceOrder() {
        cartPage.clickOnPlaceOrder();
    }
}
