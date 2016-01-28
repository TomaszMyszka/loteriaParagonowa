package com.loteriada.stepDefs;

import com.loteriada.pageObjects.FormObjects;
import com.loteriada.runner.PageCommon;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Tomek on 05.01.2016.
 */
public class StepDefs {
    private static WebDriver driver;

    private PageCommon automation = PageCommon.getInstance();

    @Before
    public void setUp() throws Exception {
        driver=automation.openBrowser();
    }

    @Given("^Wchodze na strone loteriady$")
    public void goToLoteriadaPage() throws Throwable {
        driver.get("https://loteriaparagonowa.gov.pl/");
        PageFactory.initElements(driver, FormObjects.class).acceptCookies();
    }

    @When("^Wpisuje nr kasy \"([^\"]*)\"$")
    public void iInputCashRegisterNumber(String CashRegisterNumber) throws Throwable {
        PageFactory.initElements(driver, FormObjects.class).inputCashRegisterNumber(CashRegisterNumber);
    }

    @And("^Wpisuje nip \"([^\"]*)\"$")
    public void iInputNip(String nip) throws Throwable {
        PageFactory.initElements(driver, FormObjects.class).inputNip(nip);
    }

    @And("^Wpisuje dzien \"([^\"]*)\"$")
    public void iInputDay(String day) throws Throwable {
        PageFactory.initElements(driver, FormObjects.class).inputDate(day);
    }

    @And("^Wpisuje numer paragonu \"([^\"]*)\"$")
    public void iInputBillNumber(String billNumber) throws Throwable {
        PageFactory.initElements(driver, FormObjects.class).inputBillNumber(billNumber);
    }


    @And("^Wpisuje zlote \"([^\"]*)\"$")
    public void iInputZlote(String zlote) throws Throwable {
        PageFactory.initElements(driver, FormObjects.class).inputZlote(zlote);
    }


    @And("^Wpisuje grosze \"([^\"]*)\"$")
    public void iInputGrosze(String grosze) throws Throwable {
        PageFactory.initElements(driver, FormObjects.class).inputGrosze(grosze);
    }

    @And("^Wybieram branze \"([^\"]*)\"$")
    public void iInputIdustry(String industry) throws Throwable {
        PageFactory.initElements(driver, FormObjects.class).selectIndustry(industry);
    }

    @And("^Wpisuje email \"([^\"]*)\"$")
    public void iInputEmail(String email) throws Throwable {
        PageFactory.initElements(driver, FormObjects.class).inputEmail(email);
    }


    @And("^Wpisuje numer telefonu \"([^\"]*)\"$")
    public void iInputPhoneNumber(String phoneNumber) throws Throwable {
        PageFactory.initElements(driver, FormObjects.class).inputPhoneNumber(phoneNumber);
    }

    @And("^Rozwiazuje zagadke$")
    public void iSolvePuzzle() throws Throwable {
        PageFactory.initElements(driver, FormObjects.class).solvePuzzle();
    }

    @And("^Potwierdzam opcje$")
    public void iConfirmOptions() throws Throwable {
        PageFactory.initElements(driver, FormObjects.class).confirmOptions();
    }

    @And("^Wysylam formularz$")
    public void iSendForm() throws Throwable {
        PageFactory.initElements(driver, FormObjects.class).sendForm();
    }

    @And("^Potwierdzam wyslanie$")
    public void iConfirmSend() throws Throwable {
        PageFactory.initElements(driver, FormObjects.class).confirmSend();
    }
}
