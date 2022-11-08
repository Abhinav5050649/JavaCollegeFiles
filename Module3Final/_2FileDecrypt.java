import java.io.FileInputStream;

public class _2FileDecrypt{
    
    static int decrypt(int data , int key){
        return data = data - key;
    }
    public static void main(String[] args) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("encrypt.txt");
            
            int data =0;
            // Content in file
            System.out.println("Decrypted Data is :");
            while(fin.available() >0){
                data = fin.read();
                System.out.print((char)(decrypt(data, 3)));
            }
            
            
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}