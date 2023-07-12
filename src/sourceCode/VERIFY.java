/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sourceCode;


import frame.Halaman3Lain;
import frame.Halaman1_1;
import frame.Halaman3Lain;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Shania
 */
public class VERIFY {
    public static BigInteger currentSignature;
    
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
            // Load private key from input
            String privateKey = Halaman1_1.KPrivat.getText();
            BigInteger[] privateKeyValues = extractPrivateKeyValues(privateKey);
            if (privateKeyValues != null) {
                BigInteger d = privateKeyValues[0];
                BigInteger n = privateKeyValues[1];

            // Hash message
            String filePath = Halaman3Lain.TakeMessage.getText();
            byte[] hash = calculateFileHash(filePath);

            // Encrypt hash with private key
            currentSignature = new BigInteger(hash).modPow(d, n);

            // Save digital signature to file
            String signatureFilePath = getSignatureFilePath(filePath);
            try (FileWriter writer = new FileWriter(signatureFilePath)) {
                writer.write("Digital Signature: " + currentSignature.toString() + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            }
    }

    private static BigInteger[] extractPrivateKeyValues(String privateKey) {
        String[] parts = privateKey.split("[(),]");
        if (parts.length >= 3) {
            try {
                BigInteger d = new BigInteger(parts[1].replaceAll("[^\\d]", ""));
                BigInteger n = new BigInteger(parts[2].replaceAll("[^\\d]", ""));
                return new BigInteger[]{d, n};
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static byte[] calculateFileHash(String filePath) {
        try {
            Path path = Paths.get(filePath);
            byte[] fileData = Files.readAllBytes(path);

            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            return digest.digest(fileData);
        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getSignatureFilePath(String filePath) {
        int dotIndex = filePath.lastIndexOf('.');
        String signatureFilePath = filePath.substring(0, dotIndex) + ".signature2.txt";
        return signatureFilePath;
    }
    
    public static BigInteger getCurrentSignature(){
        return currentSignature;
    }
    
    public static boolean compareSignature(BigInteger storedSignature, BigInteger currentSignature){
        if(storedSignature !=null && currentSignature !=null && storedSignature.compareTo(currentSignature)==0){
            return true;
        }else{
            return false;
        }
    }
}
