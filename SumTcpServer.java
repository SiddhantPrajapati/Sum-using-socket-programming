import java.util.*;
import java.io.*;
import java.net.*;

public class SumTcpServer {
	public static void main(String[] args) throws Exception {
		try {
				
		ServerSocket ss = new ServerSocket(3333);
		Socket s = ss.accept();
		System.out.println("Waiting for Client..");
		DataInputStream din = new DataInputStream(s.getInputStream());
		
		String str = din.readUTF();
		int n = sum(str);
		System.out.println("Sum is : " + n);
		
		ss.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static int sum(String x){
		String []a = x.split(" ");
		int num1 = Integer.parseInt(a[0]);
		int num2 = Integer.parseInt(a[1]);
		
		return num1 + num2;
	}
}
		