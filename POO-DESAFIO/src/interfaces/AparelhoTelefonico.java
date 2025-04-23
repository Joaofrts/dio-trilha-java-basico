package interfaces;
public interface AparelhoTelefonico {
    void ligar();

    void atender();

    default void iniciarCorreioVoz() {
        System.out.println("A ligação foi para o correio de voz.");
    }
}
