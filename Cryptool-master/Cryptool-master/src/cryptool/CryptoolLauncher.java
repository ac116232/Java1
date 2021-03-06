package cryptool;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class CryptoolLauncher {
    static Scanner keyboard = new Scanner(System.in);
    /*
     */
    public static void main(String[] args) throws Exception {
        String resultText;
        System.out.println("Welcome to Cryptool, Would you like to ENCRYPT or DECRYPT?");
        String cypherChoice = keybovard.nextLine();
        System.out.println("Enter File Path to begin.");
        String filePath = keyboard.nextLine();
        System.out.println("Now input your shift key. Integer (0-999999999) only.");
        int encryptionKey = keyboard.nextInt();

        String ImportedText = ReadFromTxtFile.getFile(filePath);
        switch (cypherChoice.toLowerCase()) {
            case "encrypt":
                resultText = Encryptor.encryptText(ImportedText, encryptionKey);
                try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream("ResultFile.txt"), "utf-8"))) {
                    writer.write(resultText);
                    System.out.println("File written: ResultFile.txt");
                }
                break;
            case "decrypt":
                resultText = Encryptor.decryptText(ImportedText, encryptionKey);
                try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream("ResultFile.txt"), "utf-8"))) {
                    writer.write(resultText);
                    System.out.println("File written: ResultFile.txt");
                    // DatabaseConn.DatabaseUpdate(filePath, encryptionKey, resultText, cypherChoice);
                }
                break;
            default:
                System.out.println("Command: " + cypherChoice + "\nNot Recognized, Program Exit");
                break;
        }
    }
}