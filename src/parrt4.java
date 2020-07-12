import org.testng.annotations.*;

public class parrt4 {

    @BeforeClass
    public void bclass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before Method");
    }

    @Test
    public void Test1(){
        System.out.println("Test 1");
    }

    @Test
    public void Test2(){
        System.out.println("Test 2");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("After Method");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("After class");
    }

}
