import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class Lesson3Video {

    @Test
    public void lesson3VideoWork(){

        open("https://github.com/selenide/selenide");

        //навести мышку на первый значек в Contributors
        $x("//ul[@class='list-style-none d-flex flex-wrap mb-n2']/li").shouldBe(visible).hover();

        //не подключается findBy!
        //$x("//div[contains(@class,'Popover-message Popover-message')]").FindBy(visible);
        $x("//a[@class='f5 text-bold Link--primary no-underline']").shouldHave(text("Andrei Solntsev"));




    sleep(3000);
    }
}


