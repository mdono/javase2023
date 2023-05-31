
package intecap.manuel.encripta;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringMD {
    /*
    private static final String MD2 = "MD2";
    private static final String MD5 = "MD5";    
    private static final String SHA1 = "SHA1";
    private static final String SHA256 = "SHA256";
    private static final String SHA384 = "SHA384";
    private static final String SHA512 = "SHA512";
    */
    
    public static String toHexadecimal(byte[] digito) {
        String hash = "";
        int b;
        
        for (byte aux : digito) {
            b = aux & 0xff;
            
            if (Integer.toHexString(b).length() != 1) {
                hash += Integer.toHexString(b);
            }
        }
        
        return hash;
    }
    
    public String getMensajeDigito(String mensaje, String algoritmo) {
        byte[] digito = null;
        byte[] buffer = mensaje.getBytes();
        
        try {
            MessageDigest mensajeDigito =
                    MessageDigest.getInstance(algoritmo);
            mensajeDigito.reset();
            mensajeDigito.update(buffer);
            digito = mensajeDigito.digest();
        } catch (NoSuchAlgorithmException ex) {
            System.err.println("Err: " + ex.getMessage());
        }
        
        return toHexadecimal(digito);
    }
}