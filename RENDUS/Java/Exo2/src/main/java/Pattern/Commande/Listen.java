package Commande;

import State.Ecoute;
import State.Socket;

public class Listen implements Commande {

    private Socket socket;

    public Listen(Socket s) {
        socket = s;
    }
    @Override
    public void execute(){
        socket.changeState(new Ecoute(socket));
    }

}