import java.io.*;

public class _7BufferedReaderWriter {
  public static void main(String[] argv) throws Exception {
    BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("sample7out.txt"));
    int i;
    do {
      i = br.read();
      if (i != -1) {
        if (Character.isLowerCase((char) i))
          bw.write(Character.toUpperCase((char) i));
        else
          bw.write((char) i);
      }
    } while (i != -1);
    br.close();
    bw.close();
  }
}