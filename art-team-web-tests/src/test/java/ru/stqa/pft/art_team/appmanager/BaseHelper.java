package ru.stqa.pft.art_team.appmanager;

import org.checkerframework.checker.units.qual.Time;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.stqa.pft.art_team.locators.Keycloak_locators;

import java.io.FileReader;
import java.util.concurrent.TimeUnit;

public class BaseHelper {
    private WebDriver wd;

    public BaseHelper(WebDriver driver) {
        this.wd = driver;
    }


    public String read_json(String dataFileName, String key) {
        String dataFilePath = "src/config/";
        JSONObject testObject = null;

        try {
            FileReader reader = new FileReader(dataFilePath + dataFileName);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            testObject = (JSONObject) jsonObject;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return (String) testObject.get(key);
    }

    public void go_to_url(String url) {
        wd.navigate().to(url);

    }


    public boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void switch_language_to_eng()    {
        wd.findElement(Keycloak_locators.eng_language_tab).click();
    }

    public void switch_language_to_ru()    {
        wd.findElement(Keycloak_locators.ru_language_tab).click();

    }

    public void press_exit_button() {
        wd.findElement(Keycloak_locators.exit_btn).click();
    }


}
