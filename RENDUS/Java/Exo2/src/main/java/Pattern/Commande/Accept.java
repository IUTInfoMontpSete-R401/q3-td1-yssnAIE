package Commande;

import State.Connectee;
import State.Socket;

public class Accept implements Commande {

    private Socket socket;

    public Accept(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void execute(){
        socket.changeState(new Connectee(socket));
    }
}