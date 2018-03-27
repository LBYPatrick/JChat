package jchat.networking;

import java.net.InetAddress;

public class NetUtils {
    public static String getIP () {
        return InetAddress.getLocalHost().getHostName();
    }
}