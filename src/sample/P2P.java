package sample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Saloedov on 23.12.2016.
 */
public class P2P {
    ServerSocket server;
    Socket client;
    boolean isClient=false;
    int port=9039;

    public P2P() throws IOException{
        server = new ServerSocket(port);
    }

    public boolean connect(String ip)]{
        try {
            client = new Socket(ip, port);
        }
        catch (IOException e){
            return false;
        }
        server = null;
        isClient=true;
    }
}
