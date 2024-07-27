package tasks;

import pages.PlaceOrderModal;
import pages.ProductPage;
import utils.Tools;

public class PlaceOrderModalTask {

    public PlaceOrderModal placeOrderModal;

    public PlaceOrderModalTask(Tools driver) {
        placeOrderModal = new PlaceOrderModal(driver);
    }

    public void preenchoTodosOsCampos() {
        placeOrderModal.waitModalTitle();
        placeOrderModal.inputName();
        placeOrderModal.inputCountry();
        placeOrderModal.inputCity();
        placeOrderModal.inputCard();
        placeOrderModal.inputMonth();
        placeOrderModal.inputYear();
    }

    public void clicoEmPurchase() throws InterruptedException {
        placeOrderModal.clickPurchaseButton();
    }

    public void euDevoVerAMensagemDeCompraRealizada() {
        placeOrderModal.waitSuccessMessage();
        placeOrderModal.clickOnOkSuccessScreen();
    }
}
