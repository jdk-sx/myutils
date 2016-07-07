package cn.mldn.action;

import cn.mldn.vo.Message;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class MessageAction extends ActionSupport {
	private Message msg = new Message() ;
	public Message getMsg() {
		return msg;
	} 
	public String add() {
		System.out.println("*************** MessageAction.add() ***************");
		System.out.println(this.msg);
		return "forward.page" ;
	}
	public String edit() {
		System.out.println("*************** MessageAction.edit() ***************");
		System.out.println(this.msg);
		return "forward.page" ;
	}

	public String rm() {
		System.out.println("*************** MessageAction.rm() ***************");
		return "forward.page" ;
	}
}
