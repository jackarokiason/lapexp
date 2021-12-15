import java.security.*;
import java.util.*;
public class Dss{

public static void main(String[] args) throws Exception{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the message");
	String msg=sc.next();
	msg+=sc.nextLine();
	KeyPairGenerator KeyPairGen = KeyPairGenerator.getInstance("DSA");
	KeyPairGen.initialize(2048);
	KeyPair pair=KeyPairGen.generateKeyPair();
	PrivateKey privKey=pair.getPrivate();
	Signature sign= Signature.getInstance("SHA256withDSA");
	sign.initSign(privKey); 
	byte[] bytes=msg.getBytes();
	sign.update(bytes);
	byte[] signature=sign.sign();
	System.out.println("Signature:"+new String(signature,"UTF8"));
	}

}