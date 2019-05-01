package com.z2h.demo.bdd.steps;

import com.z2h.demo.bdd.BaseIntegrationTest;
import com.z2h.demo.bdd.steps.helper.BddDatabaseHelper;
import com.z2h.demo.service.UserService;
import com.z2h.demo.service.UserServiceImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/*
    Given the user has login credentials
      And setup clean & fresh test data
    When they input their credentials
      And select "Sign In"
    Then they will be given access to the client portal
    Then they will be brought to the MIM Institutional home page
    Then cleanup demo test data
 */
@Ignore
public class LoginFeatureTestSteps extends BaseIntegrationTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginFeatureTestSteps.class);

    @Autowired
    UserService userService;

    @Autowired
    private BddDatabaseHelper bddDatabaseHelper;

    @Given("^the user has login credentials$")
    public void user_has_login_credentials() throws Throwable {
        LOGGER.info("++ GIVEN -> user_has_login_credentials()");
        LOGGER.info("-- GIVEN -> user_has_login_credentials()");
    }

    @When("^they input their credentials$")
    public void they_input_their_credentials() throws Throwable {
        LOGGER.info("++ WHEN -> they_input_their_credentials()");
        LOGGER.info("-- WHEN -> they_input_their_credentials()");
    }

    @Then("^select \"Sign In\"$")
    public void select_sign_in() throws Throwable {
        LOGGER.info("++ THEN -> select_sign_in()");
        invokeSignIn();
        LOGGER.info("-- select_sign_in()");
    }

    @Then("^they will be given access to the client portal$")
    public void they_will_be_given_access_to_client_portal() throws Throwable {
        LOGGER.info("++ THEN -> they_will_be_given_access_to_client_portal()");
        LOGGER.info("-- they_will_be_given_access_to_client_portal()");
    }

    @Then("^they will be brought to the MIM Institutional home page$")
    public void go_to_home_page() throws Throwable {
        LOGGER.info("++ THEN -> go_to_home_page()");
        LOGGER.info("-- go_to_home_page()");
    }

    private boolean invokeSignIn() {
        // Some call to actual service to perform some action under test
        LOGGER.info("Sign In invoked.");
        return true;
    }
}
