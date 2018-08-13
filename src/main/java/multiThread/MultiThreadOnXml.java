package multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void testt2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
