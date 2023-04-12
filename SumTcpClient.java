import java.util.*;
import java.io.*;
import java.net.*;

public class SumTcpClient {
	public static void main(String[] args) throws Exception {
		try {
		Socket s = new Socket("localhost",3333);
		Scanner sc = new Scanner(System.in);
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		System.out.println("Enter two number in the form of (num1 num2)");
		String str = sc.nextLine();
		dout.writeUTF(str);
		s.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
		