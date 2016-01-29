package com.loteriada.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.Calendar;

/**
 * Created by Tomek on 05.01.2016.
 */
public class FormObjects {
    private WebDriver driver;

    @FindBy(how = How.ID, using = "nr_kasy_1")
    private WebElement CashRegisterNumberElement;

    @FindBy(how = How.ID, using = "nip_1")
    private WebElement nip1element;

    @FindBy(how = How.ID, using = "nip_2")
    private WebElement nip2element;

    @FindBy(how = How.ID, using = "nip_3")
    private WebElement nip3element;

    @FindBy(how = How.ID, using = "nip_4")
    private WebElement nip4element;

    @FindBy(how = How.ID, using = "nip_5")
    private WebElement nip5element;

    @FindBy(how = How.ID, using = "nip_6")
    private WebElement nip6element;

    @FindBy(how = How.ID, using = "nip_7")
    private WebElement nip7element;

    @FindBy(how = How.ID, using = "nip_8")
    private WebElement nip8element;

    @FindBy(how = How.ID, using = "nip_9")
    private WebElement nip9element;

    @FindBy(how = How.ID, using = "nip_10")
    private WebElement nip10element;

    @FindBy(how = How.ID, using = "rok")
    private WebElement yearElement;

    @FindBy(how = How.ID, using = "miesiac")
    private WebElement monthElement;

    @FindBy(how = How.ID, using = "dzien")
    private WebElement dayElement;

    @FindBy(how = How.ID, using = "nr_wydruku")
    private WebElement billNumberElement;

    @FindBy(how = How.ID, using = "kwota_zl")
    private WebElement zloteElement;

    @FindBy(how = How.ID, using = "kwota_gr")
    private WebElement groszeElement;

    @FindBy(how = How.ID, using = "branza")
    private WebElement selectIndustryElement;

    @FindBy(how = How.ID, using = "email")
    private WebElement email1element;

    @FindBy(how = How.ID, using = "email_2")
    private WebElement email2element;

    @FindBy(how = How.ID, using = "nr_tel_1")
    private WebElement phon1element;

    @FindBy(how = How.ID, using = "nr_tel_2")
    private WebElement phon2element;

    @FindBy(how = How.ID, using = "nr_tel_3")
    private WebElement phon3element;

    @FindBy(how = How.ID, using = "nr_tel_4")
    private WebElement phon4element;

    @FindBy(how = How.ID, using = "nr_tel_5")
    private WebElement phon5element;

    @FindBy(how = How.ID, using = "nr_tel_6")
    private WebElement phon6element;

    @FindBy(how = How.ID, using = "nr_tel_7")
    private WebElement phon7element;

    @FindBy(how = How.ID, using = "nr_tel_8")
    private WebElement phon8element;

    @FindBy(how = How.ID, using = "nr_tel_9")
    private WebElement phon9element;

    @FindBy(how = How.ID, using = "captcha-operation")
    private WebElement captchaElement;

    @FindBy(how = How.ID, using = "captcha-input")
    private WebElement captchaInputElement;

    @FindBy(how = How.XPATH, using = "//form/div[11]/div")
    private WebElement confirmRegulationsElement;

    @FindBy(how = How.XPATH, using = "//form/div[15]/div")
    private WebElement checkedElement;

    @FindBy(how = How.XPATH, using = "//form/button")
    private WebElement sendBillElelemnt;

    @FindBy(how = How.CLASS_NAME, using = "cookies_close")
    private WebElement closeCookiesElement;

    @FindBy(how = How.XPATH, using = "//span[@class=\"popup-exit\"]")
    private WebElement closePopUpElement;

    @FindBy(how = How.XPATH, using = "//a[@class=\"zglos\"]")
    private WebElement confirmSendElement;

    public void acceptCookies() {
        closeCookiesElement.click();
    }

    public void inputCashRegisterNumber(String CashRegisterNumber) {
        CashRegisterNumberElement.sendKeys(CashRegisterNumber);
    }

