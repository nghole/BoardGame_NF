package Server.Control;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import Datas.DataSet;
import Datas.User;

public class ServerThread implements Runnable {
	//입출력부
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private Socket client; //소켓
	private boolean exit; //종료플래그
	private DataSet data; //받아온 데이터
	private DataSet result; //데이터에 매니저의 처리 결과
	private User user; //쓰레드의 소유자
	private ServerManager sm = ServerManager.getInstance();

	public ServerThread(Socket client){
		this.client = client;
		try{
			ois = new ObjectInputStream(client.getInputStream());
			oos = new ObjectOutputStream(client.getOutputStream());
		}catch(IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//쓰레드에서 데이터를 받음
	@Override
	public void run(){
		// TODO Auto-generated method stub
		while(!exit){
			try{
				//데이터를 받고 해당데이터는 매니저로 보냄
				data = (DataSet)ois.readObject();
				System.out.println(data.getHead());
				//로그인의 경우만 직접처리
				if(data.getHead().equals("Login")) {
					/*
					 * db로 체크
					 */
					user = new User(this,data);
				}else sm.checkData(data);
			}catch(Exception e){
				e.printStackTrace();
				exit=true;
			}
		}
		try{
			client.close();
		}catch(IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
