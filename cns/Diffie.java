import java.util.*;
import java.lang.*;
public class Diffie{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int q=23;
	int a=5;
	System.out.println("enter the user A private key: ");
	int Xa=sc.nextInt();
	System.out.println("enter the user B private key: ");
	int Xb=sc.nextInt();
	double Ya=(Math.pow(a,Xa))%q;
	double Kb=(Math.pow(Ya,Xb))%q;
	double Yb=(Math.pow(a,Xb))%q;
	double Ka=(Math.pow(Yb,Xa))%q;
	//print statement
	if(Ka==Kb)
		{
		System.out.println("Success:shared key matches"+Ka);

		}
	else{
		System.out.println("Error:no matches");
	}
	}

}
