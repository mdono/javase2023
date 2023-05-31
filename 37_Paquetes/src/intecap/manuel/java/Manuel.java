package intecap.manuel.java;

import intecap.manuel.encripta.StringMD;

public class Manuel {

    public static void main(String[] args) {
        StringMD instancia = new StringMD();
        
        System.out.println(instancia.
                getMensajeDigito("Guatemala", "MD2"));
        System.out.println(instancia.
                getMensajeDigito("Guatemala", "MD5"));
        System.out.println(instancia.
                getMensajeDigito("Guatemala", "SHA-1"));
        System.out.println(instancia.
                getMensajeDigito("Guatemala", "SHA-256"));
        System.out.println(instancia.
                getMensajeDigito("Guatemala", "SHA-384"));
        System.out.println(instancia.
                getMensajeDigito("Guatemala", "SHA-512"));
    }
}