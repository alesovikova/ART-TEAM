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
}
