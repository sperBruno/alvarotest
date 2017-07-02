package com.udabol.superclean.pages.dashboard;

import com.udabol.superclean.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.udabol.superclean.framework.util.CommonMethods.clickWebElement;
import static com.udabol.superclean.framework.util.CommonMethods.setWebElement;

/**
 * Created by bruno on 2/7/2017.
 */
public class Catalog  extends BasePage {
    @FindBy(css = "#btnshow")
    private WebElement addClientBtn;

    @FindBy(css = "#ci_nit")
    private WebElement ciNitTxt;

    @FindBy(css = "#nombre")
    private WebElement nombreTxt;

    @FindBy(css = "#ap_paterno")
    private WebElement apPaternoTxt;

    @FindBy(css = "#ap_materno")
    private WebElement apMaternoTxt;

    @FindBy(css = "#telefono")
    private WebElement telefonoTxt;

    @FindBy(css = ".btn.btn-primary")
    private WebElement saveBtn;



    public void clickAddClientBtn() {
        clickWebElement(addClientBtn);
    }

    public void addingNewClient(String nombre, String apMaterno, String apPaterno, String telf, String ciNit) {
        setWebElement(nombreTxt, nombre);
        setWebElement(apMaternoTxt, apMaterno);
        setWebElement(apPaternoTxt, apPaterno);
        setWebElement(telefonoTxt, telf);
        setWebElement(ciNitTxt, ciNit);
        clickWebElement(saveBtn);
    }


}
