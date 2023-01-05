package com.zerobank.stepdefinitions;

import com.zerobank.pages.AddNewPayeePages;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AddNewPayeeSD {
    AddNewPayeePages newPayeePages = new AddNewPayeePages();

    @And("creates new payee using following information")
    public void createsNewPayeeUsingFollowingInformation(Map<String, String> credentials) {
        BrowserUtils.addInfo(credentials.get("Payee Name"), credentials.get("Payee Address"),credentials.get("Account"),credentials.get("Payee details"));
        newPayeePages.addButton.click();
    }

    @And("creates new payee using following information without Payee Name")
    public void createsNewPayeeUsingFollowingInformationWithoutPayeeName(Map<String, String> credentials) {
        BrowserUtils.addInfoWithEmptyField(credentials.get("Payee Address"),credentials.get("Account"),credentials.get("Payee details"));
        newPayeePages.addButton.click();

    }
    @Then("validation {string} should be displayed")
    public void validationShouldBeDisplayed(String expectedMessage) {
        String actualMessage = newPayeePages.message.getText();
        assertEquals(expectedMessage, actualMessage);
    }

    @Then("error {string} should be displayed")
    public void errorShouldBeDisplayed(String expectedMessage) {
        String actualMessage = newPayeePages.payeeName.getAttribute("validationMessage");
//        System.out.println("expectedMessage = " + expectedMessage);
//        System.out.println("actualMessage = " + actualMessage);
//        String size = newPayeePages.payeeName.getAttribute("size");
//        System.out.println("size = " + size);
        assertEquals(expectedMessage, actualMessage);
    }
}
