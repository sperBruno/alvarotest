package com.udabol.superclean.pages;

import com.udabol.superclean.framework.util.PropertiesInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.udabol.superclean.framework.util.CommonMethods.clickWebElement;


/**
 * Created by mijhailvillarroel on 7/6/2016.
 */
public class SuperCleanHome extends BasePage {

    @FindBy(css = "a[href='http://localhost:8000/login']")
    private WebElement signInLink;

    public SuperCleanHome() {
        driver.get(PropertiesInfo.getInstance().getUrl());
    }

    public Login clickSingInLink() {
        clickWebElement(signInLink);
        return new Login();
    }
}
