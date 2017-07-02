package com.udabol.superclean.pages.dashboard;

import com.udabol.superclean.pages.BasePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.udabol.superclean.framework.util.CommonMethods.clickWebElement;
import static com.udabol.superclean.framework.util.CommonMethods.getWebElementText;
import static com.udabol.superclean.framework.util.Constants.IMPLICIT_FAIL_WAIT_TIME;
import static com.udabol.superclean.framework.util.Constants.IMPLICIT_WAIT_TIME;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * This class represent the Dashboard page
 *
 * @autor Mijhail Villarroel, Bruno Barrios, Daniel Gonzales, Rosario Garcia.
 */
public class Dashboard extends BasePage {

    private static final Logger LOGGER = Logger.getLogger(Dashboard.class.getName());

    private static final String CREATE_WORKSPACE_BUTTON_WAS_NOT_FOUND_MSG = "Create Workspace Button was not found";

    @FindBy(css = ".nav.navbar-nav>li>a>font")
    private WebElement userNameText;

    @FindBy(css = ".dropdown-toggle")
    private WebElement catalogDropdown;

    @FindBy(xpath = "//div[2]/ul/li[6]/ul/li[2]/a")
    private WebElement catalogOption;

    @FindBy(css = "a[href='/accounts']")
    private WebElement accountOption;

    @FindBy(id = "create_new_project_button")
    private WebElement createProjectLink;

    @FindBy(id = "create_new_workspace_button")
    private WebElement createWorkspaceLink;

    @FindBy(id = "notice")
    private WebElement deleteMessageText;

    @FindBy(id = "notice")
    private WebElement messageDeleteWorkspace;

    @FindBy(id = "my_workspaces")
    private WebElement workspaceContainer;


    @FindBy(xpath = "*//div[2]/ul/li[3]/a")
    private WebElement clientPage;
    /**
     * @return
     */
//    public CreateProject clickCreateProjectLink() {
//        try {
//            wait.withTimeout(45, SECONDS);
//            clickWebElement(createProjectLink);
//        } catch (NoSuchElementException e) {
//            throw new NoSuchElementException("Create Project link was not found");
//        } finally {
//            wait.withTimeout(WAIT_TIME, SECONDS);
//        }
//        return new CreateProject();
//    }
//
//    /**
//     * @return CreateWorkspace()
//     */
//    public CreateWorkspace clickCreateWorkspaceLink() {
//
//        try {
//            wait.withTimeout(45, SECONDS);
//            clickWebElement(createWorkspaceLink);
//        } catch (NoSuchElementException e) {
//            throw new NoSuchElementException(CREATE_WORKSPACE_BUTTON_WAS_NOT_FOUND_MSG);
//        } finally {
//            wait.withTimeout(WAIT_TIME, SECONDS);
//        }
//        return new CreateWorkspace();
//    }
//
    /**
     * @return
     */
    public String getUserNameText() {
        String userName = "";
        try {
            driver.manage().timeouts().implicitlyWait(IMPLICIT_FAIL_WAIT_TIME, SECONDS);
            userName = userNameText.getText();
        } catch (NoSuchElementException e) {

        } finally {
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIME, SECONDS);
        }
        return userName;
    }
//
//    /**
//     * @return
//     */
//    public String getMessageTextDelete() {
//        return deleteMessageText.getText();
//    }
//
//    /**
//     * This method is used to enter to main page of
//     * project created using its name.
//     *
//     * @param projectName: This parameter is the project name of project created
//     * @return: return the project main page
//     */
//    public Project clickOnProject(String projectName) {
//        try {
//            driver.manage().timeouts().implicitlyWait(IMPLICIT_FAIL_WAIT_TIME, SECONDS);
//            WebElement projectNameLink = fluentWait(By.xpath("//a[contains(.,'" + projectName + "')]"));
//            projectNameLink.click();
//        } catch (NoSuchElementException e) {
//            LOGGER.warn("The Web element not was find ", e.getCause());
//            throw new NoSuchElementException("The Web element not was find ", e.getCause());
//        } finally {
//            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIME, SECONDS);
//        }
//        return new Project();
//    }
//
//    public WebElement fluentWait(final By locator){
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(30, TimeUnit.SECONDS)
//                .pollingEvery(5, TimeUnit.SECONDS)
//                .ignoring(NoSuchElementException.class);
//        WebElement projectLink = wait.until(
//                driver1 -> driver1.findElement(locator)
//        );
//        return  projectLink;
//    };
//
//    public Setting clickSettingsLink(String nameProjects) {
//        refreshPage();
//        WebElement taskElement = driver.findElement(By.xpath("//*[@class='hover_link settings' and @href=\"/projects/" + nameProjects + "/settings\"]"));
//        clickWebElement(taskElement);
//        return new Setting();
//    }
//
    public Catalog selectCatalog() {
        catalogDropdown.click();
        catalogOption.click();
        return new Catalog();
    }
//
//    public Workspace clickNameWorkspaceLink(String nameWorkspace) {
//        WebElement nameWorkspaceLink = driver.findElement(By.xpath("//a[contains(.,'" + nameWorkspace + "')]"));
//        nameWorkspaceLink.click();
//        return new Workspace();
//    }
//
//    public String getMessageDeleteWorkspace() {
//        return messageDeleteWorkspace.getText();
//    }
//
//    public void refreshPage() {
//        driver.navigate().refresh();
//    }
//
    public String getUserName(String value) {

        final String endPointProfile = "/me";
        final String fieldEmail = "email";
        final String fieldUserName = "username";
//        final String email = RequestManager.getRequest(endPointProfile).jsonPath().get(fieldEmail);
//        if (value.equalsIgnoreCase(email)) {
//            return RequestManager.getRequest(endPointProfile).jsonPath().get(fieldUserName);
//        }
        return value;
    }

    public Client goToClientPage() {
        clickWebElement(clientPage);
        return new Client();
    }
}
