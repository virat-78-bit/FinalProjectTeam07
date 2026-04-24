package stepDefinations;

import factory.BaseClass;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageObjects.Car_InsurancePage;
import pageObjects.Car_New_RegisterPage;
import pageObjects.HomePage;

import java.util.HashMap;
import java.util.List;

public class carInsuranceSteps {
    WebDriver driver;
    HomePage hp;
    Car_InsurancePage cip;
    Car_New_RegisterPage cnr;

    @Given("the user is on policy bazar page")
    public void the_user_is_on_policy_bazar_page() {
    }
    @Given("user than click on Car insurance Button")
    public void user_than_click_on_car_insurance_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user Enter the Car Number and click on view price")
    public void the_user_enter_the_car_number_and_click_on_view_price() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("capture the error message")
    public void capture_the_error_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("than proceed with the option of Brand new car")
    public void than_proceed_with_the_option_of_brand_new_car() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user redirected to new Car register page")
    public void user_redirected_to_new_car_register_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("fill all the required field like city, Brand, Model, fuel, varient")
    public void fill_all_the_required_field_like_city_brand_model_fuel_varient() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("than fill random mobile number and capture error message")
    public void than_fill_random_mobile_number_and_capture_error_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
