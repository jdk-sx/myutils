package cn.mldn.vo;

import java.util.Date;

public class Message {
	private Integer mid ;
	private String title ;
	private Date senddate ;
	private String content ;
	private Double costs ;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getSenddate() {
		return senddate;
	}
	public void setSenddate(Date senddate) {
		this.senddate = senddate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Double getCosts() {
		return costs;
	}
	public void setCosts(Double costs) {
		this.costs = costs;
	}
	@Override
	public String toString() {
		return "Message [mid=" + mid + ", title=" + title + ", senddate="
				+ senddate + ", content=" + content + ", costs=" + costs + "]";
	}
	
}
