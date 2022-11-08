import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest{

    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("Sample.txt"));

            String data = br.readLine();
            int words = 1;
            int character = 0;
            int line =0;
            int vowel =0;
            int consonants =0;

            while(data != null){
                // System.out.print(data);

                for (int i = 0; i < data.length(); i++) {
                    char ch = data.charAt(i);

                    if(ch == ' ' || ch == '\n' || ch == '\t'){
                        words++;

                    }

                    if( ch =='\n') line++;

                    character++;

                    if(ch=='a'|| ch=='e' || ch=='i' || ch=='o'|| ch=='u' ||ch=='A'|| ch=='E' || ch=='I' || ch=='O'|| ch=='U'){
                        vowel++;
                    }
                }
                data = br.readLine();
            }
            System.out.println(words);
            System.out.println(line);
            System.out.println(vowel);
            System.out.println("Read successfully ");

        } catch (Exception e) {
            // TODO: handle exception

        }
        finally {
            try{
                br.close();

            }catch(IOException e){}
        }
    }
}