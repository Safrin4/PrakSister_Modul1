package Modul01;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;
import javax.swing.*;

public class Nomor2 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        String host = JOptionPane.showInputDialog("Pilih Host! \n1. Host Name\n2. Host Address");
        int h = Integer.parseInt(host);
        switch (h){
            case 1: String name = JOptionPane.showInputDialog("Masukkan Nama Host ya :");
                    InetAddress n = InetAddress.getByName(name);
                    if(n.isReachable(3000)){
                        JOptionPane.showMessageDialog(null, n+" is Reachable");
                    }else{
                        JOptionPane.showMessageDialog(null, n+" is UnReachable");
                    }
                break;
            case 2: String alamat = JOptionPane.showInputDialog("Masukkan Alamat Host ya :");
                    InetAddress ia = InetAddress.getByName(alamat);
                    if(ia.isReachable(3000)){
                        JOptionPane.showMessageDialog(null, ia+" is Reachable");
                    }else{
                        JOptionPane.showMessageDialog(null, ia+" is UnReachable");
                    }
                break;
            default : JOptionPane.showMessageDialog(null, "Host tidak ada");
        }
        System.exit(0);
    }
}
