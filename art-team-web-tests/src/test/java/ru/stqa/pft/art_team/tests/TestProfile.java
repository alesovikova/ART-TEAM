package ru.stqa.pft.art_team.tests;

import org.testng.annotations.*;

public class TestProfile extends TestBase {
    String users = "users.json";

    @BeforeClass
    public void go_to_profile_page() {
        app.getBaseHelper().go_to_url(app.getBaseHelper().read_json(users, "main_url"));
        app.getSessionHelper().login_as_autoTest(app.getBaseHelper().read_json(users, "username"),
                app.getBaseHelper().read_json(users, "password"));
        app.getBaseHelper().go_to_url(app.getBaseHelper().read_json(users, "profile_page"));
    }

   @AfterClass
    public void clear_all_contacts_data() {
        app.getBaseHelper().go_to_url(app.getBaseHelper().read_json(users, "profile_page"));
        app.profile_page().clear_contacts_data();
    }

    @Test
    public void test_fill_in_user_info_and_check()  {
        app.profile_page().click_edit_btn();
        app.profile_page().text_first_name(app.getBaseHelper().read_json(users, "first_name"));
        app.profile_page().text_last_name(app.getBaseHelper().read_json(users, "last_name"));
        app.profile_page().text_position(app.getBaseHelper().read_json(users, "position"));
        app.profile_page().text_location(app.getBaseHelper().read_json(users, "location"));
        app.profile_page().press_save_button();

        app.profile_page().check_profile_data(app.getBaseHelper().read_json(users, "first_name"),
                app.getBaseHelper().read_json(users, "last_name"),
                app.getBaseHelper().read_json(users, "position"),
                app.getBaseHelper().read_json(users, "location"));
    }

    @Test
    public void test_fill_in_contacts_info_and_check()  {
        app.profile_page().click_edit_btn();
        app.profile_page().fill_in_contacts_form(
                app.getBaseHelper().read_json(users, "email"),
                app.getBaseHelper().read_json(users, "home_phone"),
                app.getBaseHelper().read_json(users, "skype"),
                app.getBaseHelper().read_json(users, "work_phone"));
        app.profile_page().press_save_button();

        app.profile_page().check_contacts_data(
                app.getBaseHelper().read_json(users, "email"),
                app.getBaseHelper().read_json(users, "home_phone"),
                app.getBaseHelper().read_json(users, "skype"),
                app.getBaseHelper().read_json(users, "work_phone"));
    }


}

