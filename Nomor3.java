package Modul01;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Nomor3 {
    public static void main(String[] args) throws UnknownHostException, java.lang.SecurityException {
        System.out.println("Lihat alamat host");
        try {
            String host = "www.google.com";
            InetAddress[] ia = InetAddress.getAllByName(host);

            System.out.println("Nama Host: "+host);
            System.out.println("\nAlamat Host: ");

            for (int i = 0; i < ia.length; i++) {
                System.out.println(ia[i]);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
