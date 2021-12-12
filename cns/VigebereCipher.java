import java.util.Scanner;
public class VigenereCipher {
static String encode(String ptext, String key) {
String ctext = "";
ptext = ptext.toUpperCase();
for (int i = 0, j = 0; i < ptext.length(); i++) {
char c = ptext.charAt(i);
if (c < 'A' || c > 'Z') {
continue;
}
ctext += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
j = ++j % key.length();
}
return ctext;
}
static String decode(String ctext, String key) {
String ptext = "";
ctext = ctext.toUpperCase();
for (int i = 0, j = 0; i < ctext.length(); i++) {
char c = ctext.charAt(i);
if (c < 'A' || c > 'Z') {
continue;
}
ptext += (char) ((c - key.charAt(j) + 26) % 26 + 'A');
j = ++j % key.length();
}
return ptext;
}
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Simulating Vigenere Cipher\n----------------------- ");
System.out.println("Enter the key");
String key = scan.next();
key=key.toUpperCase();//Change the key to uppercase
System.out.println("Enter the plain text");
String msg = scan.next();
msg+=scan.nextLine();//To get the entire line as input
String cipher = encode(msg, key);//Encryption
System.out.println("Encrypted cipher text\n" + cipher);
String plain = decode(cipher, key);//Decryption
System.out.println("Decrypted plain text\n" + plain);
}
}