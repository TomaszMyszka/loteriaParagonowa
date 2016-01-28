package com.loteriada.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Tomek on 28.01.2016.
 */
public class PageCommon {
    private static PageCommon instance = null;
    private WebDriver driver;
    private WebDriver Mozilla = null;

    private PageCommon() {
    }

    public WebDriver openBrowser() {
        if (Mozilla == null) {
            driver = new FirefoxDriver();
            Mozilla = driver;
        } else if (Mozilla != null) {
            driver = Mozilla;
        }
        driver.manage().window().maximize();
        driver.get("https://loteriaparagonowa.gov.pl/");
        return driver;
    }

    public static PageCommon getInstance() {
        if (instance == null) {
            instance = new PageCommon();
        }
        return instance;
    }
}
