package com.gc.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
//import com.gc.action.HelloWorld;

//import java.util.Calendar;
//import java.util.Locale;
//import com.gc.impl.Hello;
import com.gc.action.TimeBook;
import com.gc.action.TimeBookProxy;
import com.gc.impl.TimeBookInterface;
public class TestHelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext actx=new FileSystemXmlApplicationContext("config.xml");
        
        TimeBookInterface timeBookProxy=(TimeBookInterface)actx.getBean("logProxy");
        timeBookProxy.doCheck("张三");
        /*Object[] objs=new Object[]{"HelloWorld",Calendar.getInstance().getTime()};
        //国际化支持
        String msg=actx.getMessage("HelloWorld", objs, Locale.US);*/
        //HelloWorld hello=(HelloWorld)actx.getBean("HelloWorld");
        //System.out.println(hello.getDate()+" "+hello.getMsg());
        //System.out.println(msg);
	}

}
