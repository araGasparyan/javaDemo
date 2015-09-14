/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;
// Demonstrate Sockets.
import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
class Whois {
public static void main(String args[]) throws Exception {
int c;
// Create a socket connected to internic.net, port 43.
Socket s = new Socket("whois.internic.net", 43);
    System.err.println(s.getInetAddress());
    System.err.println(s.getLocalPort());
    System.err.println(s.getPort());
// Obtain input and output streams.
InputStream in = s.getInputStream();
OutputStream out = s.getOutputStream();
// Construct a request string.
String str = (args.length == 0 ? "fifa.com" : args[0]) + "\n";
// Convert to bytes.
byte buf[] = str.getBytes();
// Send request.
out.write(buf);
//System.out.println(Arrays.toString(buf));`
// Read and display response.
while ((c = in.read()) != -1) {
System.out.print((char) c);
}
s.close();
}
}
