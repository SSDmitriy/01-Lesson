package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleSearch {

    @Test
    void wikipediaSearchTest() {

        //open google
        open("https://google.com");

        //type search "wikipedia.org", press Enter
        $("[name=q]").setValue("wikipedia").pressEnter();

        //check "Википедия — свободная энциклопедия" in result
        $("#rso").shouldHave(text("wikipedia.org"));
    }
}