    public void inputNip(String nip) {
        String replace = nip.replace("-", "");
        char nip1 = replace.charAt(0);
        nip1element.sendKeys(Character.toString(nip1));

        char nip2 = replace.charAt(1);
        nip2element.sendKeys(Character.toString(nip2));

        char nip3 = replace.charAt(2);
        nip3element.sendKeys(Character.toString(nip3));

        char nip4 = replace.charAt(3);
        nip4element.sendKeys(Character.toString(nip4));

        char nip5 = replace.charAt(4);
        nip5element.sendKeys(Character.toString(nip5));

        char nip6 = replace.charAt(5);
        nip6element.sendKeys(Character.toString(nip6));

        char nip7 = replace.charAt(6);
        nip7element.sendKeys(Character.toString(nip7));

        char nip8 = replace.charAt(7);
        nip8element.sendKeys(Character.toString(nip8));

        char nip9 = replace.charAt(8);
        nip9element.sendKeys(Character.toString(nip9));

        char nip10 = replace.charAt(9);
        nip10element.sendKeys(Character.toString(nip10));
    }

    public void inputDate(String day) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        yearElement.sendKeys(Integer.toString(year));

        Calendar rightNow = Calendar.getInstance();
        java.text.SimpleDateFormat month = new java.text.SimpleDateFormat("MM");
        monthElement.sendKeys(month.format(rightNow.getTime()));

        dayElement.sendKeys(day);
    }

    public void inputBillNumber(String inputBillNumber) {
        billNumberElement.sendKeys(inputBillNumber);
    }

    public void inputZlote(String zlote) {
        zloteElement.sendKeys(zlote);
    }

    public void inputGrosze(String grosze) {
        groszeElement.sendKeys(grosze);
    }

    public void selectIndustry(String industry) {
        Select selectIndustry = new Select(selectIndustryElement);
        selectIndustry.selectByVisibleText(industry);
    }

    public void inputEmail(String email) {
        email1element.clear();
        email2element.clear();
        email1element.sendKeys(email);
        email2element.sendKeys(email);
    }

    public void inputPhoneNumber(String phoneNumber) {
        char tel1 = phoneNumber.charAt(0);
        phon1element.sendKeys(Character.toString(tel1));

        char tel2 = phoneNumber.charAt(1);
        phon2element.sendKeys(Character.toString(tel2));

        char tel3 = phoneNumber.charAt(2);
        phon3element.sendKeys(Character.toString(tel3));

        char tel4 = phoneNumber.charAt(3);
        phon4element.sendKeys(Character.toString(tel4));

        char tel5 = phoneNumber.charAt(4);
        phon5element.sendKeys(Character.toString(tel5));

        char tel6 = phoneNumber.charAt(5);
        phon6element.sendKeys(Character.toString(tel6));

        char tel7 = phoneNumber.charAt(6);
        phon7element.sendKeys(Character.toString(tel7));

        char tel8 = phoneNumber.charAt(7);
        phon8element.sendKeys(Character.toString(tel8));

        char tel9 = phoneNumber.charAt(8);
        phon9element.sendKeys(Character.toString(tel9));
    }

    public void solvePuzzle() throws InterruptedException {
        String puzzle = captchaElement.getText();
        String parts[] = puzzle.split("\\+");
        int element1 = Integer.parseInt(parts[0]);
        int element2 = Integer.parseInt(parts[1]);
        int sum = element1 + element2;
        captchaInputElement.sendKeys(Integer.toString(sum));
    }

    public void confirmOptions() {
        confirmRegulationsElement.click();
        checkedElement.click();
    }

    public void sendForm() throws InterruptedException {
        sendBillElelemnt.click();
        Thread.sleep(3000);
    }

    public void confirmSend() {
        if (closePopUpElement.isDisplayed()) {
            closePopUpElement.click();
        } else {
            confirmSendElement.click();
        }
    }
}
