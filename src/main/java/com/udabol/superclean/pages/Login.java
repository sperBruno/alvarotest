package com.udabol.superclean.pages;

import com.udabol.superclean.framework.util.CommonMethods;
import com.udabol.superclean.framework.util.PropertiesInfo;
import com.udabol.superclean.pages.dashboard.Dashboard;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {

    private static final PropertiesInfo PROPERTIES_INFO = PropertiesInfo.getInstance();

    @FindBy(id = "username")
    private WebElement userNameTestField;

    @FindBy(id = "password")
    private WebElement passwordTestField;

    @FindBy(className = ".btn.btn-success")
    private WebElement singInButton;

    @FindBy(css = ".btn.btn-success")
    private WebElement buttonNext;

    public void setUserNameTestField(String username) {
        CommonMethods.setWebElement(userNameTestField, username);
    }

    public void setPasswordTestField(String password) {
        CommonMethods.setWebElement(passwordTestField, password);
    }

    public static Dashboard loginAs(String userName, String password) {
        Dashboard dashboard = new Dashboard();
        if (!dashboard.getUserNameText().equalsIgnoreCase(dashboard.getUserName(userName))) {
            SuperCleanHome pivotalHome = new SuperCleanHome();
            Login login = pivotalHome.clickSingInLink();
            login.setUserNameTestField(userName);
//            login.clickSignInButton();
            login.setPasswordTestField(password);
            return login.clickSignInButton();
        }
        return dashboard;
    }

    public void clickNextButton() {
        buttonNext.click();
    }

    public Dashboard clickSignInButton() {
        CommonMethods.clickWebElement(buttonNext);
        return new Dashboard();
    }

    public static Dashboard loginAsPrimaryUser() {
        return loginAs(PROPERTIES_INFO.getEmail(),
                PROPERTIES_INFO.getPassword());
    }
}
