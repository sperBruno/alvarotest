package com.udabol.superclean.framework.util;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Map;
import com.udabol.superclean.framework.selenium.DriverManager;


/**
 * Created by mijhailvillarroel on 7/14/2016.
 */
public final class CommonMethods {

private final static WebDriverWait WEB_DRIVER_WAIT = DriverManager.getInstance().getWait();

    private CommonMethods() {
    }

    public static boolean isElementPresent(WebElement webElement) {
        try {
            webElement.getTagName();
            return true;
        } catch (WebDriverException e) {
            return false;
        }
    }

    public static void setWebElement(WebElement webElement, String text) {
        WEB_DRIVER_WAIT.until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(text);
    }

    public static void clickWebElement(WebElement webElement) {
        WEB_DRIVER_WAIT.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    public static String getWebElementText(WebElement webElement) {
        WEB_DRIVER_WAIT.until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }

    public static void setCheckBox(WebElement webElement, boolean enable) {
        if (enable) {
            unCheckBox(webElement);
        } else {
            checkBox(webElement);
        }
    }

    private static void unCheckBox(WebElement webElement) {
        if (!webElement.isSelected()) {
            webElement.click();
        }
    }

    private static void checkBox(WebElement webElement) {
        if (webElement.isSelected()) {
            webElement.click();
        }
    }

    public static void selectAElementComboBox(WebElement webElementSelect, String element) {
        Select oSelect = new Select(webElementSelect);
        oSelect.selectByValue(element);
    }

    public static Select convertASelect(WebElement webElement) {
        return new Select(webElement);
    }

//    public static void deleteAllProjects() {
//        ArrayList<Map<String, ?>> jsonAsArrayList = from(getRequest(PROJECTS_ENDPOINT).asString()).get("");
//        if (jsonAsArrayList.size() > 0) {
//            for (Map<String, ?> object : jsonAsArrayList) {
//                deleteRequest(PROJECTS_ENDPOINT + object.get(PROJECT_ID).toString());
//            }
//        }
//    }

//    public static void deleteAllWorkspaces() {
//        ArrayList<Map<String, ?>> jsonAsArrayList = from(getRequest(WORKSPACES_ENDPOINT).asString()).get("");
//        if (jsonAsArrayList.size() > 0) {
//            for (Map<String, ?> object : jsonAsArrayList) {
//                deleteRequest(WORKSPACES_ENDPOINT + object.get(WORKSPACE_ID).toString());
//            }
//        }
//    }

//    public static void deleteAccounts(){
//        DriverManager.getInstance().getDriver().get("https://www.pivotaltracker.com/accounts");
//        Accounts accounts=new Accounts();
//        try {
//            while(isElementPresent(accounts.getManageAccountBtn())){
//                AccountSetting accountSetting = accounts.manageAccount().clickSettingTab();
//                accounts= accountSetting.deleteAccount();
//            }
//            CreateAccountForm createAccountForm=accounts.clickNewAccountBtn();
//            createAccountForm.setAccountNameTextField("SYSTEM");
//            createAccountForm.clickCreateAccountBtn();
//            DriverManager.getInstance().getDriver().get("https://www.pivotaltracker.com/dashboard");
//        }catch (NullPointerException e){
//            throw new NoSuchElementException("Element not found");
//        }
//        DriverManager.getInstance().getDriver().get("https://www.pivotaltracker.com/dashboard");
//    }

    public static void quitProgram(String message){
        System.err.println(message);
        DriverManager.getInstance().getDriver().close();
//        Runtime.getRuntime().exit(1);
    }
}
