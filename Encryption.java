package security.based;
/**
 *
 * @author Sarthak Bhargava
 */
public class Encryption {
    public static void main(String[] args) {}
    static String encryption(String Str,int encrypt_value) {
        String temp_str;
        temp_str = "";
        int temp = 0;
        char ch = ' ';
        char str_char_array[] = Str.toCharArray();
        
        for(int i = 0; i < str_char_array.length; i++)
        {   
            ch = str_char_array[i];
            if (ch >= 'A' && ch <= 'Z')  
                temp = ch - encrypt_value;

            else if (ch >= 'a' && ch <= 'z')  
                temp = ch + encrypt_value;  

            else
                temp = ch + encrypt_value;
            temp_str += (char) temp;
        }
        return temp_str;
    }
}