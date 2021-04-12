import com.codeborne.selenide.*;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;



public class Lesson3Video extends TestBase {

    @Test
    public void HomeWorkLesson3 () {

        //open("https://github.com/");
        $x("//input[@name='q']").setValue("selenide").pressEnter();
        $x("//ul[@class='repo-list']/li").shouldHave(text("selenide/selenide"));
        $x("//ul[@class='repo-list']/li//a").click();
        $x("//span[text()='Wiki']").click();
        $x("//div[@class='wiki-rightbar']").shouldHave(text("SoftAssertions"));
        $x("//a[text()='SoftAssertions']").click();
        $x("//div[@id='wiki-wrapper']").shouldHave(text("JUnit5 extension"));

        sleep(3000);
    }

}


