package com.udabol.superclean.cucumber.stepdefinition.catalog;

import com.udabol.superclean.pages.dashboard.Client;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import static com.udabol.superclean.framework.util.CommonMethods.quitProgram;

/**
 * Created by mijhailvillarroel on 6/30/2016.
 */
public class CatalogAssert {

    private CatalogStepDef projectsStepdefs;

    public CatalogAssert(CatalogStepDef projectsStepdefs) {
        this.projectsStepdefs = projectsStepdefs;
    }


    @Then("^I expect the userName is create sucessfully$")
    public void itIsExpectedThatTheDisplayUserName() {
        Client client = projectsStepdefs.getDashboard().goToClientPage();
        Assert.assertTrue("User is not present", client.isUserDisplayed("Alvaro2") );


        quitProgram("Leaving the web app");
    }


}
