
package security.based;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Asus ROG
 */
public class File_Handler{

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)throws Exception 
    { 
        System.out.println("Enter Number of character up you want in your changed code");
        int value = scan.nextInt();
        
        int i = scan.nextInt();
        if(i==1)
            Encrypt_file("D:\\Demo.txt","D:\\Demo_1.txt",value);
        else
            Decrypt_file("D:\\Demo_1.txt", "D:\\Demo.txt",value);
    }

    static void Encrypt_file(String SRC_File_Path,String DIST_File_path,int encrypt_value) throws Exception {
        
        Encryption encrypt = new Encryption();
        File file = new File(SRC_File_Path);
        BufferedReader br = new BufferedReader(new FileReader(file));
         
        String st; 
        while ((st = br.readLine()) != null) 
        {
            try (BufferedWriter out = new BufferedWriter(new FileWriter(DIST_File_path, true))) {
                out.write(encrypt.encryption(st,encrypt_value) + "\n");
            } 
        }
    }

    static void Decrypt_file(String SRC_File_Path,String DIST_File_path,int decrypt_value) throws Exception {
        
        Decryption decrypt = new Decryption();
        File file = new File(SRC_File_Path);
        BufferedReader br = new BufferedReader(new FileReader(file));
         
        String st; 
        while ((st = br.readLine()) != null) 
        {
            try (BufferedWriter out = new BufferedWriter(new FileWriter(DIST_File_path, true))) {
                out.write(decrypt.decryption(st,decrypt_value)+"\n");
            } 
        }
    }
}
