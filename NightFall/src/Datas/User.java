package Datas;

import java.io.Serializable;

import Server.Control.ServerThread;

public class User extends DataSet implements Serializable{
	private String name;
	private String id;
	private String pw;
	private String nickName;
	private String email;
	private ServerThread st; //유저가 부여받은 쓰레드
	
	public User(ServerThread st,DataSet data){
		super();
		this.st = st;
		// TODO Auto-generated constructor stub
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getPw(){
		return pw;
	}
	public void setPw(String pw){
		this.pw = pw;
	}
	public String getNickName(){
		return nickName;
	}
	public void setNickName(String nickName){
		this.nickName = nickName;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}

}
