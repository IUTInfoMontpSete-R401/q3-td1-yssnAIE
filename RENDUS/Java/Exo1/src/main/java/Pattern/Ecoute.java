package Pattern;

public class Ecoute extends State{

    public Ecoute(Socket socket) {
        super(socket);
    }

    @Override
    public void connect() {
        System.out.println("Vous ne pouvez pas faire cette action");
    }

    @Override
    public void listen() {
        System.out.println("Vous ne pouvez pas faire cette action");
    }

    @Override
    public void close() {
        socket.changeState(new Fermee(socket));
    }

    @Override
    public void accept() {
        read();
        socket.changeState(new Connectee(socket));
    }

    @Override
    public void read() {
        System.out.println("un message dans la console");
    }
}
