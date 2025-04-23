public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        System.out.println("Testando reprodutor musical:");
        meuIphone.selecionarMusica("When I was your man - Bruno Mars");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("\nTestando navegador:");
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

        System.out.println("\nTestando chamadas:");
        meuIphone.ligar();
        meuIphone.atender();
    }
}

