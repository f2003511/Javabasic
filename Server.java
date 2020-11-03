package lianxi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		while(true){
			try {
				// 建立serversocket服务端
				ServerSocket socket = new ServerSocket(9887);
				// 等待客户端连接
				System.out.println("等待小司连接............");
				Socket accept = socket.accept();// 阻塞服务端
				// 建立输入流读取客户端的数据
				InputStream is = accept.getInputStream();
				System.out.println("小司上线");
				// 接收客户端信息
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				String readLine = br.readLine();
				System.out.println("小司："+readLine);
				// 再给客户端发送数据，告诉客户端收到连接
				OutputStream os = accept.getOutputStream();
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
				Scanner sc = new Scanner(System.in);
				String next = sc.next();
				bw.write(next+"\n");
				bw.flush();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
