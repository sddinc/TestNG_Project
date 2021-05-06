package com.trycloud.tests.tasks.cybertek;

import com.github.javafaker.Faker;
import com.trycloud.tests.base.BaseCybertekPage;
import com.trycloud.tests.pages.cybertek.CybertekHomePage;
import com.trycloud.tests.pages.cybertek.RegistrationFormPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationFormTest extends BaseCybertekPage {
    CybertekHomePage cybertek=new CybertekHomePage();
    Faker faker=new Faker();
    RegistrationFormPage write=new RegistrationFormPage();
    Select select;
    @Test(description = "1. Open browser\n" +
            "2. Go to website: http://practice.cybertekschool.com/registration_form\n" +
            "3. Enter first name\n" +
            "4. Enter last name\n" +
            "5. Enter username\n" +
            "6. Enter email address\n" +
            "7. Enter password\n" +
            "8. Enter phone number\n" +
            "9. Select a gender from radio buttons\n" +
            "10. Enter date of birth\n" +
            "11. Select Department/Office\n" +
            "12. Select Job Title\n" +
            "13. Select programming language from checkboxes\n" +
            "14. Click to sign up button\n" +
            "15.Verify success message “You’ve successfully completed registration.” is\n" +
            "displayed.")

    public void registrationFormVerification(){
        cybertek.clickRegistrationLink();
        write.sendText("firstname",faker.name().firstName());
        write.sendText("lastname",faker.name().lastName());
        String userName=faker.name().username();
        System.out.println(userName);
        userName=userName.replaceAll("."," ");
        write.sendText("username","userName");
        System.out.println(userName);
        write.sendText("email",faker.internet().emailAddress());
        write.sendText("password",faker.internet().password());
        write.sendText("phone","571-123-5858");

        write.chooseGender(faker.demographic().sex().toLowerCase());

        write.sendText("birthday","12/12/1984");
        write.selectDropDown("Department of Engineering","department");
        write.selectDropDown("Manager","job_title");
        write.chooseGender("java");
        write.signUp();

        Assert.assertTrue(write.isTestDisplay());




    }
}
