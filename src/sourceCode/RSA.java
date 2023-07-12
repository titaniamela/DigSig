/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sourceCode;

import frame.Halaman1_1;
import frame.Hal2;
import frame.Halaman3Lain;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Shania
 */
public class RSA {
    private static final int CERTAINTY = 10;
    private static final int KEY_LENGTH = 64;
    public static BigInteger encryptedHash;
    private static BigInteger d;
    private static BigInteger n;
    
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        generateKeys();
        getSignature();
    }
    
    public static void generateKeys() throws NoSuchAlgorithmException, IOException {
        // generate primes
        BigInteger p = generatePrime();
        BigInteger q = generatePrime();
        Halaman1_1.bilP.setText(p.toString());
        Halaman1_1.bilQ.setText(q.toString());

        // calculate n and phi(n)
        n = p.multiply(q);
        BigInteger phiN = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));

        // generate public and private keys
        BigInteger e = generatePublicKey(phiN);
        d = generatePrivateKey(e, phiN);
        Halaman1_1.bilE.setText(e.toString());
        Halaman1_1.KPublik.setText("(" + e + "," + n + ")");
        Halaman1_1.KPrivat.setText("(" + d + "," + n + ")");
    }
    
    public static void getSignature() throws NoSuchAlgorithmException, IOException {
        // hash message
        String filePath = Hal2.txtPath.getText();
        byte[] hash = calculateFileHash(filePath);
       
        // encrypt hash with private key
        encryptedHash = new BigInteger(hash).modPow(d, n);
       
        String signatureFilePath = getSignatureFilePath(filePath);
        try (FileWriter writer = new FileWriter(signatureFilePath)) {
            writer.write("Digital Signature: " + encryptedHash.toString() + "\n");
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private static BigInteger generatePrime() {
        Random random = new Random();
        BigInteger prime = new BigInteger(KEY_LENGTH,  random);

        while (!prime.isProbablePrime(CERTAINTY)) {
            prime = new BigInteger(KEY_LENGTH, CERTAINTY, random);
        }
        return prime;
    }

    private static BigInteger generatePublicKey(BigInteger phiN) {
        Random random = new Random();
        BigInteger e = BigInteger.probablePrime(phiN.bitLength() - 1, random);

        while (!phiN.gcd(e).equals(BigInteger.ONE)) {
            e = BigInteger.probablePrime(phiN.bitLength() - 1, random);
        }
        return e;
    }

    private static BigInteger generatePrivateKey(BigInteger e, BigInteger phiN) {
        return e.modInverse(phiN);
    }
    
    public static byte[] calculateFileHash(String filePath) {
        try{
        Path path = Paths.get(filePath);
        byte[] fileData = Files.readAllBytes(path);

        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        return digest.digest(fileData);
        } catch (NoSuchAlgorithmException | IOException e){
            e.printStackTrace();
        }
        return null;
    }
    
    private static String getSignatureFilePath(String filePath) {
        int dotIndex = filePath.lastIndexOf('.');
        String signatureFilePath = filePath.substring(0, dotIndex) + ".signature.txt";
        return signatureFilePath;
    }
    
    public static BigInteger getEncryptedHash(){
        return encryptedHash;
    }
}

