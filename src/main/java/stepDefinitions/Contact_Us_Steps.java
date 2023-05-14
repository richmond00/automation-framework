package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Contact_Us_Steps {
    @Given("I access the webdriver university")
    public void i_access_the_webdriver_university() {
        System.out.println("Test1");
    }

    @When("I enter a first name")
    public void i_enter_a_first_name() {
        System.out.println("Test2");
    }

    @And("I enter a last name")
    public void i_enter_a_last_name() {
        System.out.println("Test3");
    }

    @And("I enter an email address")
    public void i_enter_an_email_address() {
        System.out.println("Test4");
    }

    @And("I enter a comment")
    public void i_enter_a_comment() {
        System.out.println("Test5");
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
        System.out.println("Test6");
    }

    @Then("I should be presented with the a successful contact us submission message")
    public void i_should_be_presented_with_the_a_successful_contact_us_submission_message() {
        System.out.println("Test7");
    }
}
