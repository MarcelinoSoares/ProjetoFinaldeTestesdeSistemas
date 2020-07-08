package stepDefinitions;

import manager.DriverManager;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

public class Stepdefinitions {

    private WebDriver driver = DriverManager.getDriver();
    private MainPage mainPage;
}
