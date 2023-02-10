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
        String barre = "-";
        for ( int i = 0; i < 10 ; i++) {
            System.out.println("boucle "+i);
            System.out.println(barre+s.state);
            State state1 = new Initiale(s);
            state1.listen();
            System.out.println(barre+s.state);
            State state2 = new Ecoute(s);
            state2.accept();
            System.out.println(barre+s.state);
            State state3 = new Connectee(s);
            state3.close();
            System.out.println(barre+s.state);
            State state4 = new Fermee(s);
            state4.reset();
            System.out.println(barre+s.state);
            barre = barre + "-";
        }

    }
}
