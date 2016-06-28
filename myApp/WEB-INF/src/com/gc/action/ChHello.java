package com.gc.action;
import com.gc.impl.Hello;

public class ChHello implements Hello {

	public String msg=null;
	public void setMsg(String msg)
	{
		this.msg=msg;
	}
	public String getMsg()
	{
		return this.msg;
	}
	@Override
	public String doSalutation() {
		// TODO Auto-generated method stub
		return "你好 "+this.msg;
	}

}
