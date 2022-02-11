package hk;
import java.util.Scanner;
import java.io.*;
public class ScannerBuffer 
{
	public static void main(String[] args) throws IOException {
		Scanner sc =new Scanner(System.in);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String name;
		int age;
		System.out.println("Enter your name :");
		name = br.readLine();
		System.out.println("Enter your age :");
		age = sc.nextInt();
		System.out.println("Name: "+name );
		System.out.println("Age :"+age);

	}

}
