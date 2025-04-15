import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int parametroUm = sc.nextInt();
        int parametroDois = sc.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro.");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if(parametroDois<parametroUm){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois-parametroUm;
        for(int cont = 1; cont <= contagem;cont++){
            System.out.println(cont);
        }
    }
}
