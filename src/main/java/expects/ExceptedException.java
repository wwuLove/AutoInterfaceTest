package expects;

import org.testng.annotations.Test;

public class ExceptedException {
    /**
     * ʲôʱ����õ��쳣����
     * �������������Ϊĳһ���쳣��ʱ��
     * ���磺���Ǵ�����ĳЩ���Ϸ��Ĳ����������׳����쳣
     * Ҳ����˵�ҵĲ��Խ����������쳣
     */
    @Test(expectedExceptions = RuntimeException.class)
    public  void runTimeExceptionFailed(){
        System.out.println("����һ��ʧ�ܵ��쳣����");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void  runTimeExceptionSuccess(){
        System.out.println("�����ҵ��쳣����");
        throw new RuntimeException();

    }

}
