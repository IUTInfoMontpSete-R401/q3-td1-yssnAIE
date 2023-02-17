package Commande;

import State.Connectee;
import State.Socket;

public class Read implements Commande {

    private Socket socket;

    public Read(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void execute(){
        socket.changeState(new Connectee(socket));
    }
}