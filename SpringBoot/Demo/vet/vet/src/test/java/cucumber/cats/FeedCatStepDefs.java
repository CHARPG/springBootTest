package cucumber.cats;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeedCatStepDefs {

    boolean isHungry;
    @Given("the cat is hungry")
    public void cat_is_hungry()
    {
        isHungry = true;
    }
    @When("I try to feed the cat")
    public void feed_cat()
    {
        isHungry = false;
    }
    @Then("the cat should no longer be hungry")
    public void cat_hungry()
    {
        assertEquals(false, isHungry);
    }
}
