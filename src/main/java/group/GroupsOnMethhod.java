package group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethhod {
	
	
	@Test(groups = "server")
	public void test1(){
		System.out.println("���Ƿ������Ĳ��Է���11111");
	}
	
	@Test(groups = "server")
	public void test2(){
		System.out.println("���Ƿ������Ĳ��Է���22222");
	}
	
	@Test(groups = "client")
	public void test3(){
		System.out.println("���ǿͻ�����Ĳ��Է���33333");
	}
	
	@Test(groups = "client")
	public void test4(){
		System.out.println("���ǿͻ�����Ĳ��Է���44444");
	}
	
	@BeforeGroups("server")
	public void beforeGroupsOnServer(){
		System.out.println("���Ƿ����������֮ǰ���еķ���");
	}
	
	@AfterGroups("server")
	public void afterGroupsOnServer(){
		System.out.println("���Ƿ����������֮�����еķ���");
	}

}
