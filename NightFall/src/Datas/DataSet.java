package Datas;

import java.io.Serializable;

public class DataSet implements Serializable{
	protected String head;	//데이터의 종류
	protected String className;	//데이터가 담고 있는 클래스 이름
	protected String target; //메시지의 목적 대상
	private String msg; //이하는 다른 클래스가 아닌 단순히 메시지만 보내는 경우
	
	public String getHead(){
		return head;
	}
	public void setHead(String head){
		this.head = head;
	}
	public String getClassName(){
		return className;
	}
	public void setClassName(String className){
		this.className = className;
	}
	public String getTarget(){
		return target;
	}
	public void setTarget(String target){
		this.target = target;
	}
	public String getMsg(){
		return msg;
	}
	public void setMsg(String msg){
		this.msg = msg;
	}
	
	
}
