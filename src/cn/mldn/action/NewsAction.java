package cn.mldn.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class NewsAction extends ActionSupport {
	public void rm() {
		System.out.println("*************** NewsAction.add() ***************");
	}
	public void list() {
		System.out.println("*************** NewsAction.list() ***************");
	}
}
