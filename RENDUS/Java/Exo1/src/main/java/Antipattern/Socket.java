package Antipattern;

public class Socket{

    private String state;

    public Socket(){
        state = "initial";
    }

    public void listen() {
        state = "ecoute";
    }

    private void read(){
        System.out.println("message dans la console");
    }

    public void accept() {
        state = "connecté";
        read();
    }

    public void close() {
        state = "fermée";
    }

    public void connect() {
        state = "connecté";
    }
}