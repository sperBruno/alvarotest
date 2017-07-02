package com.udabol.superclean.framework.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Henrry Salinas.
 *
 * This class initialize the Firefox Selenium Web Driver
 */
public class Firefox implements IDriver {

    /**
     *{@inheritDoc}
     */
    @Override
    public WebDriver initDriver() {
        return new FirefoxDriver();
    }
}
