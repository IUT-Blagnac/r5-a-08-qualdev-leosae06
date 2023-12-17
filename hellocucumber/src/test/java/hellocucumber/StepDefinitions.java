package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsItFriday {

    static String isItFriday(String today) {
        if ("Friday".equalsIgnoreCase(today)) {
            return "TGIF";
        } else {
            return "Nope";
        }
    }

}

public class StepDefinitions {

    private String today;
    private String actualAnswer;

    @Given("today is {string}")
    public void today_is(String day) {
        today = day;
    }

    @Given("today is Sunday")
    public void today_is_sunday() {
    today = "Sunday";
    }

    @Given("today is Friday")
    public void today_is_friday() {
        today = "Friday";
    }

    @Given("today is Monday")
    public void today_is_monday() {
        today = "Monday";
    }

    @Given("today is Tuesday")
    public void today_is_tuesday() {
        today = "Tuesday";
    }

    @Given("today is Wednesday")
    public void today_is_wednesday() {
        today = "Wednesday";
    }

    @Given("today is Thursday")
    public void today_is_thursday() {
        today = "Thursday";
    }

    @Given("today is Saturday")
    public void today_is_saturday() {
       today = "Saturday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

}