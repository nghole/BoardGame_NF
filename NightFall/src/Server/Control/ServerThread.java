package Server.Control;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import Datas.DataSet;
import Datas.User;

public class ServerThread implements Runnable {
	//����º�
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private Socket client; //����
	private boolean exit; //�����÷���
	private DataSet data; //�޾ƿ� ������
	private DataSet result; //�����Ϳ� �Ŵ����� ó�� ���
	private User user; //�������� ������
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

	//�����忡�� �����͸� ����
	@Override
	public void run(){
		// TODO Auto-generated method stub
		while(!exit){
			try{
				//�����͸� �ް� �ش絥���ʹ� �Ŵ����� ����
				data = (DataSet)ois.readObject();
				System.out.println(data.getHead());
				//�α����� ��츸 ����ó��
				if(data.getHead().equals("Login")) {
					/*
					 * db�� üũ
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
