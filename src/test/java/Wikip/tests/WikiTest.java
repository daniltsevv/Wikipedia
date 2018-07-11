package Wikip.tests;

import Wikip.pages.MainPage;
import Wikip.setting.ChromeSettings;
import org.junit.Test;


public class WikiTest extends ChromeSettings {
    @Test
    public void findActor() throws InterruptedException{
        MainPage mainPage = new MainPage(driver);
        mainPage.clickActor1();
        mainPage.findActor1Film();
        mainPage.clickActor2();
        mainPage.findActor2Film();
        mainPage.clickActor3();
        mainPage.findActor3Film();
        mainPage.clickActor4();
        mainPage.findActor4Film();
        mainPage.clickActor5();
        mainPage.findActor5Film();
        mainPage.clickActor6();
        mainPage.findActor6Film();

    }
}
