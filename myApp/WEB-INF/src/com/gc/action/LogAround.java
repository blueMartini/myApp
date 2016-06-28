package com.gc.action;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
//Interception Around 通知会在JointPoint 的前后执行

public class LogAround implements MethodInterceptor {
    private Logger logger=Logger.getLogger(this.getClass().getName());
	//负责输出日志的代码
    @Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, mi.getArguments()[0]+" 开始审核数据...");
		try{
			Object result=mi.proceed();
			return result;
		}
    	finally{
    		logger.log(Level.INFO, mi.getArguments()[0]+" 审核数据结束...");
    	}
	}

}
