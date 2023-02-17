package State;

public class Connectee extends State{

    public Connectee(Socket socket) {
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
