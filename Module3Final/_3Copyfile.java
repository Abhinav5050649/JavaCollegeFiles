import java.io.*;

public class _3Copyfile {
    public static void main(String[] args) {
        try {
			FileReader fr = new FileReader("samples.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(args[0], true);
			String s;
 
			while ((s = br.readLine()) != null) { // read a line
				fw.write(s); // write to output file
			}
			br.close();
			fw.close();
                        System.out.println("file copied");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
