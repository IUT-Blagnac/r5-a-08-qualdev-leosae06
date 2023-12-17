package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;


class IsItFriday{

    static String isItFriday(String today) {
    if ("Friday".equals(today)) {
        return "TGIF";
    } else {
        return "Nope";
    }
}

}




public class StepDefinitions {

    private String today;
    private String actualAnswer;

     @Given("today is Sunday")
    public void today_is_Sunday() {
        today = "Sunday";
        
    }


    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = "friday";
       
    }



    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
    assertEquals(expectedAnswer, IsItFriday.isItFriday(today));
    }


    @Given("today is Friday")
    public void today_is_friday() {
    today = "Friday";
}

}