import java.util.Random;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico,NavegadorInternet,ReprodutorMusical{
    Random random = new Random();

    @Override
    public void tocar() {
        System.out.println("Iphone está tocando a musica.");
    }

    @Override
    public void pausar() {
        System.out.println("Iphone está pausando a musica.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A musica selecionada '"+musica+"' está tocando.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("O Iphone está exibindo a página "+url+" no navegador.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("O Iphone está adicionando uma nova aba ao navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("O Iphone está atualizando a página.");
    }

    private void simularChamada(int chamadasAtender) {
        System.out.println("Chamando ...\n".repeat(chamadasAtender));
        if (chamadasAtender <= 5)
            System.out.println("Ligação atendida.");
        else
            iniciarCorreioVoz();
    }
    
    @Override
    public void ligar() {
        int chamadasAtender = random.nextInt(1, 10);
        System.out.println("O Iphone está fazendo uma ligação.\n");
        simularChamada(chamadasAtender);
    }
    

    @Override
    public void atender() {

        System.out.println("O Iphone está atendendo uma ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("A ligação foi para o correio de voz.");
    }

}
