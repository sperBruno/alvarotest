package com.udabol.superclean.pages.dashboard;

import com.udabol.superclean.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.udabol.superclean.framework.util.CommonMethods.clickWebElement;


/**
 * Created by mijhailvillarroel on 7/11/2016.
 */
public class ToolBar extends BasePage {

    @FindBy(css = ".tc_header_item.tc_header_logo")
    private WebElement returnDashboardLink;

    @FindBy(css = "[data-aid='navTab-settings']")
    private WebElement SettingsTabLink;

    public Dashboard clickReturnDashboardLink() {
        clickWebElement(returnDashboardLink);
        return new Dashboard();
    }

//    public Setting clickSettingTabLink() {
//        clickWebElement(SettingsTabLink);
//        return new Setting();
//    }
}