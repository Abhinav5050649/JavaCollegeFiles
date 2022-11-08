import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class _8duplicateline {
    public static void main(String[] args) {
        try{
        PrintWriter pw = new PrintWriter("output.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("sample.txt"));
        String line1 = br1.readLine();
        while(line1 != null)
        {
            boolean flag = false;
            BufferedReader br2 = new BufferedReader(new FileReader("output.txt"));
            String line2 = br2.readLine();
            while(line2 != null)
            {
                if(line1.equals(line2))
                {
                    flag = true;
                    break;
                }
                line2 = br2.readLine();
            }
            if(!flag){
                pw.println(line1);
                pw.flush();
            }
              
            line1 = br1.readLine();
              
        }
    }catch(Exception e){
        System.out.println(e);
    }
        System.out.println("File operation performed successfully");
    }
}
