package Commande;

import State.Socket;

public class Client {

    public static void main(String[] args) {

        Socket s = new Socket();
        Reset reset = new Reset(s);
        Read read = new Read(s);
        Listen listen = new Listen(s);
        Connect connect = new Connect(s);
        Close close = new Close(s);
        Accept accept = new Accept(s);
        Simulator simulator = new Simulator();

        s.getState();
        simulator.setCommande("reset", reset);
        simulator.setCommande("read",read);
        simulator.setCommande("listen",listen);
        simulator.setCommande("connect",connect);
        simulator.setCommande("close",close);
        simulator.setCommande("accept", accept);

        for (int i = 0;  i < 1; i++) {
            simulator.executeCommande("reset");
            s.getState();
            simulator.executeCommande("read");
            s.getState();
            simulator.executeCommande("listen");
            s.getState();
            simulator.executeCommande("connect");
            s.getState();
            simulator.executeCommande("close");
            s.getState();
            simulator.executeCommande("accept");
            s.getState();
        }

    }
}
