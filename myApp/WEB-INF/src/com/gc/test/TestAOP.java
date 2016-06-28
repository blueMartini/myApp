package com.gc.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.gc.impl.LogicInterface;
import com.gc.action.Logic2;
public class TestAOP {

	public static void main(String[] args) throws InstantiationException,IllegalAccessException,
	  ClassNotFoundException{
		// TODO Auto-generated method stub
        ApplicationContext actx=new FileSystemXmlApplicationContext("exception_config.xml");
        LogicInterface logic=(LogicInterface)actx.getBean("logProxy1");
        //Logic2 logic=(Logic2)actx.getBean("logProxy2");
        try{
        	logic.doInsert("张三");
        	logic.doUpdate("李四");
        	logic.doDelete("王五");
        }
        catch(Exception ex)
        {
        	
        }
        
	}

}
