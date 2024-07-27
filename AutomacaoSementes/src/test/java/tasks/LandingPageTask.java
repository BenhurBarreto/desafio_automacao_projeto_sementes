package tasks;

import pages.LandingPage;
import utils.Tools;

public class LandingPageTask {

    public LandingPage landingPage;

    public LandingPageTask(Tools driver) {
        landingPage = new LandingPage(driver);
    }

    public void queAcessoAProductStore() {
        landingPage.waitForCategory(10);
    }

    public void acessoACategoriaMonitors() {
        landingPage.clickCategory();
    }

    public void selecionoUmAppleMonitor() {
        landingPage.waitForAppleMonitor();
        landingPage.clickOnAppleMonitor();
    }
}
