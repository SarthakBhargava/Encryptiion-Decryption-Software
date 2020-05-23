package security.based;
/**
 *
 * @author Sarthak Bhargava
 */
public class Decryption {
    public static void main(String[] args) {}
    static String decryption(String Str,int decrypt_value) {
        String temp_str;
        temp_str = "";
        int temp = 0;
        char str_char_array[] = Str.toCharArray();
        char ch = ' ';
        
        for(int i = 0; i < str_char_array.length; i++)
        {
            ch = str_char_array[i];
            if (ch >= 'A' && ch <= 'Z')  
                temp = ch + decrypt_value;

            else if (ch >= 'a' && ch <= 'z')  
                temp = ch - decrypt_value;  

            else
                temp = ch - decrypt_value;
            temp_str += (char) temp;
        }
        return temp_str;
    }   
}