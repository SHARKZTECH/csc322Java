public class UPDClient throw IOExpection{
    public static void main(String[] args){
        DatagramSocket client=new DatagramSocket();
        InetAddress add=InetAddress.getByName("localhost");
        
        String str="Sharkz Reigns";
        byte[] buf=str.getBytes();
        DatagramPacket p=new DatagramPacket(buf,buf.lenght,add,4160);
        client.send(p);
    }
}

public class UPDServer throw IOExpection{
    public static void main(String[] args){
        DatagramSocket server=new DatagramSocket(4160);
        DatagramPacket p=new DatagramPacket(buf,buf.lenght);
        server.receive(p);
        
        String res=new String(p.getData());
        System.out.println("R Data :"+res);

    }
}
