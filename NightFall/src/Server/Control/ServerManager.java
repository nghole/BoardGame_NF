package Server.Control;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

import Datas.DataSet;
import Datas.Room;
import Datas.User;
/*
 * �������� ��Ű� ���õ� �޼ҵ带 ���������� ó����
 * 
 */
public class ServerManager {
	private static ServerManager _instance;
	public static ServerManager getInstance() {
		if(_instance==null) _instance = new ServerManager();
		return _instance;
	}
	
	// ����&���ӹ�
	private ArrayList<Room> rooms = new ArrayList<>();
	//��ü �α��ε� ����
	private ArrayList<User> user = new ArrayList<>();
	
	//���� ����� ���� ������ ����
	public DataSet checkData(DataSet received) {
		DataSet sendData=null;
		switch(received.getHead()) {
			case "CreateRoom" :
				break;
		}
		return sendData;
	}
	

	// ������ ���޵� Data��ü�� ������ ��� ����ڿ��� �����ϴ� �޼���
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
