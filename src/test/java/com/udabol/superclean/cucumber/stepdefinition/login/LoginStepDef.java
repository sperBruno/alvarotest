package com.udabol.superclean.cucumber.stepdefinition.login;

import com.udabol.superclean.pages.dashboard.Dashboard;
import cucumber.api.java.en.When;

import static com.udabol.superclean.pages.Login.loginAsPrimaryUser;

/**
 * Created by mijhailvillarroel on 7/6/2016.
 */
public class LoginStepDef {

    private Dashboard dashboard;

    @When("^I login with valid credentials$")
    public void iLoginWithValidCredentials() {
        dashboard = loginAsPrimaryUser();
        dashboard.refreshPage ();
    }

    public Dashboard getDashboard() {
        return dashboard;
    }
}
