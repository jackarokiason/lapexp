import java.security.*;
import java.util.*;

public class SHA{
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		MessageDigest md=MessageDigest.getInstance("SHA1");
		System.out.println("Algorithm: "+md.getAlgorithm());
		System.out.println("Provider: "+md.getProvider());
		System.out.println("String: "+md.toString());
		System.out.println("Enter the message: ");
		String msg=sc.next();
		msg+=sc.nextLine();
		md.update(msg.getBytes());
		byte[] output=md.digest();
		System.out.println("output: "+byteToHex(output));
		}

	private static String byteToHex(byte[] b){
		char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		StringBuffer bff=new StringBuffer();
		for(byte ab:b){
		bff.append(hexDigits[(ab>>4) & 0x0f]);
		bff.append(hexDigits[ab & 0x0f]);
		}
		return bff.toString();	
	}
}