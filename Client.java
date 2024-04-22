import java.rmi.*;
import java.util.Scanner;

public class Client{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		try{
			String URL= "rmi://localhost/Server";
			ServerIntf serverIntf = (ServerIntf) Naming.lookup(URL);
			
			System.out.println("Enter first num.");
			double num1=sc.nextDouble();
			
			System.out.println("Enter second num.");
			double num2=sc.nextDouble();
			
			System.out.println("Addition is " + serverIntf.Addition(num1,num2));
			
		}
		catch(Exception e){
			System.out.println("error" + e.getMessage());
		}
		
	}
}
