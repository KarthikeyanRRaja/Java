	import java.net.*;  
public class lab165 {
		  public static void main(String[] args) throws Exception {  
			    DatagramSocket ds = new DatagramSocket();  
			    String str = "Welcome java";  
			    InetAddress ip = InetAddress.getByName("172.15.10.16");  
			     
			    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);  
			    ds.send(dp);  
			    ds.close();  
			  }  

}
