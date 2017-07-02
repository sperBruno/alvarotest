package com.udabol.superclean.cucumber.stepdefinition.login;

import cucumber.api.java.en.Then;
import org.junit.Assert;

import static com.udabol.superclean.framework.util.CommonMethods.quitProgram;

/**
 * Created by mijhailvillarroel on 6/30/2016.
 */
public class LoginAssert {

    private LoginStepDef projectsStepdefs;

    public LoginAssert(LoginStepDef projectsStepdefs) {
        this.projectsStepdefs = projectsStepdefs;
    }


    @Then("^I expect the userName is displayed$")
    public void itIsExpectedThatTheDisplayUserName() {
        final String endPointProfile = "/me";
        final String fieldUsername = "username";
        final String expectUserName = "Bienvenid@: (Administrador) admin";
        Assert.assertEquals(expectUserName, projectsStepdefs.getDashboard().getUserNameText());

//
    }
}
