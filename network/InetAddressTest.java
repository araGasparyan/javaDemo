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
// Demonstrate InetAddress.
import java.net.*;
import java.util.Arrays;
class InetAddressTest
{
public static void main(String args[]) throws UnknownHostException {
InetAddress Address = InetAddress.getLocalHost();
System.out.println(Address);
Address = InetAddress.getByName("www.facebook.com");
System.out.println(Address);
System.out.println(Arrays.toString(Address.getAddress()));
    System.out.println(Address.getHostAddress());
    System.out.println(Address.getHostName());
InetAddress SW[] = InetAddress.getAllByName("www.facebook.com");
for (int i=0; i<SW.length; i++)
System.out.println(SW[i]);
}
}

