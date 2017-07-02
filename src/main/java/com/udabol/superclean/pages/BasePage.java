package com.udabol.superclean.pages;

import com.udabol.superclean.framework.selenium.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.udabol.superclean.framework.util.Constants.WAIT_TIME;


public abstract class BasePage {

    protected WebDriver driver;

    protected WebDriverWait wait;

    protected Actions action;

    public BasePage() {
        driver = DriverManager.getInstance().getDriver();
        wait = new WebDriverWait(driver, WAIT_TIME);
        action = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }
}
