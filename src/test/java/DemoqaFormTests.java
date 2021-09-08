import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.impl.Html.text;

public class DemoqaFormTests {

    @Test
    void FormTest(){
        open("https://demoqa.com/automation-practice-form");
    $("#firstName").setValue("Maria");
    $("#lastName").setValue("Kharlamova");
    $("#userEmail").setValue("maria@qaguru.com");
    $("#gender-radio-1").parent().click();
    //$(".custom-control-label").shouldHave(text("Other")).click();
    $("#userNumber").setValue("123");
    $("#subjectsInput").setValue("maths").pressEnter();
    //sleep(1500);
    $("#dateOfBirthInput").click();
    $(".react-datepicker__month-select").selectOption("April");
    $(".react-datepicker__year-select").selectOption("2002");
    $$(".react-datepicker__day--009").filter(not(cssClass(".react-datepicker__day--outside-month"))).first().click();
    $("#hobbies-checkbox-1").parent().click();
    $("#currentAddress").setValue("Pushkina street Colotushkina home");
    $(".css-1wa3eu0-placeholder").setValue("NCR").pressEnter();
    $(".css-1g6gooi").setValue("Delhi").pressEnter();



    }
}
