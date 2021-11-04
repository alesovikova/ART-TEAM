package ru.stqa.pft.art_team.appmanager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.art_team.locators.Keycloak_locators;

import java.util.concurrent.TimeUnit;

public class Profile_page {
    private WebDriver wd;

    private final BaseHelper baseHelper = new BaseHelper(wd);
    private final SessionHelper sessionHelper = new SessionHelper(wd);

    public Profile_page(WebDriver wd) {
        this.wd = wd;
    }

    public void click_edit_btn() {
        wd.findElement(Keycloak_locators.edit_btn).click();
        sessionHelper.pause(1000);
    }

    public void text_first_name(String first_name) {
        wd.findElement(Keycloak_locators.first_name).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        wd.findElement(Keycloak_locators.first_name).sendKeys(Keys.DELETE);
        wd.findElement(Keycloak_locators.first_name).sendKeys(first_name);
    }

    public void text_last_name(String last_name) {
        wd.findElement(Keycloak_locators.last_name).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        wd.findElement(Keycloak_locators.last_name).sendKeys(Keys.DELETE);
        wd.findElement(Keycloak_locators.last_name).sendKeys(last_name);
    }

    public void text_position(String position) {
        wd.findElement(By.xpath("//label[@for=\"position\"]/following-sibling::div")).click();
        wd.findElement(Keycloak_locators.position).sendKeys(Keys.DELETE);
        wd.findElement(Keycloak_locators.position).sendKeys(position);
        wd.findElement(Keycloak_locators.position).sendKeys(Keys.ENTER);
    }

    public void text_location(String location) {
        wd.findElement(By.xpath("//label[@for=\"location\"]/following-sibling::div")).click();
        wd.findElement(Keycloak_locators.location).sendKeys(Keys.DELETE);
        wd.findElement(Keycloak_locators.location).sendKeys(location);
        wd.findElement(Keycloak_locators.location).sendKeys(Keys.ENTER);
    }

    public void press_add_contacts_button() {
        wd.findElement(Keycloak_locators.add_button).click();
    }

    public void fill_in_email(String email) {
        wd.findElement(Keycloak_locators.choose_contact_field).click();
        wd.findElement(Keycloak_locators.enter_name_field_1).sendKeys("Email");
        wd.findElement(Keycloak_locators.enter_name_field_1).sendKeys(Keys.ENTER);
        wd.findElement(Keycloak_locators.email_field).sendKeys(email);
    }

    public void fill_in_home_phone(String home_phone) {
        wd.findElement(Keycloak_locators.choose_contact_field).click();
        wd.findElement(Keycloak_locators.enter_name_field_2).sendKeys("Home phone");
        wd.findElement(Keycloak_locators.enter_name_field_2).sendKeys(Keys.ENTER);
        wd.findElement(Keycloak_locators.home_phone_field).sendKeys(home_phone);
    }

    public void fill_in_skype(String skype) {
        wd.findElement(Keycloak_locators.choose_contact_field).click();
        wd.findElement(Keycloak_locators.enter_name_field_3).sendKeys("Skype");
        wd.findElement(Keycloak_locators.enter_name_field_3).sendKeys(Keys.ENTER);
        wd.findElement(Keycloak_locators.skype_field).sendKeys(skype);
    }

    public void fill_work_phone(String work_phone) {
        wd.findElement(Keycloak_locators.choose_contact_field).click();
        wd.findElement(Keycloak_locators.enter_name_field_4).sendKeys("Work phone");
        wd.findElement(Keycloak_locators.enter_name_field_4).sendKeys(Keys.ENTER);
        wd.findElement(Keycloak_locators.work_phone_field).sendKeys(work_phone);
    }

    public void press_save_button() {
        wd.findElement(Keycloak_locators.save_button).click();
    }

    public void press_delete_button() {
        wd.findElement(Keycloak_locators.delete_button).click();
    }

    public void press_agree_button() {
        wd.findElement(Keycloak_locators.agree_button).click();
    }

    public void clear_contacts_data()  {
        click_edit_btn();
        sessionHelper.pause(2000);
        press_add_contacts_button();               // it needs to change
        sessionHelper.pause(2000);
        press_delete_button();
        press_agree_button();
        wd.switchTo().defaultContent();
        press_save_button();
    }

    public void fill_in_contacts_form(String email, String home_phone, String skype, String work_phone) {
        press_add_contacts_button();
        fill_in_email(email);
        press_add_contacts_button();
        fill_in_home_phone(home_phone);
        press_add_contacts_button();
        fill_in_skype(skype);
        press_add_contacts_button();
        fill_work_phone(work_phone);
    }


    public void check_contacts_data(String email, String home_phone, String skype, String work_phone) {
        Assert.assertEquals (email, wd.findElement(Keycloak_locators.email_text).getText());
        Assert.assertEquals (home_phone, wd.findElement(Keycloak_locators.home_phone_text).getText());
        Assert.assertEquals (work_phone, wd.findElement(Keycloak_locators.work_phone_text).getText());
        Assert.assertEquals (skype, wd.findElement(Keycloak_locators.skype_text).getText());
    }

    public void check_profile_data(String first_name, String last_name, String position, String location) {
        Assert.assertEquals (first_name, wd.findElement(Keycloak_locators.first_name_text).getText());
        Assert.assertEquals (last_name, wd.findElement(Keycloak_locators.last_name_text).getText());
    }
}
