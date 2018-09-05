package Modul01;

import java.net.InetAddress;

public class Contoh2_2 {
    public static void main(String[] args) {
        try{
            System.out.println("# Get hostname from current IP");
            String ip = "127.0.0.1";
            System.out.println("Hostname from ip \""+ip+"\": "+InetAddress.getByName(ip).getHostName());

            System.out.println("\n# Get host address from current name");
            String host = "localhost";
            System.out.println("Host/IP: "+InetAddress.getByName(host).getHostAddress());
            System.out.println("Host/IP: "+InetAddress.getByName(host));

            System.out.println("\n# Check connection");
            InetAddress ia = InetAddress.getByName(host);
            if(ia.isReachable(3000)){
                System.out.println(ia+" is Reachable");
            }else{
                System.out.println(ia+" is UnReachable");
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
