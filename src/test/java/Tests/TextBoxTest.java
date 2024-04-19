package Tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {

    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Deez Nuts");
        $("#userEmail").setValue("scoobydoo@mail.ru");
        $("#currentAddress").setValue("USA, CA, Beverly Hills, 90210");
        $("#permanentAddress").setValue("USA, CA, Beverly Hills, 90210");
        $("#submit").click();

    }
}
