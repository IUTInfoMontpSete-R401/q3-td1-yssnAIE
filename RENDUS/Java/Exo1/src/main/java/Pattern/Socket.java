package Pattern;

public class Socket {

    private State state;

    public Socket() {
        state = new Initiale(this);
    }

    public void changeState(State s) {
        state = s;
    }

    public static void main(String[] args) {
        Socket s = new Socket();
        System.out.println(s.state);
        State etat = new Initiale(s);
        etat.close();
        etat.listen();
        System.out.println(s.state);
    }
}
