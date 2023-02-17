package Commande;

import State.Fermee;
import State.Socket;

public class Close implements CommandeAnnulable{

    private Socket socket;

    public Close(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void execute() {
        socket.changeState(new Fermee(socket));
    }
}
