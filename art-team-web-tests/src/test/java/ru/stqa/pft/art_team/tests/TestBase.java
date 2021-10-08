package ru.stqa.pft.art_team.tests;

import  org.testng.annotations.AfterSuite;
import  org.testng.annotations.BeforeSuite;
import ru.stqa.pft.art_team.appmanager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;

public class TestBase {

    protected static final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeSuite
    public static void setUp() {
        app.init();
    }

    @AfterSuite
    public static void tearDown() {
        app.stop();
    }


}
