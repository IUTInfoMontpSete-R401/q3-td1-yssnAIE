package Pattern;

public abstract class State {

    Socket socket;

    public State(Socket socket) {
        this.socket = socket;
    }

    public abstract void connect();
    public abstract void listen();
    public abstract void close();
    public abstract void accept();
    public abstract void read();
}