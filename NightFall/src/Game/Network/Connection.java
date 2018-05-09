package Game.Network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import Datas.DataSet;

public class Connection implements Runnable{
	Socket client;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private DataSet data;
	public Connection() {
		connectServer();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean exit = false;
		while(!exit) {
			try {
				data = (DataSet)ois.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
				exit = true;
			}//catch
		}//while		
		
	}

	private void connectServer(){
		try{
			client = new Socket("127.0.0.1", 7777);
			oos = new ObjectOutputStream(client.getOutputStream());
			ois = new ObjectInputStream(client.getInputStream());
			Thread t = new Thread(this); // GUI자체에 쓰레드(Runnable인터페이스를 구현한)를 만들어 서버와 통신한다.
			t.start();
			DataSet sub = new DataSet();
			sub.setHead("test");
			oos.writeObject(sub);
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
