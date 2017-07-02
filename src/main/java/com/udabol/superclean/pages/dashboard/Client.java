package com.udabol.superclean.pages.dashboard;

import com.udabol.superclean.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.udabol.superclean.framework.util.CommonMethods.clickWebElement;
import static com.udabol.superclean.framework.util.CommonMethods.isElementPresent;

/**
 * Created by bruno on 2/7/2017.
 */
public class Client extends BasePage {
//



    public boolean isUserDisplayed(String userName) {
        WebElement user = driver.findElement(By.xpath(".//*/font[text()='" + userName + "']"));
        return isElementPresent(user);
    }
}
