package Datas;

import java.io.Serializable;

public class DataSet implements Serializable{
	protected String head;	//�������� ����
	protected String className;	//�����Ͱ� ��� �ִ� Ŭ���� �̸�
	protected String target; //�޽����� ���� ���
	private String msg; //���ϴ� �ٸ� Ŭ������ �ƴ� �ܼ��� �޽����� ������ ���
	
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
