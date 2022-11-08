// import java.util.*;
import java.io.*;

public class dataOutputStream{
	public static void main(String args[])
	{
		try{
			FileOutputStream f1 = new FileOutputStream("sample.txt");
			DataOutputStream d1 = new DataOutputStream(f1);

			float val1 = Float.parseFloat(args[0]);
			double val2 = Double.parseDouble(args[1]);
			short val3 = Short.parseShort(args[2]);
			String val4 = args[3];	

			d1.writeFloat(val1);
			d1.writeDouble(val2);
			d1.writeShort(val3);
			d1.writeUTF(val4);
			
			d1.close();

			FileInputStream fi1 =  new FileInputStream("sample.txt");
			DataInputStream di1 = new DataInputStream(fi1);

			String ans = di1.readFully();
			
		}catch(FileNotFoundException e)
		{
			System.out.println("File not found!");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please enter CLI arguments!");
		}
		catch(Exception e)
		{	
			System.out.println("Error!");
		}
	}
}
