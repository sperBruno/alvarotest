package com.udabol.superclean.framework.util;

/**
 * This class will let us to use constants variables through the classes.
 * Created by brunobarrios on 7/13/2016.
 */
public final class Constants {

    public static final int IMPLICIT_PROJECT_WAIT = 30;

    public static final int IMPLICIT_WAIT_TIME = 15;

    public static final int WAIT_TIME = 30;

    public static final int LOAD_PAGE_TIME = 80;

    public static final int IMPLICIT_FAIL_WAIT_TIME = 8;

    public static final int DELETE_STATUS_CODE = 204;

    public static final int SUCCESS_STATUS_CODE = 200;

    public static final String PROJECTS_ENDPOINT = "/projects/";

    public static final String PROJECT_ID = "id";

    public static final String REGEX_INSIDE_BRACKETS = "[\\[]+[\\w.]+[^\\(]+\\]";

    public static final String REGEX_HALF_BRACKET = "[";

    public static final String REGEX_BRACKETS = "^\\[|\\]|\\.";

    public static final String ATTRIBUTE_WEB_ELEMENT = "value";

    public static final String WORKSPACES_ENDPOINT = "/my/workspaces/";

    public static final String WORKSPACE_ID = "id";

    public static final String ERROR_ACCOUNT_MESSAGE_TEXT = "please select or create an account for the new project";

    public static final String ERROR_PROJECT_TITLE_TEXT = "project name can't be blank";

    public static final String ELEMENT_COULD_NOT_BE_FOUND = "The element could not be found";

    public static final String DASHBOARD_URL = "https://www.pivotaltracker.com/dashboard";

    private Constants() {
    }
}
