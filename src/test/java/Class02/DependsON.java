package Class02;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DependsON {

    @Test
    public void login(){
        System.out.println("i have looged in succesfully");
//        fail the test case
        System.out.println(0/0);
    }

    @Test(dependsOnMethods = "login")
    public  void verificationOfDashBoardPage(){

        System.out.println("i am on dashboard page");

    }
}