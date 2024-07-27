package tasks;

import pages.LandingPage;
import utils.Tools;

public class LandingPageTask {

    public LandingPage landingPage;

    public LandingPageTask(Tools driver) {
        landingPage = new LandingPage(driver);
    }

    public void queAcessoAProductStore() {
        landingPage.waitForCategory(Tools.getTimeout());
    }

    public void acessoACategoriaMonitors() {
        landingPage.clickCategory();
    }

    public void selecionoUmAppleMonitor() {
        landingPage.waitForAppleMonitor();
        landingPage.clickOnAppleMonitor();
    }
}
