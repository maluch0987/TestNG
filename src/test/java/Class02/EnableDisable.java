package Class02;

import org.testng.annotations.Test;

public class EnableDisable {

    @Test(enabled = false)
    public void FirstTest(){
        System.out.println("hello! 1st test");

    }
    @Test
    public void SecondTest(){

        System.out.println("hello! 2nd test");
    }

    @Test(groups = "smoke")
    public void ThirdTest(){

        System.out.println("hello! 3rd test");
    }


}
