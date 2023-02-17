package Commande;

import State.Initiale;
import State.Socket;

public class Reset implements CommandeAnnulable {

    private Socket socket;

    public Reset(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void execute() {
        socket.changeState(new Initiale(socket));
    }
}