package com.gc.action;

//该类采用CGLIB代理机制
public class Logic2 {
	public void doInsert(String name) {
		// TODO Auto-generated method stub
       System.out.println("执行具体负责新增的业务逻辑");
       for(int i=0;i<3000000;i++)
       {}
	}

	public void doUpdate(String name) {
		// TODO Auto-generated method stub
		 System.out.println("执行具体负责修改的业务逻辑");
		 for(int i=0;i<3000000;i++)
		 {}
	}

	public void doDelete(String name) {
		// TODO Auto-generated method stub
		 System.out.println("执行具体负责删除的业务逻辑");
		 for(int i=0;i<3000000;i++)
		 {}
			 //i=i/0;//模拟异常发生
	}
}
