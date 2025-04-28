package com.phonbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelperHomework extends BaseHelperHomework{

    public UserHelperHomework(WebDriver driver) {
        super(driver);
    }

    protected void fillRagesterLoginForm(NewUserHomework newUserHomework) {
        type(By.id("FirstName"), newUserHomework.getFirstName());
        type(By.id("LastName"), newUserHomework.getConfirmPassword());
        type(By.id("Email"), newUserHomework.getEmail());
        type(By.id("Password"), newUserHomework.getPassword());
        type(By.id("ConfirmPassword"), newUserHomework.getConfirmPassword());
    }
}
