package Server.Control;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

import Datas.DataSet;
import Datas.Room;
import Datas.User;
/*
 * 서버에서 통신과 관련된 메소드를 전반적으로 처리함
 * 
 */
public class ServerManager {
	private static ServerManager _instance;
	public static ServerManager getInstance() {
		if(_instance==null) _instance = new ServerManager();
		return _instance;
	}
	
	// 대기실&게임방
	private ArrayList<Room> rooms = new ArrayList<>();
	//전체 로그인된 유저
	private ArrayList<User> user = new ArrayList<>();
	
	//받은 헤더에 대한 응답을 보냄
	public DataSet checkData(DataSet received) {
		DataSet sendData=null;
		switch(received.getHead()) {
			case "CreateRoom" :
				break;
		}
		return sendData;
	}
	

	// 서버에 전달된 Data객체를 접속한 모든 사용자에게 전파하는 메서드
	public void broadCasting(){
		Collection<ObjectOutputStream> oosList = null;
		for(ObjectOutputStream oos : oosList){
			try{
				oos.writeObject(null);
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	
}
