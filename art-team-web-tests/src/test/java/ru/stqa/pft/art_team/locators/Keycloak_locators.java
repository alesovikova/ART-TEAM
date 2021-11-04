package ru.stqa.pft.art_team.locators;

import org.openqa.selenium.By;

public class Keycloak_locators {
    //authorization
    public static By username = (By.id("username"));
    public static By password = (By.id("password"));
    public static By login_btn = (By.id("kc-login"));
    public static By login_invalid_message = (By.xpath("//div[@id='kc-content-wrapper']/div/span[@class='kc-feedback-text']"));


    public static By exit_btn = (By.xpath("//button[@class='button exit__button button_theme_primary']"));

    //menu tabs
    public static By eng_language_tab = (By.xpath("//span[text()='ENG']"));
    public static By ru_language_tab = (By.xpath("//*[@id=\"user-short-info\"]/div[3]/div/div[1]/div/span"));
    public static By cv_tab = (By.xpath("//div[@class='menu']/a[1]"));

    //Profile page
    public static By edit_btn = (By.xpath("//a[@href=\"/contact/edit\"]"));
    public static By first_name = (By.xpath("//*[@id=\"firstname\"]"));
    public static By last_name = (By.xpath("//*[@id=\"lastname\"]"));
    public static By position = (By.xpath("//input[@id=\"position\"]"));
    public static By location = (By.xpath("//input[@id=\"location\"]"));
    public static By add_button = (By.xpath("//span[text()=\"Contacts\"]/following::div/button[1]"));
    public static By choose_contact_field = (By.xpath("//span[text()[normalize-space()=\"Choose a contact\"]]"));
    public static By enter_name_field_1 = (By.xpath("//div[@id=\"inform-block\"]/div/div[1]//input[@placeholder=\"Enter a name\"]"));
    public static By enter_name_field_2 = (By.xpath("//div[@id=\"inform-block\"]/div/div[2]//input[@placeholder=\"Enter a name\"]"));
    public static By enter_name_field_3 = (By.xpath("//div[@id=\"inform-block\"]/div/div[3]//input[@placeholder=\"Enter a name\"]"));
    public static By enter_name_field_4 = (By.xpath("//div[@id=\"inform-block\"]/div/div[4]//input[@placeholder=\"Enter a name\"]"));
    public static By email_field = (By.xpath("//input[@placeholder=\"Enter your email in the format example@test.ru\"]"));
    public static By home_phone_field = (By.xpath("//div[@id=\"inform-block\"]/div/div[2]//input[@placeholder=\"Enter your phone number in the format +x(xxx)xxx-xx-xx or +xxx(xx)xxx-xx-xx\"]"));
    public static By skype_field = (By.xpath("//input[@placeholder=\"Enter your Skype username\"]"));
    public static By work_phone_field = (By.xpath("//div[@id=\"inform-block\"]/div/div[4]//input[@placeholder=\"Enter your phone number in the format +x(xxx)xxx-xx-xx or +xxx(xx)xxx-xx-xx\"]"));
    public static By save_button = (By.xpath("//div[text()[normalize-space()=\"Edit profile\"]]/following::div[1]/button[1]"));
    public static By delete_button = (By.xpath("//span[text()=\"Contacts\"]/following::div/button[2]"));

    public static By email_text = (By.xpath("//span[text()[normalize-space()=\"Email:\"]]/a"));
    public static By home_phone_text = (By.xpath("//span[text()[normalize-space()=\"Home phone:\"]]/a"));
    public static By work_phone_text = (By.xpath("//span[text()[normalize-space()=\"Work phone:\"]]/a"));
    public static By skype_text = (By.xpath("//span[text()[normalize-space()=\"Skype:\"]]/a"));
    public static By first_name_text = (By.xpath("//div[@class=\"user-info\"]/div/div/span[1]"));
    public static By last_name_text = (By.xpath("//div[@class=\"user-info\"]/div/div/span[2]"));







    //modal window
    public static By agree_button = (By.xpath("//div[@class=\"modal__footer\"]//button[1]"));





}
