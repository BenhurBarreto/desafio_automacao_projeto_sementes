package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import tasks.CartPageTask;
import tasks.LandingPageTask;
import tasks.PlaceOrderModalTask;
import tasks.ProducPageTask;
import utils.Tools;
import utils.Driver;

public class CompraSteps {

    Tools driver = Driver.getDriver();
    LandingPageTask landingPageTask = new LandingPageTask(driver);
    ProducPageTask producPageTask = new ProducPageTask(driver);
    CartPageTask cartPageTask = new CartPageTask(driver);
    PlaceOrderModalTask placeOrderModalTask = new PlaceOrderModalTask(driver);

    @Dado("que acesso a Product Store")
    public void queaAessoAProductStore() {
        landingPageTask.queAcessoAProductStore();
    }
    @E("acesso a categoria Monitors")
    public void acessoACategoriaMonitors() {
        landingPageTask.acessoACategoriaMonitors();
    }
    @E("seleciono um Apple Monitor")
    public void selecionoUmAppleMonitor() {
        landingPageTask.selecionoUmAppleMonitor();
    }
    @E("o adiciono o produto no carrinho Chart")
    public void oAdicionoOProdutoNoCarrinhoChart() {
        producPageTask.oAdicionoOProdutoNoCarrinhoChart();
    }
    @E("confirmo clicando em OK na caixa de diálogo que aparece")
    public void confirmoClicandoEmOkNaCaixaDeDialogoQueAparece() {
        producPageTask.confirmoClicandoEmOkNaCaixaDeDialogoQueAparece();
    }
    @E("acesso o carrinho em Chart")
    public void acessoOCarrinhoEmChart() {
        producPageTask.acessoOCarrinhoEmChart();
    }
    @E("confirmo a inclusão")
    public void confirmoAInclusao() {
        cartPageTask.confirmoAInclusao();
    }
    @Quando("clico em Place Order")
    public void clicoEmPlaceOrder() {
        cartPageTask.clicoEmPlaceOrder();
    }
    @E("preencho todos os campos")
    public void preenchoTodosOsCampos() {
        placeOrderModalTask.preenchoTodosOsCampos();
    }
    @E("clico em Purchase")
    public void clicoEmPurchase() throws InterruptedException {
        placeOrderModalTask.clicoEmPurchase();
    }
    @Então("eu devo ver a mensagem de compra realizada")
    public void euDevoVerAMensagemDeCompraRealizada() {
        placeOrderModalTask.euDevoVerAMensagemDeCompraRealizada();
    }
}
