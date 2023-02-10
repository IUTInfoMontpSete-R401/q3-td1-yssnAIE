package Pattern;

public class Fermee extends State{

    public Fermee(Socket socket) {
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
        socket.changeState(new Initiale(socket));
    }
}
