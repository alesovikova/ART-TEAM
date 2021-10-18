package ru.stqa.pft.art_team.tests;

import org.testng.annotations.Test;
import  org.testng.annotations.AfterSuite;
import  org.testng.annotations.BeforeSuite;
import org.openqa.selenium.support.Color;
import static org.assertj.core.api.Assertions.assertThat;

public class TestMyCV  extends TestBase {
    String users = "users.json";

//    @BeforeSuite
//    public void login_as_user() {
//        app.getSessionHelper().login(app.getBaseHelper().read_json(users, "username"),
//                app.getBaseHelper().read_json(users, "password"));
//    }
//
//    @Test
//    public void test_check_color_active_MyCV_tab() {
//        app.getBaseHelper().go_to_url(app.getBaseHelper().read_json(users, "cv_url"));
//        String color_active_cv_tab = app.cv_page().get_border_color_cv_tab();
//        assertThat(Color.fromString("#86a1de").asRgba()).isEqualTo(color_active_cv_tab);
//
//        app.getBaseHelper().switch_language_to_eng();
//        app.cv_page().check_is_block_summary_displayed();
//    }
    @Test
    public void test_check_switch_language() {
        app.getBaseHelper().switch_language_to_eng();
        app.cv_page().check_eng_language_of_elements();
        app.getBaseHelper().switch_language_to_ru();
        app.cv_page().check_not_eng_language_of_elements();
    }
}

