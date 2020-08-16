package stepDefinitions;

import io.cucumber.java.Before;
import manager.DriverManager;

public class Hooks {

    @Before(order = 1)
    public void firstBeforeScenario() {
        System.out.println("BEFORE1");
        DriverManager.getDriver();
    }

    @Before(order = 2)
    public void secondBeforeScenario() {
        System.out.println("BEFORE2");
        DriverManager.endSession();
    }

    @Before(order = 3)
    public void thirdBeforeScenario() {
        System.out.println("BEFORE3");
        DriverManager.endSession();
    }

    @Before(order = 4)
    public void fourBeforeScenario() {
        System.out.println("BEFORE4");
        DriverManager.endSession();
    }

    }