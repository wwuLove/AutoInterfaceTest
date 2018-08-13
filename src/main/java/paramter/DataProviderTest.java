package paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @Test(dataProvider = "data1")
    public void testDataProvider(String name,int age){
        System.out.println("name :"+ name + "\n" + "age :" +age);
    }

    @DataProvider(name = "data1")
    public Object[][] dataProvider(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }
}
