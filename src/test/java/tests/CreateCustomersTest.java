package tests;

import models.CustomerModel;
import org.testng.annotations.Test;
import pages.CustomerPage;
import pages.LoginPage;
import pages.ManagerPage;
import sharedData.SharedData;

import java.util.Arrays;
import java.util.List;

public class CreateCustomersTest extends SharedData {

    @Test
    public void automationTest(){
        CustomerModel testData = new CustomerModel("src/test/resources/CustomersData.json");

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.logInBankManager();

        ManagerPage managerPage = new ManagerPage(getDriver());
        managerPage.createCustomer();

        List<String> firstirstNameValueList = Arrays.asList("Mihaela1", "Mihaela2", "Mihaela3");
        List<String> lastNameValueList = Arrays.asList("Moga1", "Moga2", "Moga3");
        List<String> postCodeValueList = Arrays.asList("550362A", "550362B", "550362C");

        CustomerPage customerPage = new CustomerPage(getDriver());
        customerPage.createCustomersProcess(firstirstNameValueList, lastNameValueList, postCodeValueList);
    }
}
