package com.gc.action;

import com.gc.impl.TimeBookInterface;

public class TimeBook implements TimeBookInterface {

	@Override
	public void doAuditing(String name) {
		// TODO Auto-generated method stub
         System.out.println("正在处理考勤记录...");
	}
    public void doCheck(String name)
    {
    	System.out.println("正在处理财务关账记录...");
    }
}
