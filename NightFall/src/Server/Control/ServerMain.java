package Server.Control;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import Datas.Room;
import Datas.User;

public class ServerMain {
	public ServerMain() {
		try
		{
			ServerSocket server = new ServerSocket(7777);
			System.out.println("Chatting Server Start!!");
			while(true){
				Socket client = server.accept();
				System.out.println(client.getInetAddress().getHostAddress() + "유저가 접속했습니다."); // 접속한 클라이언트의 IP주소를 읽어내기

				ServerThread cst = new ServerThread(client);
				Thread t = new Thread(cst);
				t.start();
			}// while
		}catch(IOException e)
		{
			e.printStackTrace();
		}		
	}
}
