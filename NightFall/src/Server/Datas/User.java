package Server.Datas;

import java.io.Serializable;

public class User extends DataSet implements Serializable{
	private String name;
	private String id;
	private String pw;
	private String nickName;
	private String email;
	
	public User(){
		super();
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
