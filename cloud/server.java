import java.net.*;
import java.io.*;
import java.util.*;

public class server{
	public static void main(String[] args) throws IOException{
		try{
		Scanner sc=new Scanner(System.in);
		ServerSocket ss= new ServerSocket(10087);
		Socket s=ss.accept();	
		System.out.println("Connected");
		DataInputStream dis= new DataInputStream(s.getInputStream());
		String input=(String)dis.readUTF();
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		FileInputStream fis=new FileInputStream("out.txt");
		FileOutputStream fos= new FileOutputStream(input);
		int num;
		while((num=fis.read())!=-1)
			{
				if(num%2==0)
				{
				  fos.write(num);	
				}
			}

		dos.writeUTF(input);
		System.out.println("File is sent to client");
		ss.close();
		s.close();

		}

		catch(Exception e){
		
		System.out.println("port not available"+e);
		}

	}

}