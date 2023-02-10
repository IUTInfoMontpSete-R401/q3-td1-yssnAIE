package Pattern;

public class Configuration extends State{

    public Configuration(Socket socket) {
        super(socket);
    }

    @Override
    public void connect() {
        read();
        socket.changeState(new Connectee(socket));
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
        System.out.println("un message dans la console");
    }

    @Override
    public void reset() {
        System.out.println("Vous ne pouvez pas faire cette action");
    }
}
