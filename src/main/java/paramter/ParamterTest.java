package paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {

    @Test
    @Parameters({"names","age"})
    public  void paramtertest1(String names,int age){
        System.out.println("name :"+ names + "\n" + "age :" +age);
    }
}
