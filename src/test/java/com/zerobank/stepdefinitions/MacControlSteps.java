package com.zerobank.stepdefinitions;

import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;


public class MacControlSteps {

    @Given("Shutdown")
    public void shutdown() {
            BrowserUtils.shutdownMac();
        }


    @Given("Restart")
    public void restart() {

        BrowserUtils.restartMac();

    }


    @Given("ShutdownTimer {int} seconds")
    public void shutdownTimer(int delaySeconds) {
        BrowserUtils.shutdownMacTimer(delaySeconds);
    }

    @Given("RestartTimer {int} seconds")
    public void restartTimer(int delaySeconds) {
        BrowserUtils.restartMacTimer(delaySeconds);
    }

}
