package tasks;

import pages.ProductPage;
import utils.Tools;

public class ProducPageTask {

    public ProductPage productPage;

    public ProducPageTask(Tools driver) {
        productPage = new ProductPage(driver);
    }

    public void oAdicionoOProdutoNoCarrinhoChart() {
        productPage.waitForAppleTitle();
        productPage.clickAddToCart();
    }

    public void confirmoClicandoEmOkNaCaixaDeDialogoQueAparece() {
        productPage.clickAlertBox();
    }

    public void acessoOCarrinhoEmChart() {
        productPage.clickOnCart();
    }
}
