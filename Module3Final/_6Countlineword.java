import java.io.BufferedReader;
import java.io.FileReader;

public class _6Countlineword {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("sample.txt"));

            String data = br.readLine();
            int words = 1;
            int character = 0;
            int line =0;
            int vowel =0;

            while(data != null){

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
            System.out.println("No of character in file: "+character);
            System.out.println("No of word in file: "+words);
            System.out.println("No of line in file: "+line);
            System.out.println("No of vowel in file: "+vowel);
            System.out.println("Read successfully! ");

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
