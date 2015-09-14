/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

/**
 *
 * @author matenadaran
 */
// Demonstrate datagrams.
import java.net.*;
class WriteServer {
public static int serverPort = 0;
public static int clientPort = 9990;
public static int buffer_size = 1024;
public static DatagramSocket ds;
public static byte buffer[] = new byte[buffer_size];
public static void TheServer() throws Exception {
int pos=0;
while (true) {
int c = System.in.read();
//System.out.println(buffer[777]);
switch (c) {
case -1:
System.out.println("Server Quits.");
ds.close();
return;
case '\r':
break;
case '\n':
ds.send(new DatagramPacket(buffer,pos,
InetAddress.getLocalHost(),clientPort));
pos=0;
break;
default:
buffer[pos++] = (byte) c;
//System.out.print(pos+" "+buffer[pos-1]);
}
}
}
public static void TheClient() throws Exception {
while(true) {
DatagramPacket p = new DatagramPacket(buffer, buffer.length);
ds.receive(p);
System.out.println(new String(p.getData(), 0, p.getLength()));
}
}
public static void main(String args[]) throws Exception {
if(args.length == 1) {
ds = new DatagramSocket(serverPort);
 System.out.println(ds.getPort());
    System.out.println(ds.getLocalPort());
     System.out.println(ds.getInetAddress());
    System.out.println(ds.isBound());
      System.out.println(ds.isConnected());
TheServer();
   
   
} else {
ds = new DatagramSocket(clientPort);
 System.out.println(ds.getPort());
    System.out.println(ds.getLocalPort());
     System.out.println(ds.getInetAddress());
    System.out.println(ds.isBound());
      System.out.println(ds.isConnected());
TheClient();
}
}
}
