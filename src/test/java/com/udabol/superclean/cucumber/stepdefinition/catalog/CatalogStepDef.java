package com.udabol.superclean.cucumber.stepdefinition.catalog;

import com.udabol.superclean.pages.dashboard.Catalog;
import com.udabol.superclean.pages.dashboard.Dashboard;
import cucumber.api.java.en.When;

import static com.udabol.superclean.pages.Login.loginAsPrimaryUser;

/**
 * Created by mijhailvillarroel on 7/6/2016.
 */
public class CatalogStepDef {

    private Dashboard dashboard;
    private Catalog catalog;

    @When("^I am on catalog page$")
    public void goToCatalogPage() {
//        dashboard = loginAsPrimaryUser();
//        dashboard.refreshPage ();
        dashboard = new Dashboard();
        catalog = dashboard.selectCatalog();

//        dashboard.refreshPage ();
    }

    @When("^I insert a user client information$")
    public void addNewUser() {
        catalog.clickAddClientBtn();
        catalog.addingNewClient("Alvaro2", "Yugar", "Gutierrez", "321635456", "316541");
    }

    public Dashboard getDashboard() {
        return dashboard;
    }
}
