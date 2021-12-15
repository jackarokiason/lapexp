import java.util.*;
import javax.crypto.*;
import java.security.*;

public class Des{
	public static void main(String[] args) throws Exception{
	Scanner sc=new Scanner(System.in);
	KeyGenerator keygenerator= KeyGenerator.getInstance("DES");
	SecretKey myDesKey=keygenerator.generateKey();
	Cipher desCipher;
	desCipher=Cipher.getInstance("DES/ECB/PKCS5Padding");
	desCipher.init(Cipher.ENCRYPT_MODE,myDesKey);
	String ptext=sc.next();
	ptext+=sc.nextLine();
	byte[] text=ptext.getBytes();
	byte[] 	encryptedText=desCipher.doFinal(text);
	System.out.println("encrypted: "+encryptedText);
	desCipher.init(Cipher.DECRYPT_MODE,myDesKey);
	byte[] decryptedText=desCipher.doFinal(encryptedText);
	System.out.println("decrypted: "+new String(decryptedText));
	}

}