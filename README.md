# UDP DatagramSocket
```
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception{
        DatagramSocket server=new DatagramSocket(4160);
        byte[] buf=new byte[256];
        DatagramPacket p=new DatagramPacket(buf,buf.length);
        server.receive(p);
        
        String res=new String(p.getData());
        System.out.println("R Data :"+res);

    }
}

import java.net.*;

public class Client{ 
   public static void main(String[] args) throws Exception{
        DatagramSocket client=new DatagramSocket();
        InetAddress add=InetAddress.getByName("localhost");
        
        String str="Sharkz Reigns";
        byte[] buf=str.getBytes();
        DatagramPacket p=new DatagramPacket(buf,buf.length,add,4160);
        client.send(p);
    }
}
```
