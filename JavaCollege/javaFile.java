import java.io.*;
import java.util.*;

public class javaFile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		File f1 = new File("sample.txt");
		
		if (f1.exists())
		{
			System.out.println("File name: " + f1.getName());
			System.out.println("File Path Name: " + f1.getAbsolutePath());
			System.out.println("File Size: " + f1.length());
			System.out.println("File can Read: " + f1.canRead());
			System.out.println("File can Write: " + f1.canWrite());
			//System.out.println("File Delete: " + f1.delete());
		}
		else
		{
			System.out.println("File Not Available");
		}
		sc.close();
	}
}
