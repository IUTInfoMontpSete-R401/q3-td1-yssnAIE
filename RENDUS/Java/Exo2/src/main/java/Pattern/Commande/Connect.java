package Commande;

import State.Connectee;
import State.Socket;

public class Connect implements CommandeAnnulable{

    private Socket socket;

    public Connect(Socket s) {
        socket = s;
    }

    @Override
    public void execute() {
        socket.changeState(new Connectee(socket));
    }
}
