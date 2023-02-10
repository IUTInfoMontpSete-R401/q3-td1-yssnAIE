package Pattern;

public class Initiale extends State{

    public Initiale(Socket s) {
        super(s);
    }

    @Override
    public void connect() {
        socket.changeState(new Connectee(socket));
    }

    public void listen() {
        socket.changeState(new Ecoute(socket));
    }

    @Override
    public void close() {
        System.out.println("Vous ne pouvez pas faire cette action");
    }

    @Override
    public void accept() {
        System.out.println("Vous ne pouvez pas faire cette action");
    }

    @Override
    public void read() {
        System.out.println("Vous ne pouvez pas faire cette action");
    }

    @Override
    public void reset() {
        System.out.println("Vous ne pouvez pas faire cette action");
    }
}
